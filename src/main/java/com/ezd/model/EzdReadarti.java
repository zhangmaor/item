package com.ezd.model;

import java.util.Date;

/**
 * Created by Administrator on 2017/4/6.
 * 文章阅读信息表
 */

public class EzdReadarti {
    private int readartiId;
    private int readartiArticle;//references ezd_article(article_id)哪篇文章
    private int readartiUser;//references ezd_umg(umg_id)谁阅读的
    private Date readartiTime;//阅读时间
    private EzdArticle ezdArticle;//references ezd_article(article_id)哪篇文章
    private EzdUmg ezdUmg;//references ezd_umg(umg_id)谁阅读的

    public int getReadartiId() {
        return readartiId;
    }

    public void setReadartiId(int readartiId) {
        this.readartiId = readartiId;
    }

    public int getReadartiArticle() {
        return readartiArticle;
    }

    public void setReadartiArticle(int readartiArticle) {
        this.readartiArticle = readartiArticle;
    }

    public int getReadartiUser() {
        return readartiUser;
    }

    public void setReadartiUser(int readartiUser) {
        this.readartiUser = readartiUser;
    }

    public Date getReadartiTime() {
        return readartiTime;
    }

    public void setReadartiTime(Date readartiTime) {
        this.readartiTime = readartiTime;
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
        return "EzdReadarti{" +
                "readartiId=" + readartiId +
                ", readartiArticle=" + readartiArticle +
                ", readartiUser=" + readartiUser +
                ", readartiTime=" + readartiTime +
                ", ezdArticle=" + ezdArticle +
                ", ezdUmg=" + ezdUmg +
                '}';
    }
}
