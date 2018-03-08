package com.livtrip.web.security;


import com.google.common.collect.Lists;
import com.livtrip.web.domain.*;
import com.livtrip.web.mapper.SysRoleMapper;
import com.livtrip.web.mapper.SysRoleUserMapper;
import com.livtrip.web.mapper.SysUserMapper;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by yangyibo on 17/1/18.
 */
@Service
public class CustomUserService implements UserDetailsService { //自定义UserDetailsService 接口

    @Autowired
    SysUserMapper sysUserMapper;
    @Autowired
    SysRoleUserMapper sysRoleUserMapper;
    @Autowired
    SysRoleMapper sysRoleMapper;

    @Override
    public UserDetails loadUserByUsername(String username) {
        //重写loadUserByUsername 方法获得 userdetails 类型用户
        SysUserCriteria sysUserCriteria = new SysUserCriteria();
        sysUserCriteria.createCriteria().andUserNameEqualTo(username);
        List<SysUser> sysUserList = sysUserMapper.selectByCriteria(sysUserCriteria);
        if(CollectionUtils.isEmpty(sysUserList)){
            throw new UsernameNotFoundException("用户名不存在");
        }
        SysUser sysUser = sysUserList.get(0);

        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        //用于添加用户的权限。只要把用户权限添加到authorities 就万事大吉。
        //查询用户角色
        SysRoleUserCriteria sysRoleUserCriteria = new SysRoleUserCriteria();
        sysRoleUserCriteria.createCriteria().andSysUserIdEqualTo(sysUser.getId());
        List<SysRoleUser> sysRoleUserList = sysRoleUserMapper.selectByCriteria(sysRoleUserCriteria);
        if(CollectionUtils.isNotEmpty(sysRoleUserList)){
            List<Integer> sysRoleIds = sysRoleUserList.stream().map(SysRoleUser::getSysRoleId).collect(Collectors.toList());
            SysRoleCriteria sysRoleCriteria = new SysRoleCriteria();
            sysRoleCriteria.createCriteria().andIdIn(sysRoleIds);
            List<SysRole> sysRoleList = sysRoleMapper.selectByCriteria(sysRoleCriteria);
            if(CollectionUtils.isNotEmpty(sysRoleIds)){
                for(SysRole role : sysRoleList) {
                    authorities.add(new SimpleGrantedAuthority(role.getName()));
                    System.out.println(role.getName());
                }
            }
        }
        return new org.springframework.security.core.userdetails.User(sysUser.getUserName(),
                sysUser.getPassword(), authorities);

    }

}