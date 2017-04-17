package com.ezd.model;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/4/6.
 * 招聘信息表
 */
public class EzdEnret {
    private int enretId;
    private EzdEnmg nretEnmg;//nret_enmg int references ezd_enmg(enmg_id),
    private int enretWantNum;//招聘人数
    private EzdRetType enretType;//references ezd_retType(retType_id),--   招聘类型 （实习 兼职 全职）
    private Date enretCreTime;//发布时间
    private int enretLwMoney;//最低工资
    private int enretHgMoney;//最高工资
    private EzdPostOne ezdPostOne; //一级招聘岗位
    private EzdPostTwo ezdPostTwo; //二级招聘岗位
    private String enretPg;//待遇
    private String enretDemand;//招聘要求
    private EzdNewsStatus enretStatus;//references ezd_newsStatus(newsStatus_id)  --  信息状态,( 进行中  已结束)
    private List<EzdErlenret> ezdErlenrets;//对应的报名信息表
    private List<EzdUmg> ezdUmgs ;//对本信息浏览的人列表



    public List<EzdUmg> getEzdUmgs() {
        return ezdUmgs;
    }

    public void setEzdUmgs(List<EzdUmg> ezdUmgs) {
        this.ezdUmgs = ezdUmgs;
    }

    public List<EzdErlenret> getEzdErlenrets() {
        return ezdErlenrets;
    }

    public void setEzdErlenrets(List<EzdErlenret> ezdErlenrets) {
        this.ezdErlenrets = ezdErlenrets;
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
                ", ezdPostOne=" + ezdPostOne +
                ", ezdPostTwo=" + ezdPostTwo +
                ", enretPg='" + enretPg + '\'' +
                ", enretDemand='" + enretDemand + '\'' +
                ", enretStatus=" + enretStatus +
                ", ezdErlenrets=" + ezdErlenrets +
                ", ezdUmgs=" + ezdUmgs +
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


    public int getEnretWantNum() {
        return enretWantNum;
    }

    public void setEnretWantNum(int enretWantNum) {
        this.enretWantNum = enretWantNum;
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

    public EzdRetType getEnretType() {
        return enretType;
    }

    public void setEnretType(EzdRetType enretType) {
        this.enretType = enretType;
    }

    public EzdNewsStatus getEnretStatus() {
        return enretStatus;
    }

    public void setEnretStatus(EzdNewsStatus enretStatus) {
        this.enretStatus = enretStatus;
    }

    public EzdEnmg getNretEnmg() {

        return nretEnmg;
    }

    public void setNretEnmg(EzdEnmg nretEnmg) {
        this.nretEnmg = nretEnmg;
    }
}
