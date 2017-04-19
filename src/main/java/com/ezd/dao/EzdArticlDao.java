package com.ezd.dao;

import com.ezd.model.EzdArticle;

import java.util.List;

/**
 * Created by Administrator on 2017-04-10.
 */
public interface EzdArticlDao {

    //添加文章信息
    public int insert(EzdArticle ezdArticle);
    //删除文章信息
    public int delete(EzdArticle ezdArticle);
    //更改文章信息
    public int update(EzdArticle ezdArticle);
    //查询文章并按时间排序
    public List<EzdArticle> getArticleAll();

}
