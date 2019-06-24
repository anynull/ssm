package com.itheima.ssm.service;

import com.itheima.ssm.domain.Role;
import com.itheima.ssm.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUserService extends UserDetailsService {
        
    List<UserInfo> findAll();

    void save(UserInfo use);

    UserInfo findById(String id);

    List<Role> findRoleByUserId(String id);

    List<Role> findOtherRole(String id);

    void addRoleToUser(String userId, String[] roleIds);
}
