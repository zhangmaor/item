package com.ezd.model;

/**
 * Created by Administrator on 2017-04-06.
 */
//学校类型表
public class EzdSchtype {
    private int schtypeId;
    private String schtypeName;  //学校类型名称

    public int getSchtypeId() {
        return schtypeId;
    }

    public void setSchtypeId(int schtypeId) {
        this.schtypeId = schtypeId;
    }

    public String getSchtypeName() {
        return schtypeName;
    }

    public void setSchtypeName(String schtypeName) {
        this.schtypeName = schtypeName;
    }

    @Override
    public String toString() {
        return "EzdSchtype{" +
                "schtypeId=" + schtypeId +
                ", schtypeName='" + schtypeName + '\'' +
                '}';
    }
}
