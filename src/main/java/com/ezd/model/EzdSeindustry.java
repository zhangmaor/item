package com.ezd.model;

/**
 * Created by Administrator on 2017/4/9.
 * 二级行业信息表
 */
public class EzdSeindustry {
   private int  seId ; // int  primary key auto_increment,
   private String  seName; // varchar(40)

    public EzdSeindustry() {
    }

    @Override
    public String toString() {
        return "EzdSeindustry{" +
                "seId=" + seId +
                ", seName='" + seName + '\'' +
                '}';
    }

    public String getSeName() {
        return seName;
    }

    public void setSeName(String seName) {
        this.seName = seName;
    }

    public int getSeId() {

        return seId;
    }

    public void setSeId(int seId) {
        this.seId = seId;
    }
}
