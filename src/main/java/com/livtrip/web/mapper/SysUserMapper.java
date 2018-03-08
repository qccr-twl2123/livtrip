package com.livtrip.web.mapper;

import com.livtrip.web.domain.SysUser;
import com.livtrip.web.domain.SysUserCriteria;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysUserMapper extends BaseMapper<SysUser, SysUserCriteria, Integer> {
}