package com.ezd.model;

/**
 * Created by Administrator on 2017/4/6.
 */
//用户角色关系表
public class EzdRoleUser {

    private int uperId;
    private int uperRole; //int references ezd_role(role_id),
    private int uperUmg; //int references ezd_umg(umg_id)

    public int getUperId() {
        return uperId;
    }

    public void setUperId(int uperId) {
        this.uperId = uperId;
    }

    public int getUperRole() {
        return uperRole;
    }

    public void setUperRole(int uperRole) {
        this.uperRole = uperRole;
    }

    public int getUperUmg() {
        return uperUmg;
    }

    public void setUperUmg(int uperUmg) {
        this.uperUmg = uperUmg;
    }

    @Override
    public String toString() {
        return "EzdRoleUser{" +
                "uperId=" + uperId +
                ", uperRole=" + uperRole +
                ", uperUmg=" + uperUmg +
                '}';
    }
}
