package com.ezd.model;

import java.util.Date;
import java.util.List;

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
    private int enretPostOne;//一级招聘岗位
    private int enretPostTwo;//二级招聘岗位
    private String enretPg;//待遇
    private String enretDemand;//招聘要求
    private int enretStatus;//references ezd_newsStatus(newsStatus_id)
    private EzdPostOne ezdPostOne; //一级招聘岗位
    private EzdPostTwo ezdPostTwo; //二级招聘岗位
    private EzdRetType ezdRetType;//references ezd_retType(retType_id),--   招聘类型
    private EzdEnmg ezdEnmg;//nret_enmg int references ezd_enmg(enmg_id),
    private EzdNewsStatus ezdNewsStatus;//references ezd_newsStatus(newsStatus_id)  --  信息状态,( 进行中  已结束)
    private List<EzdErlenret> ezdErlenrets;//对应的报名信息表
    private List<EzdUmg> ezdUmgs ;//对本信息浏览的人列表


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

    public int getEnretPostOne() {
        return enretPostOne;
    }

    public void setEnretPostOne(int enretPostOne) {
        this.enretPostOne = enretPostOne;
    }

    public int getEnretPostTwo() {
        return enretPostTwo;
    }

    public void setEnretPostTwo(int enretPostTwo) {
        this.enretPostTwo = enretPostTwo;
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

    public EzdPostOne getEzdPostOne() {
        return ezdPostOne;
    }

    public void setEzdPostOne(EzdPostOne ezdPostOne) {
        this.ezdPostOne = ezdPostOne;
    }

    public EzdPostTwo getEzdPostTwo() {
        return ezdPostTwo;
    }

    public void setEzdPostTwo(EzdPostTwo ezdPostTwo) {
        this.ezdPostTwo = ezdPostTwo;
    }

    public EzdRetType getEzdRetType() {
        return ezdRetType;
    }

    public void setEzdRetType(EzdRetType ezdRetType) {
        this.ezdRetType = ezdRetType;
    }

    public EzdEnmg getEzdEnmg() {
        return ezdEnmg;
    }

    public void setEzdEnmg(EzdEnmg ezdEnmg) {
        this.ezdEnmg = ezdEnmg;
    }

    public EzdNewsStatus getEzdNewsStatus() {
        return ezdNewsStatus;
    }

    public void setEzdNewsStatus(EzdNewsStatus ezdNewsStatus) {
        this.ezdNewsStatus = ezdNewsStatus;
    }

    public List<EzdErlenret> getEzdErlenrets() {
        return ezdErlenrets;
    }

    public void setEzdErlenrets(List<EzdErlenret> ezdErlenrets) {
        this.ezdErlenrets = ezdErlenrets;
    }

    public List<EzdUmg> getEzdUmgs() {
        return ezdUmgs;
    }

    public void setEzdUmgs(List<EzdUmg> ezdUmgs) {
        this.ezdUmgs = ezdUmgs;
    }

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
                ", enretPostOne=" + enretPostOne +
                ", enretPostTwo=" + enretPostTwo +
                ", enretPg='" + enretPg + '\'' +
                ", enretDemand='" + enretDemand + '\'' +
                ", enretStatus=" + enretStatus +
                ", ezdPostOne=" + ezdPostOne +
                ", ezdPostTwo=" + ezdPostTwo +
                ", ezdRetType=" + ezdRetType +
                ", ezdEnmg=" + ezdEnmg +
                ", ezdNewsStatus=" + ezdNewsStatus +
                ", ezdErlenrets=" + ezdErlenrets +
                ", ezdUmgs=" + ezdUmgs +
                '}';
    }
}
