package com.ezd.controller;

import com.ezd.model.EzdArticle;
import com.ezd.service.EzdArticleService;
import com.ezd.utils.AjaxUtil;
import org.json.simple.JSONValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
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
     * @param response
     * @param ezdArticle
     */
    @RequestMapping(value = "/ajaxInsert",method = RequestMethod.POST)
    @ResponseBody
    public boolean insert(HttpServletResponse response, EzdArticle ezdArticle){
        boolean bl = ezdArticleService.insert(ezdArticle);
        return bl;
    }

    /**
     * 删除文章信息
     * @param response
     * @param ezdArticle
     */
    @RequestMapping(value = "/ajaxDelete",method = RequestMethod.POST)
    public boolean delete(HttpServletResponse response, EzdArticle ezdArticle){
        boolean delete = ezdArticleService.delete(ezdArticle);
        return delete;
    }

    /**
     * 更改文章信息
     * @param response
     * @param e1,e2
     * @return
     */
    @RequestMapping(value = "/ajaxUpdate",method = RequestMethod.POST)
    public boolean update(HttpServletResponse response,EzdArticle e1,EzdArticle e2){
        boolean update = ezdArticleService.update(e1, e2);
        return update;
    }


    @RequestMapping(value = "/ajaxGetArticleAll",method = RequestMethod.POST)
    public void getArticleAll(HttpServletResponse response, EzdArticle ezdArticle){
        List<EzdArticle> articleAll = ezdArticleService.getArticleAll();
        String s = JSONValue.toJSONString(articleAll);
        new AjaxUtil().renderData(response,s);
    }


}
