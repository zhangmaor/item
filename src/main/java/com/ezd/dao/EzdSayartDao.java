package com.ezd.dao;

import com.ezd.model.EzdArticle;
import com.ezd.model.EzdSayart;

import java.util.List;

/**
 * Created by Administrator on 2017-04-10.
 */
public interface EzdSayartDao {

    //添加评论
    public int insert(EzdSayart ezdSayart);
    //评论别人的评论
    public int commentOnOthers(EzdSayart ezdSayart);
    //删除评论
    public int delete(EzdSayart ezdSayart);
    //管理员审核评论
    public int update(EzdSayart ezdSayart);
    //根据文章的id查询评论
    public List<EzdSayart> getEzdSayartAll(EzdArticle ezdArticle);
}
