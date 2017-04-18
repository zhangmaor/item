package com.ezd.dao;

import com.ezd.model.EzdAdv;

import java.util.List;

/**
 * Created by Administrator on 2017-04-10.
 */
public interface EzdAdvDao {

    //添加广告
    public void insert(EzdAdv ezdAdv);

    //删除广告
    public void delete(EzdAdv ezdAdv);

    //查询所有广告
    public List<EzdAdv> getAll();

    //根据id更改广告的状态
    public void updateAdvStatus(EzdAdv ezdAdv);



}
