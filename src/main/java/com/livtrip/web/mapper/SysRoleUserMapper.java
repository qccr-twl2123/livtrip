package com.livtrip.web.mapper;

import com.livtrip.web.domain.SysRoleUser;
import com.livtrip.web.domain.SysRoleUserCriteria;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysRoleUserMapper extends BaseMapper<SysRoleUser, SysRoleUserCriteria, Integer> {
}