package com.itheima.ssm.service;

import com.itheima.ssm.domain.Permission;
import com.itheima.ssm.domain.Role;
import com.itheima.ssm.domain.UserInfo;

import java.util.List;

public interface IRoleService {
    public List<Role> findAll();

    void save(Role role);

    Role findById(String id);

    List<Permission> findOtherPermission(String id);

    void addPermissionToRole(String roleId, String[] permissionIds);


    Role findByRoleId(String roleId);

    List<Permission> findPermissionByRoleId(String roleId);
}
