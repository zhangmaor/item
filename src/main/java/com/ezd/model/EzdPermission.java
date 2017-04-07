package com.ezd.model;

/**
 * Created by Administrator on 2017/4/6.
 */
//权限表
public class EzdPermission {

    private int perId; //权限编号
    private String perName; //权限名称

    public int getPerId() {
        return perId;
    }

    public void setPerId(int perId) {
        this.perId = perId;
    }

    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName;
    }

    @Override
    public String toString() {
        return "EzdPermission{" +
                "perId=" + perId +
                ", perName='" + perName + '\'' +
                '}';
    }
}
