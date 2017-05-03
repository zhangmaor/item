package com.ezd.dao;

import com.ezd.model.EzdSchmg;

import java.util.List;

/**
 * Created by Administrator on 2017-04-10.
 */
public interface EzdSchmgDao {

    public int insertSchmg(EzdSchmg ezdSchmg) throws Exception ;

    public List<EzdSchmg> findSchmg(EzdSchmg ezdSchmg) throws Exception ;

    public int updateSchmg(EzdSchmg ezdSchmg) throws Exception ;

    public List<EzdSchmg>  findAll() throws Exception ;

    public int del(int schmgId)throws Exception;
}
