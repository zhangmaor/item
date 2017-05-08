package com.ezd.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/4/6.
 * 大招会
 */
//@JsonIgnoreProperties({"ezdErlbigrets"})
public class EzdBigret {
    private int bigretId;
    private String bigretLogo;//logo图片
    private String bigretTitle;//大招会标题
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date bigretTime;//大招会时间
    private int bigretAddress;//大招会地址
    private int retStatus; // 大招会消息状态的ID
    private Date bigretCreTime;//发布时间
    private String bigretDetail;//大招会详情
    private int postOne; //一级招聘岗位的id
    private int postTwo; //二级招聘岗位的id
    private int enmgId; // 公司信息的ID
    private EzdPostOne ezdPostOne; //一级招聘岗位
    private EzdPostTwo ezdPostTwo; //二级招聘岗位
    private EzdEnmg bigretEnmg;//references ezd_enmg(enmg_id)--   哪家公司发布的
    private List<EzdErlbigret> ezdErlbigrets;//报名本大招会的人的列表信息；
    private EzdSchmg ezdSchmg; // 那个学校发的大招会
    private EzdNewsStatus bigretStatus;//references ezd_newsStatus(newsStatus_id),--  大招会状态(未开始  进行中 已结束)

    public int getEnmgId() {
        return enmgId;
    }

    public void setEnmgId(int enmgId) {
        this.enmgId = enmgId;
    }

    public int getRetStatus() {
        return retStatus;
    }

    public void setRetStatus(int retStatus) {
        this.retStatus = retStatus;
    }

    public int getPostOne() {
        return postOne;
    }

    public void setPostOne(int postOne) {
        this.postOne = postOne;
    }

    public int getPostTwo() {
        return postTwo;
    }

    public void setPostTwo(int postTwo) {
        this.postTwo = postTwo;
    }

    public EzdSchmg getEzdSchmg() {
        return ezdSchmg;
    }

    public void setEzdSchmg(EzdSchmg ezdSchmg) {
        this.ezdSchmg = ezdSchmg;
    }

    @Override
    public String toString() {
        return "EzdBigret{" +
                "bigretId=" + bigretId +
                ", bigretLogo='" + bigretLogo + '\'' +
                ", bigretTitle='" + bigretTitle + '\'' +
                ", bigretTime=" + bigretTime +
                ", bigretAddress=" + bigretAddress +
                ", bigretCreTime=" + bigretCreTime +
                ", bigretDetail='" + bigretDetail + '\'' +
                '}';
    }

    public List<EzdErlbigret> getEzdErlbigrets() {
        return ezdErlbigrets;
    }

    public void setEzdErlbigrets(List<EzdErlbigret> ezdErlbigrets) {
        this.ezdErlbigrets = ezdErlbigrets;
    }

    public EzdBigret() {
    }

    public int getBigretId() {

        return bigretId;
    }

    public void setBigretId(int bigretId) {
        this.bigretId = bigretId;
    }

    public String getBigretLogo() {
        return bigretLogo;
    }

    public void setBigretLogo(String bigretLogo) {
        this.bigretLogo = bigretLogo;
    }

    public String getBigretTitle() {
        return bigretTitle;
    }

    public void setBigretTitle(String bigretTitle) {
        this.bigretTitle = bigretTitle;
    }

    public Date getBigretTime() {
        return bigretTime;
    }

    public void setBigretTime(Date bigretTime) {
        this.bigretTime = bigretTime;
    }

    public int getBigretAddress() {
        return bigretAddress;
    }

    public void setBigretAddress(int bigretAddress) {
        this.bigretAddress = bigretAddress;
    }

    public Date getBigretCreTime() {
        return bigretCreTime;
    }

    public void setBigretCreTime(Date bigretCreTime) {
        this.bigretCreTime = bigretCreTime;
    }

    public String getBigretDetail() {
        return bigretDetail;
    }

    public void setBigretDetail(String bigretDetail) {
        this.bigretDetail = bigretDetail;
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

    public EzdNewsStatus getBigretStatus() {
        return bigretStatus;
    }

    public void setBigretStatus(EzdNewsStatus bigretStatus) {
        this.bigretStatus = bigretStatus;
    }

    public EzdEnmg getBigretEnmg() {
        return bigretEnmg;
    }

    public void setBigretEnmg(EzdEnmg bigretEnmg) {
        this.bigretEnmg = bigretEnmg;
    }
}
