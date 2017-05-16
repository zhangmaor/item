package com.ezd.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

/**
 * Created by Administrator on 2017/4/6.
 */
public class EzdErlenret {
    @Override
    public String toString() {
        return "EzdErlenret{" +
                "erlenretId=" + erlenretId +
                ", erlenretUmg=" + erlenretUmg +
                ", erlenretEnret=" + erlenretEnret +
                ", erlenretStatus=" + erlenretStatus +
                ", rettime=" + rettime +
                '}';
    }
    private int erlenretId;
    private int erlenretUmg;//references umg(umg_id)
    private int erlenretEnret;//references enret(enret_id),
    private int erlenretStatus;//references ezd_restatus(restatus_id)
    private EzdUmg ezdUmg;//references umg(umg_id), --  谁报名了
    private EzdEnret ezdEnret;//references enret(enret_id), --  报名的是那个招聘信息
    private Date rettime; // Datetime DEFAULT CURRENT_TIMESTAMP  , -- 报名时间
    private EzdRestatus ezdRestatus;//references ezd_restatus(restatus_id) --  报名状态 (已报名 审核 录用 拒绝)
    public EzdErlenret() {
    }

    public Date getRettime() {
        return rettime;
    }

    public void setRettime(Date rettime) {
        this.rettime = rettime;
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

    public EzdUmg getEzdUmg() {
        return ezdUmg;
    }

    public void setEzdUmg(EzdUmg ezdUmg) {
        this.ezdUmg = ezdUmg;
    }

    public EzdEnret getEzdEnret() {
        return ezdEnret;
    }

    public void setEzdEnret(EzdEnret ezdEnret) {
        this.ezdEnret = ezdEnret;
    }

    public EzdRestatus getEzdRestatus() {
        return ezdRestatus;
    }

    public void setEzdRestatus(EzdRestatus ezdRestatus) {
        this.ezdRestatus = ezdRestatus;
    }

}
