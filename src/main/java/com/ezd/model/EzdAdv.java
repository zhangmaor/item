package com.ezd.model;

/**
 * Created by Administrator on 2017/4/6.
 * 广告信息表
 */

public class EzdAdv {
    private int advId; //id
    private String advAddress;//广告位置
    private String advMetype;//媒体类型
    private String advType;//广告类型
    private String advTitle;//广告标题
    private String advPeople;//广告联系人
    private String advPeoway;//广告联系方式
    private String advDomain;//广告连接
    private String advStatus;//广告状态

    public int getAdvId() {
        return advId;
    }

    public void setAdvId(int advId) {
        this.advId = advId;
    }

    public String getAdvAddress() {
        return advAddress;
    }

    public void setAdvAddress(String advAddress) {
        this.advAddress = advAddress;
    }

    public String getAdvMetype() {
        return advMetype;
    }

    public void setAdvMetype(String advMetype) {
        this.advMetype = advMetype;
    }

    public String getAdvType() {
        return advType;
    }

    public void setAdvType(String advType) {
        this.advType = advType;
    }

    public String getAdvTitle() {
        return advTitle;
    }

    public void setAdvTitle(String advTitle) {
        this.advTitle = advTitle;
    }

    public String getAdvPeople() {
        return advPeople;
    }

    public void setAdvPeople(String advPeople) {
        this.advPeople = advPeople;
    }

    public String getAdvPeoway() {
        return advPeoway;
    }

    public void setAdvPeoway(String advPeoway) {
        this.advPeoway = advPeoway;
    }

    public String getAdvDomain() {
        return advDomain;
    }

    public void setAdvDomain(String advDomain) {
        this.advDomain = advDomain;
    }

    public String getAdvStatus() {
        return advStatus;
    }

    public void setAdvStatus(String advStatus) {
        this.advStatus = advStatus;
    }
}
