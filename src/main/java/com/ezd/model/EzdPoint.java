package com.ezd.model;

/**
 * Created by Administrator on 2017/4/6.
 * 点赞信息表
 */
public class EzdPoint {
    private int pintId;
    private int pointArticle;// references ezd_article(article_id)
    private int pointUmg;//references ezd_umg(umg_id)
    private int pintTouser;//为其他用户点赞
    private int poingStatus; //状态 0 1
    private EzdArticle ezdArticle;// references ezd_article(article_id)
    private EzdUmg ezdUmg;//references ezd_umg(umg_id)

    public int getPintId() {
        return pintId;
    }

    public void setPintId(int pintId) {
        this.pintId = pintId;
    }

    public int getPointArticle() {
        return pointArticle;
    }

    public void setPointArticle(int pointArticle) {
        this.pointArticle = pointArticle;
    }

    public int getPointUmg() {
        return pointUmg;
    }

    public void setPointUmg(int pointUmg) {
        this.pointUmg = pointUmg;
    }

    public int getPintTouser() {
        return pintTouser;
    }

    public void setPintTouser(int pintTouser) {
        this.pintTouser = pintTouser;
    }

    public int getPoingStatus() {
        return poingStatus;
    }

    public void setPoingStatus(int poingStatus) {
        this.poingStatus = poingStatus;
    }

    public EzdArticle getEzdArticle() {
        return ezdArticle;
    }

    public void setEzdArticle(EzdArticle ezdArticle) {
        this.ezdArticle = ezdArticle;
    }

    public EzdUmg getEzdUmg() {
        return ezdUmg;
    }

    public void setEzdUmg(EzdUmg ezdUmg) {
        this.ezdUmg = ezdUmg;
    }

    @Override
    public String toString() {
        return "EzdPoint{" +
                "pintId=" + pintId +
                ", pointArticle=" + pointArticle +
                ", pointUmg=" + pointUmg +
                ", pintTouser=" + pintTouser +
                ", poingStatus=" + poingStatus +
                ", ezdArticle=" + ezdArticle +
                ", ezdUmg=" + ezdUmg +
                '}';
    }
}
