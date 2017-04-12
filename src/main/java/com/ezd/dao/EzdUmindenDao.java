package com.ezd.dao;

import com.ezd.model.EzdUminden;

import java.util.List;

/**
 * Created by Administrator on 2017/4/12.
 */
public interface EzdUmindenDao {
    /*通过用户编号ID获取该用户关注的企业*/
    public List<EzdUminden> getEnmgId(int i) throws Exception;

    /*添加一条关注信息*/
    public int add(EzdUminden ezdUminden) throws Exception;
    /*取消关注*/
    public int del(EzdUminden ezdUminden) throws Exception;
    /*检查该用户是否关注该企业
    * 这个是的作用的在用户关注企业前！！
    * */
    public int check(EzdUminden ezdUminden) throws Exception;

}
