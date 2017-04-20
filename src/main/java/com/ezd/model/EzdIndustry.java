package com.ezd.model;

import java.util.List;

/**
 * Created by Administrator on 2017/4/9.
 * 一级行业信息表
 */
public class EzdIndustry {
    private int  inId ; //int primary key auto_increment ,
    private String inName ; //varchar(40)  一级行业
    private List<EzdSeindustry> ezdSeindustries;



    @Override
    public String toString() {
        return "EzdIndustry{" +
                "inId=" + inId +
                ", inName='" + inName + '\'' +
                ", ezdSeindustries=" + ezdSeindustries +
                '}';
    }

    public int getInId() {
        return inId;
    }

    public void setInId(int inId) {
        this.inId = inId;
    }

    public String getInName() {
        return inName;
    }

    public void setInName(String inName) {
        this.inName = inName;
    }

    public List<EzdSeindustry> getEzdSeindustries() {
        return ezdSeindustries;
    }

    public void setEzdSeindustries(List<EzdSeindustry> ezdSeindustries) {
        this.ezdSeindustries = ezdSeindustries;
    }
}
