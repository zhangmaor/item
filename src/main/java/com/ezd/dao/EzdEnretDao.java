package com.ezd.dao;

import com.ezd.model.EzdEnmg;
import com.ezd.model.EzdEnret;
import com.ezd.model.EzdRetType;

import java.util.List;

/**
 * Created by Administrator on 2017-04-10.
 */
public interface EzdEnretDao {

    //查询出所有招聘信息
    public List<EzdEnret> getAll();

    //根据enret_id查询出招聘信息
    public EzdEnret getEzdEnretAll(int enret_id);

    //根据公司id查询出本公司所有的招聘信息
    public List<EzdEnret> getOneAll(EzdEnmg ezdEnmg);

    //根据招聘类型查询出招聘信息
    public List<EzdEnret> getEnretTypeAll(int retTypeId);

    //根据工资的范围进行查询招聘信息
    public List<EzdEnret> getMoneyAll(EzdEnret ezdEnret);

    //根据企业地址查询出招聘信息
    public List<EzdEnret> getEnmgAddressAll(EzdEnmg ezdEnmg);

    //根据浏览数量进行排序查询招聘信息
    public List<EzdEnret> getCountAll();

    //根据id更改招聘信息
    public int update(EzdEnret ezdEnret);

    //根据企业删除招聘信息
    public int delete(EzdEnret ezdEnret);

    //根据企业添加招聘信息
    public int add(EzdEnret ezdEnret);
    /*根据不同的招聘信息的状态得出数量*/
    public int getcount(EzdEnret ezdEnret)throws Exception;
    /*根据类型获得数量*/
    public int getResultCount(int id) throws Exception;
}
