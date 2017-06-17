package com.livtrip.web.service.impl;

import com.livtrip.web.domain.AdminUser;
import com.livtrip.web.domain.AdminUserCriteria;
import com.livtrip.web.mapper.AdminUserMapper;
import com.livtrip.web.service.AdminUserService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xierongli on 17/6/17.
 */
@Service("adminUserService")
public class AdminUserServiceImpl implements AdminUserService {

    @Autowired
    private AdminUserMapper adminUserMapper;

    @Override
    public Boolean queryAdminUser(String userName, String password) {
        AdminUserCriteria adminUserCriteria = new AdminUserCriteria();
        adminUserCriteria.createCriteria().andUserNameEqualTo(userName).andPasswordEqualTo(password);
        List<AdminUser> adminUserList = adminUserMapper.selectByCriteria(adminUserCriteria);
        if(CollectionUtils.isNotEmpty(adminUserList)){
            return true;
        }
        return false;
    }
}
