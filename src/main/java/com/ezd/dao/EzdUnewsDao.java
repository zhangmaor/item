package com.ezd.dao;

import com.ezd.model.EzdUmg;
import com.ezd.model.EzdUnews;

import java.util.List;

/**
 * Created by Administrator on 2017-04-10.
 */
public interface EzdUnewsDao {
    public List<EzdUnews> getAll(EzdUmg ezdUmg);
}
