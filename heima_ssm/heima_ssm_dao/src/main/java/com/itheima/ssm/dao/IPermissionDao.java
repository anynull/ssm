package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Permission;
import com.itheima.ssm.domain.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IPermissionDao {
    @Select("select * from permission where id in (select permissionId from role_permission where roleId =#{id})")
    public List<Permission> findPermissionByRoleId(String id);

    @Select("select * from permission")
    public List<Permission> finAll();

    @Select("insert into permission (permissionName,url) values (#{permissionName},#{url})")
    public void save(Permission permission);
}
