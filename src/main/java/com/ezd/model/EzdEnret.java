package com.ezd.model;

import java.util.Date;

/**
 * Created by Administrator on 2017/4/6.
 * 招聘信息表
 */
public class EzdEnret {
    private int enretId;
    private int nretEnmg;//nret_enmg int references ezd_enmg(enmg_id),
    private int enretWantNum;//招聘人数
    private int enretType;//references ezd_retType(retType_id),--   招聘类型 （实习 兼职 全职）
    private Date enretCreTime;//发布时间
    private int enretLwMoney;//最低工资
    private int enretHgMoney;//最高工资
    private String enretPost;//招聘岗位
    private String enretPg;//待遇
    private String enretDemand;//招聘要求
    private int enretStatus;//references ezd_newsStatus(newsStatus_id)  --  信息状态,( 进行中  已结束)

    @Override
    public String toString() {
        return "EzdEnret{" +
                "enretId=" + enretId +
                ", nretEnmg=" + nretEnmg +
                ", enretWantNum=" + enretWantNum +
                ", enretType=" + enretType +
                ", enretCreTime=" + enretCreTime +
                ", enretLwMoney=" + enretLwMoney +
                ", enretHgMoney=" + enretHgMoney +
                ", enretPost='" + enretPost + '\'' +
                ", enretPg='" + enretPg + '\'' +
                ", enretDemand='" + enretDemand + '\'' +
                ", enretStatus=" + enretStatus +
                '}';
    }

    public EzdEnret() {
    }

    public int getEnretId() {

        return enretId;
    }

    public void setEnretId(int enretId) {
        this.enretId = enretId;
    }

    public int getNretEnmg() {
        return nretEnmg;
    }

    public void setNretEnmg(int nretEnmg) {
        this.nretEnmg = nretEnmg;
    }

    public int getEnretWantNum() {
        return enretWantNum;
    }

    public void setEnretWantNum(int enretWantNum) {
        this.enretWantNum = enretWantNum;
    }

    public int getEnretType() {
        return enretType;
    }

    public void setEnretType(int enretType) {
        this.enretType = enretType;
    }

    public Date getEnretCreTime() {
        return enretCreTime;
    }

    public void setEnretCreTime(Date enretCreTime) {
        this.enretCreTime = enretCreTime;
    }

    public int getEnretLwMoney() {
        return enretLwMoney;
    }

    public void setEnretLwMoney(int enretLwMoney) {
        this.enretLwMoney = enretLwMoney;
    }

    public int getEnretHgMoney() {
        return enretHgMoney;
    }

    public void setEnretHgMoney(int enretHgMoney) {
        this.enretHgMoney = enretHgMoney;
    }

    public String getEnretPost() {
        return enretPost;
    }

    public void setEnretPost(String enretPost) {
        this.enretPost = enretPost;
    }

    public String getEnretPg() {
        return enretPg;
    }

    public void setEnretPg(String enretPg) {
        this.enretPg = enretPg;
    }

    public String getEnretDemand() {
        return enretDemand;
    }

    public void setEnretDemand(String enretDemand) {
        this.enretDemand = enretDemand;
    }

    public int getEnretStatus() {
        return enretStatus;
    }

    public void setEnretStatus(int enretStatus) {
        this.enretStatus = enretStatus;
    }
}
