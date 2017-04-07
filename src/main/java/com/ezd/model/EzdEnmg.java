package com.ezd.model;

import java.util.Date;

/**
 * Created by Administrator on 2017/4/6.
 */
//企业信息表
public class EzdEnmg {

    private int enmgId ;
    private String enmgLogo ;
    private String enmgName ;//名称
    private String enmgDomain ;//公司网址
    private String enmgUser ;//联系人
    private String enmgWcontact ;//联系方式
    private String enmgDetail ;//公司详情
    private String enmgAddress ;//公司地址
    private int enmgType ;  //references ezd_entype(entype_id),--企业类型
    private String enmgScale ;//公司规模
    private Date enmgCretime ; //公司成立时间

    public int getEnmgId() {
        return enmgId;
    }

    public void setEnmgId(int enmgId) {
        this.enmgId = enmgId;
    }

    public String getEnmgLogo() {
        return enmgLogo;
    }

    public void setEnmgLogo(String enmgLogo) {
        this.enmgLogo = enmgLogo;
    }

    public String getEnmgName() {
        return enmgName;
    }

    public void setEnmgName(String enmgName) {
        this.enmgName = enmgName;
    }

    public String getEnmgDomain() {
        return enmgDomain;
    }

    public void setEnmgDomain(String enmgDomain) {
        this.enmgDomain = enmgDomain;
    }

    public String getEnmgUser() {
        return enmgUser;
    }

    public void setEnmgUser(String enmgUser) {
        this.enmgUser = enmgUser;
    }

    public String getEnmgWcontact() {
        return enmgWcontact;
    }

    public void setEnmgWcontact(String enmgWcontact) {
        this.enmgWcontact = enmgWcontact;
    }

    public String getEnmgDetail() {
        return enmgDetail;
    }

    public void setEnmgDetail(String enmgDetail) {
        this.enmgDetail = enmgDetail;
    }

    public String getEnmgAddress() {
        return enmgAddress;
    }

    public void setEnmgAddress(String enmgAddress) {
        this.enmgAddress = enmgAddress;
    }

    public int getEnmgType() {
        return enmgType;
    }

    public void setEnmgType(int enmgType) {
        this.enmgType = enmgType;
    }

    public String getEnmgScale() {
        return enmgScale;
    }

    public void setEnmgScale(String enmgScale) {
        this.enmgScale = enmgScale;
    }

    public Date getEnmgCretime() {
        return enmgCretime;
    }

    public void setEnmgCretime(Date enmgCretime) {
        this.enmgCretime = enmgCretime;
    }

    @Override
    public String toString() {
        return "EzdEnmg{" +
                "enmgId=" + enmgId +
                ", enmgLogo='" + enmgLogo + '\'' +
                ", enmgName='" + enmgName + '\'' +
                ", enmgDomain='" + enmgDomain + '\'' +
                ", enmgUser='" + enmgUser + '\'' +
                ", enmgWcontact='" + enmgWcontact + '\'' +
                ", enmgDetail='" + enmgDetail + '\'' +
                ", enmgAddress='" + enmgAddress + '\'' +
                ", enmgType=" + enmgType +
                ", enmgScale='" + enmgScale + '\'' +
                ", enmgCretime=" + enmgCretime +
                '}';
    }
}
