package com.ezd.service;

import com.ezd.dao.*;
import com.ezd.model.*;
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

    @Resource
    private EzdArtittypeDao ezdArtittypeDao;
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
            List<EzdPoint> ezdPointCount = ezdPointDao.getEzdPointCount(li.getArticleId());
           try {
               EzdArtittype artittype = ezdArtittypeDao.getOne(li.getArticleType());
               li.setEzdarticleType(artittype);
           } catch (Exception e) {
               e.printStackTrace();
           }
           li.setEzdReadartis(count);
            li.setEzdSayarts(ezdSayartAll);
            li.setEzdPoints(ezdPointCount);
        }
        return list;
    }

    //根据作者或者标题查询并按时间排序
    public List<EzdArticle> getOrAll(String article){
        EzdArticle ezdArticle = new EzdArticle();
        ezdArticle.setArticleMtitle(article);
        ezdArticle.setArticleAuthor(article);
        List<EzdArticle> list = ezdArticlDao.getOrAll(ezdArticle);
        for (EzdArticle li :list) {
            List<EzdReadarti> count = ezdReadartiDao.getCount(li);
            List<EzdSayart> ezdSayartAll = ezdSayartDao.getEzdSayartAll(li);
            List<EzdPoint> ezdPointCount = ezdPointDao.getEzdPointCount(li.getArticleId());
            li.setEzdReadartis(count);
            li.setEzdSayarts(ezdSayartAll);
            li.setEzdPoints(ezdPointCount);
        }
        return list;
    }

    //根据状态查询并按时间排序
    public List<EzdArticle> getStatusAll(int status){
        List<EzdArticle> statusAll = ezdArticlDao.getStatusAll(status);
        for (EzdArticle li :statusAll) {
            List<EzdReadarti> count = ezdReadartiDao.getCount(li);
            List<EzdSayart> ezdSayartAll = ezdSayartDao.getEzdSayartAll(li);
            List<EzdPoint> ezdPointCount = ezdPointDao.getEzdPointCount(li.getArticleId());
            li.setEzdReadartis(count);
            li.setEzdSayarts(ezdSayartAll);
            li.setEzdPoints(ezdPointCount);
        }
        return statusAll;
    }


    //更改状态
    public boolean updateStatus(EzdArticle ezdArticle){
        EzdArticle articleId = ezdArticlDao.getArticleId(ezdArticle);
        if (articleId.getArticleStatus()==1){
            ezdArticle.setArticleStatus(2);
        }else {
            ezdArticle.setArticleStatus(1);
        }
        System.out.println(ezdArticle);
        int i = ezdArticlDao.updateStatus(ezdArticle);
        if (i>0){
            return true;
        }
        return false;
    }

    /**
     * 获取全部的文章类型
     * */
    public List<EzdArtittype> getArtitTypeAll(){
       List<EzdArtittype> all = null;
        try {
            all = ezdArtittypeDao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;
    }
}
