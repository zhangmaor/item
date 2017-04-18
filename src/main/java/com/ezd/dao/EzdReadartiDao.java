package com.ezd.dao;

import com.ezd.model.EzdArticle;
import com.ezd.model.EzdReadarti;

import java.util.List;

/**
 * Created by Administrator on 2017-04-10.
 */
public interface EzdReadartiDao {

    //添加阅读信息
    public int insert(EzdReadarti ezdReadarti);
    //根据文章查询阅读条数
    public List<EzdReadarti> getCount(EzdArticle ezdArticle);
}
