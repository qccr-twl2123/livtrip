package com.livtrip.web.service;

import com.livtrip.web.domain.AdminUser;

/**
 * Created by xierongli on 17/6/17.
 */
public interface AdminUserService {


     Boolean queryAdminUser(String userName, String password);

}
