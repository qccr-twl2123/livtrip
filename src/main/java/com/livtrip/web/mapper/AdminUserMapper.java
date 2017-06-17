package com.livtrip.web.mapper;

import com.livtrip.web.domain.AdminUser;
import com.livtrip.web.domain.AdminUserCriteria;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminUserMapper extends BaseMapper<AdminUser, AdminUserCriteria, Integer> {
}