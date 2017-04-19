package com.ezd.dao;

import com.ezd.model.EzdSchmg;

import java.util.List;

/**
 * Created by Administrator on 2017-04-10.
 */
public interface EzdSchmgDao {

    public EzdSchmg findSchById(int schmg_id);

    public int insertSchmg(EzdSchmg ezdSchmg);

    public int updateSchmg(EzdSchmg ezdSchmg);

    public List<EzdSchmg>  findAll();
}
