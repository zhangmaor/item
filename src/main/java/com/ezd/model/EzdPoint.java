package com.ezd.model;

/**
 * Created by Administrator on 2017/4/6.
 * 点赞信息表
 */
public class EzdPoint {
    private int pointId;
    private int pointArticle;// references ezd_article(article_id)
    private int pointUmg;//references ezd_umg(umg_id)
    private int pointTouser;//为其他用户点赞
    private int pointStatus; //状态 0 1
    private EzdArticle ezdArticle;// references ezd_article(article_id)
    private EzdUmg ezdUmg;//references ezd_umg(umg_id)

    public int getPointId() {
        return pointId;
    }

    public void setPointId(int pointId) {
        this.pointId = pointId;
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

    public int getPointTouser() {
        return pointTouser;
    }

    public void setPointTouser(int pointTouser) {
        this.pointTouser = pointTouser;
    }

    public int getPointStatus() {
        return pointStatus;
    }

    public void setPointStatus(int pointStatus) {
        this.pointStatus = pointStatus;
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
                "pointId=" + pointId +
                ", pointArticle=" + pointArticle +
                ", pointUmg=" + pointUmg +
                ", pointTouser=" + pointTouser +
                ", pointStatus=" + pointStatus +
                ", ezdArticle=" + ezdArticle +
                ", ezdUmg=" + ezdUmg +
                '}';
    }
}
