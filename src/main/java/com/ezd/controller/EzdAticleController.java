package com.ezd.controller;

import com.ezd.model.EzdArticle;
import com.ezd.service.EzdArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/4/17.
 */
@Controller
@RequestMapping("/aticle")
public class EzdAticleController {

    @Resource
    private EzdArticleService ezdArticleService;

    /**
     * 添加文章信息
     * @param ezdArticle
     */
    @RequestMapping(value = "/ajaxInsert",method = RequestMethod.POST)
    @ResponseBody
    public boolean insert( EzdArticle ezdArticle){
        boolean bl = ezdArticleService.insert(ezdArticle);
        return bl;
    }

    /**
     * 删除文章信息
     * @param ezdArticle
     */
    @RequestMapping(value = "/ajaxDelete",method = RequestMethod.POST)
    @ResponseBody
    public boolean delete( EzdArticle ezdArticle){
        boolean delete = ezdArticleService.delete(ezdArticle);
        return delete;
    }

    /**
     * 更改文章信息
     * @param e1,e2
     * @return
     */
    @RequestMapping(value = "/ajaxUpdate",method = RequestMethod.POST)
    @ResponseBody
    public boolean update(EzdArticle e1,EzdArticle e2){
        boolean update = ezdArticleService.update(e1, e2);
        return update;
    }


    /**
     * 查询文章并按时间排序
     * @return
     */
    @RequestMapping(value = "/ajaxGetArticleAll",method = RequestMethod.GET)
    @ResponseBody
    public List<EzdArticle> getArticleAll(){
        List<EzdArticle> articleAll = ezdArticleService.getArticleAll();
        return articleAll;
    }

    /**
     * 根据作者或者标题查询并按时间排序
     * @param article
     * @return
     */
    @RequestMapping(value = "/ajaxGetOrAll",method = RequestMethod.POST)
    @ResponseBody
    public List<EzdArticle> getOrAll(String article){
        System.out.println(article);
        List<EzdArticle> orAll = ezdArticleService.getOrAll(article);
        return orAll;
    }


    /**
     * 根据状态查询并按时间排序
     * @param status
     * @return
     */
    @RequestMapping(value = "/ajaxGetStatusAll",method = RequestMethod.POST)
    @ResponseBody
    public List<EzdArticle> getStatusAll(int status){
        List<EzdArticle> statusAll = ezdArticleService.getStatusAll(status);
        return statusAll;

    }

}
