package com.ezd.model;

/**
 * Created by Administrator on 2017/4/6.
 */

//角色权限关系表
public class EzdTolePermission {

    private int roperId;
    private int roperRole; //references ezd_role(role_id),
    private int reperPerm; //references ezd_permission(per_id)

    public int getRoperId() {
        return roperId;
    }

    public void setRoperId(int roperId) {
        this.roperId = roperId;
    }

    public int getRoperRole() {
        return roperRole;
    }

    public void setRoperRole(int roperRole) {
        this.roperRole = roperRole;
    }

    public int getReperPerm() {
        return reperPerm;
    }

    public void setReperPerm(int reperPerm) {
        this.reperPerm = reperPerm;
    }

    @Override
    public String toString() {
        return "EzdTolePermission{" +
                "roperId=" + roperId +
                ", roperRole=" + roperRole +
                ", reperPerm=" + reperPerm +
                '}';
    }
}
