package com.ezd.model;

/**
 * Created by Administrator on 2017/4/6.
 */
public class EzdErlenret {
    private int erlenretId;
    private int erlenretUmg;//references umg(umg_id), --  谁报名了
    private int erlenretEnret;//references enret(enret_id), --  报名的是那个招聘信息
    private int erlenretStatus;//references ezd_restatus(restatus_id) --  报名状态 (已报名 审核 录用 拒绝)

    @Override
    public String toString() {
        return "EzdErlenret{" +
                "erlenretId=" + erlenretId +
                ", erlenretUmg=" + erlenretUmg +
                ", erlenretEnret=" + erlenretEnret +
                ", erlenretStatus=" + erlenretStatus +
                '}';
    }

    public EzdErlenret() {
    }

    public int getErlenretId() {

        return erlenretId;
    }

    public void setErlenretId(int erlenretId) {
        this.erlenretId = erlenretId;
    }

    public int getErlenretUmg() {
        return erlenretUmg;
    }

    public void setErlenretUmg(int erlenretUmg) {
        this.erlenretUmg = erlenretUmg;
    }

    public int getErlenretEnret() {
        return erlenretEnret;
    }

    public void setErlenretEnret(int erlenretEnret) {
        this.erlenretEnret = erlenretEnret;
    }

    public int getErlenretStatus() {
        return erlenretStatus;
    }

    public void setErlenretStatus(int erlenretStatus) {
        this.erlenretStatus = erlenretStatus;
    }
}
