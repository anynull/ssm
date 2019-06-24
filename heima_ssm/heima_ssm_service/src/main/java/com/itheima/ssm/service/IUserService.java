package com.itheima.ssm.service;

import com.itheima.ssm.domain.Role;
import com.itheima.ssm.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUserService extends UserDetailsService {
        /*代码提交git测验更新上传是否成功*/
    List<UserInfo> findAll();

    void save(UserInfo use);

    UserInfo findById(String id);

    List<Role> findRoleByUserId(String id);

    List<Role> findOtherRole(String id);

    void addRoleToUser(String userId, String[] roleIds);
}
