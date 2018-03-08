package com.livtrip.web.mapper;

import com.livtrip.web.domain.SysRole;
import com.livtrip.web.domain.SysRoleCriteria;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysRoleMapper extends BaseMapper<SysRole, SysRoleCriteria, Integer> {
}