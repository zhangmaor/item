package com.ezd.dao;

import com.ezd.model.EzdArticle;
import com.ezd.model.EzdPoint;

import java.util.List;

/**
 * Created by Administrator on 2017-04-10.
 */
public interface EzdPointDao {

    //添加点赞
    public int insert(EzdPoint ezdPoint);
    //取消点赞
    public int update(EzdPoint ezdPoint);
    //查询点赞数量
    public List<EzdPoint> getEzdPointCount(EzdArticle ezdArticle);
    //用于判断用户是否已经点过赞
    public int isThere(EzdPoint ezdPoint);
}
