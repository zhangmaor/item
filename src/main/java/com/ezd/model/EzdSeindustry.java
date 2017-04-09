package com.ezd.model;

/**
 * Created by Administrator on 2017/4/9.
 * 二级行业信息表
 */
public class EzdSeindustry {
   private int  se_id ; // int  primary key auto_increment,
   private String  se_name; // varchar(40)

    public int getSe_id() {
        return se_id;
    }

    public void setSe_id(int se_id) {
        this.se_id = se_id;
    }

    public String getSe_name() {
        return se_name;
    }

    public void setSe_name(String se_name) {
        this.se_name = se_name;
    }
}
