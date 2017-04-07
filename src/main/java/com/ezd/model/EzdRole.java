package com.ezd.model;

/**
 * Created by Administrator on 2017/4/6.
 */
//角色表
public class EzdRole {

    private int roleId; //角色编号
    private String roleName; //角色名称

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }


    @Override
    public String toString() {
        return "EzdRole{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
