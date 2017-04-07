package com.ezd.model;

import java.util.Date;

/**
 * Created by Administrator on 2017-04-06.
 */
//学校信息表
public class EzdSchmg {
    private int schmgId;
    private String schmgDomain;    // 学校网址
    private String schmgName ;     //学校名称
    private String schmgMg;        //学校详情
    private String schmgAddress;   //学校地址
    private int schmgType;         //学校性质
    private Date schmgCretime;     //学校成立时间

    public int getSchmgId() {
        return schmgId;
    }

    public void setSchmgId(int schmgId) {
        this.schmgId = schmgId;
    }

    public String getSchmgDomain() {
        return schmgDomain;
    }

    public void setSchmgDomain(String schmgDomain) {
        this.schmgDomain = schmgDomain;
    }

    public String getSchmgName() {
        return schmgName;
    }

    public void setSchmgName(String schmgName) {
        this.schmgName = schmgName;
    }

    public String getSchmgMg() {
        return schmgMg;
    }

    public void setSchmgMg(String schmgMg) {
        this.schmgMg = schmgMg;
    }

    public String getSchmgAddress() {
        return schmgAddress;
    }

    public void setSchmgAddress(String schmgAddress) {
        this.schmgAddress = schmgAddress;
    }

    public int getSchmgType() {
        return schmgType;
    }

    public void setSchmgType(int schmgType) {
        this.schmgType = schmgType;
    }

    public Date getSchmgCretime() {
        return schmgCretime;
    }

    public void setSchmgCretime(Date schmgCretime) {
        this.schmgCretime = schmgCretime;
    }

    @Override
    public String toString() {
        return "EzdSchmg{" +
                "schmgId=" + schmgId +
                ", schmgDomain='" + schmgDomain + '\'' +
                ", schmgName='" + schmgName + '\'' +
                ", schmgMg='" + schmgMg + '\'' +
                ", schmgAddress='" + schmgAddress + '\'' +
                ", schmgType=" + schmgType +
                ", schmgCretime=" + schmgCretime +
                '}';
    }
}
