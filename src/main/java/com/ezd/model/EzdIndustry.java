package com.ezd.model;

import java.util.List;

/**
 * Created by Administrator on 2017/4/9.
 * 一级行业信息表
 */
public class EzdIndustry {
    private int  in_id ; //int primary key auto_increment ,
    private String in_name ; //varchar(40)  一级行业
    private List<EzdSeindustry> ezdSeindustries;

    public int getIn_id() {
        return in_id;
    }

    public void setIn_id(int in_id) {
        this.in_id = in_id;
    }

    public String getIn_name() {
        return in_name;
    }

    public void setIn_name(String in_name) {
        this.in_name = in_name;
    }
}
