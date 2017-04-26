package com.ezd.service;

import com.ezd.dao.EzdArticlDao;
import com.ezd.dao.EzdPointDao;
import com.ezd.dao.EzdReadartiDao;
import com.ezd.dao.EzdSayartDao;
import com.ezd.model.EzdArticle;
import com.ezd.model.EzdPoint;
import com.ezd.model.EzdReadarti;
import com.ezd.model.EzdSayart;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/17.
 */
@Service
@Transactional
public class EzdArticleService {

    @Resource
    private EzdArticlDao ezdArticlDao;
    @Resource
    private EzdReadartiDao ezdReadartiDao;
    @Resource
    private EzdSayartDao ezdSayartDao;
    @Resource
    private EzdPointDao ezdPointDao;


    //添加文章信息
    public boolean insert(EzdArticle ezdArticle){

        int row = ezdArticlDao.insert(ezdArticle);
        if (row>0){
            return true;
        }
        return false;
    }
    //删除文章信息
    public boolean delete(EzdArticle ezdArticle){
        int delete = ezdArticlDao.delete(ezdArticle);
        if (delete>0){
            return true;
        }
        return false;
    }
    //更改文章信息
    public boolean update(EzdArticle e1,EzdArticle e2){
        if (e1.getArticleAuemail() == null){
            e1.setArticleAuemail(e2.getArticleAuemail());
        }else if (e1.getArticleContent() == null){
            e1.setArticleContent(e2.getArticleContent());
        }else if (e1.getArticleKeywords() == null){
            e1.setArticleKeywords(e2.getArticleKeywords());
        }else if (e1.getArticleLogo() == null){
            e1.setArticleLogo(e2.getArticleLogo());
        }else if (e1.getArticleMtitle() == null){
            e1.setArticleMtitle(e2.getArticleMtitle());
        }else if (e1.getArticlePic() == null){
            e1.setArticlePic(e2.getArticlePic());
        }else if (e1.getArticleStatus() == 0){
            e1.setArticleStatus(e2.getArticleStatus());
        }else if (e1.getArticleStitle() == null){
            e1.setArticleStitle(e2.getArticleStitle());
        }
        int update = ezdArticlDao.update(e1);
        if (update>0){
            return true;
        }
        return false;

    }
    //查询文章并按时间排序
    public List<EzdArticle> getArticleAll(){
        List<EzdArticle> list = new ArrayList<>();
        list = ezdArticlDao.getArticleAll();
       for (EzdArticle li :list) {
            List<EzdReadarti> count = ezdReadartiDao.getCount(li);
           List<EzdSayart> ezdSayartAll = ezdSayartDao.getEzdSayartAll(li);
            List<EzdPoint> ezdPointCount = ezdPointDao.getEzdPointCount(li);
            li.setEzdReadartis(count);
            li.setEzdSayarts(ezdSayartAll);
            li.setEzdPoints(ezdPointCount);
        }
        return list;
    }

}
