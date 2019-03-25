package com.bilibili.manage.mapper;

import org.apache.ibatis.annotations.Param;

public interface UserAdminDao {
    String queryPasswordByUsername(@Param("username") String username);
    int updatePassword(
            @Param("username")String username,
            @Param("newPwd")String newPwd,
            @Param("salt")String salt);

    String queryEmailByUsername(@Param("username") String username);
    int updateEmail(@Param("username") String username,
                    @Param("updateEmailId") String updateEmailId);


    String queryPhoneByUsername(@Param("username") String username);
    int updatePhone(@Param("username") String username,
                    @Param("newUserPhone") String newUserPhone,
                    @Param("yanzhengma") String yanzhengma);
}
