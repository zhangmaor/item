package com.ezd.model;

/**
 * Created by Administrator on 2017/4/6.
 */
public class EzdErlenret {
    private int erlenretId;
    private EzdUmg erlenretUmg;//references umg(umg_id), --  谁报名了
    private EzdEnret erlenretEnret;//references enret(enret_id), --  报名的是那个招聘信息
    private EzdRestatus erlenretStatus;//references ezd_restatus(restatus_id) --  报名状态 (已报名 审核 录用 拒绝)

    public EzdErlenret() {
    }

    public int getErlenretId() {

        return erlenretId;
    }

    public void setErlenretId(int erlenretId) {
        this.erlenretId = erlenretId;
    }

    @Override
    public String toString() {
        return "EzdErlenret{" +
                "erlenretId=" + erlenretId +
                ", erlenretUmg=" + erlenretUmg +
                ", erlenretEnret=" + erlenretEnret +
                ", erlenretStatus=" + erlenretStatus +
                '}';
    }

    public EzdUmg getErlenretUmg() {
        return erlenretUmg;
    }

    public void setErlenretUmg(EzdUmg erlenretUmg) {
        this.erlenretUmg = erlenretUmg;
    }

    public EzdEnret getErlenretEnret() {
        return erlenretEnret;
    }

    public void setErlenretEnret(EzdEnret erlenretEnret) {
        this.erlenretEnret = erlenretEnret;
    }

    public EzdRestatus getErlenretStatus() {
        return erlenretStatus;
    }

    public void setErlenretStatus(EzdRestatus erlenretStatus) {
        this.erlenretStatus = erlenretStatus;
    }
}
