package com.bilibili.manage.service;

public interface UserAdminService {
    int updatePassword(String pwd,
                       String newPwd,String cfgPwd);

    int updateEmail(String emailId, String updateEmailId);

    int updatePhone(String userPhone, String newUserPhone, String yanzhengma);
}
