package com.ezd.model;

/**
 * Created by Administrator on 2017-04-06.
 */
//关注记录表
public class EzdUminden {
    private int umindenId;
    private int umindenUser;   //references ezd_umg(umg_id)谁关注的 对应用户信息
    private int umindenEn;     //references ezd_enmg(enmg_id)关注了谁 对应公司信息表

    public int getUmindenId() {
        return umindenId;
    }

    public void setUmindenId(int umindenId) {
        this.umindenId = umindenId;
    }

    public int getUmindenUser() {
        return umindenUser;
    }

    public void setUmindenUser(int umindenUser) {
        this.umindenUser = umindenUser;
    }

    public int getUmindenEn() {
        return umindenEn;
    }

    public void setUmindenEn(int umindenEn) {
        this.umindenEn = umindenEn;
    }

    @Override
    public String toString() {
        return "EzdUminden{" +
                "umindenId=" + umindenId +
                ", umindenUser=" + umindenUser +
                ", umindenEn=" + umindenEn +
                '}';
    }
}
