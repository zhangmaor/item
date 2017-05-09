package com.ezd.dao;

import com.ezd.model.EzdArtittype;

import java.util.List;

/**
 * Created by Administrator on 2017-04-10.
 */
public interface EzdArtittypeDao {
    //添加文章类型
    public int inserType(EzdArtittype ezdArtittype);
    public EzdArtittype getOne(int typeId)throws Exception;
    public List<EzdArtittype> getAll()throws Exception;
}
