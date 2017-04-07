package com.ezd.model;

/**
 * Created by Administrator on 2017/4/6.
 */
public class EzdEnretBrowse {
   private int browseId;
   private int browseUser;//references ezd_umg(umg_id),--   谁浏览的 对应用户信息
   private int browseEn;//references ezd_enret(enret_id)--   浏览的信息 对应 招聘信息

    @Override
    public String toString() {
        return "EzdEnretBrowse{" +
                "browseId=" + browseId +
                ", browseUser=" + browseUser +
                ", browseEn=" + browseEn +
                '}';
    }

    public EzdEnretBrowse() {
    }

    public int getBrowseId() {

        return browseId;
    }

    public void setBrowseId(int browseId) {
        this.browseId = browseId;
    }

    public int getBrowseUser() {
        return browseUser;
    }

    public void setBrowseUser(int browseUser) {
        this.browseUser = browseUser;
    }

    public int getBrowseEn() {
        return browseEn;
    }

    public void setBrowseEn(int browseEn) {
        this.browseEn = browseEn;
    }
}
