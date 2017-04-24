package com.ezd.controller.app;

import com.ezd.dao.EzdArticlDao;
import com.ezd.model.EzdArticle;
import com.ezd.model.EzdPoint;
import com.ezd.model.EzdSayart;
import com.ezd.service.EzdArticleService;
import com.ezd.service.EzdPointService;
import com.ezd.service.EzdSayartService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/4/24.
 * app文章的操作
 */
@Controller
@RequestMapping("/app_article")
public class AppArticleController {
    @Resource
    private EzdArticleService ezdArticleService;
    @Resource
    private EzdSayartService ezdSayartService;

    @Resource
    private EzdPointService ezdPointService;

    /**
     * 查询文章并按时间排序
     * @return
     */
    @RequestMapping(value = "/ajaxGetArticleAll",method = RequestMethod.POST)
    @ResponseBody
    public List<EzdArticle> getArticleAll(){
        List<EzdArticle> articleAll = ezdArticleService.getArticleAll();
        return articleAll;
    }

    /**
     * 添加评论
     * @param ezdSayart
     * @return
     */
    @RequestMapping(value = "/ajaxInsert")
    @ResponseBody
    public boolean insert( EzdSayart ezdSayart){
        boolean insert = ezdSayartService.insert(ezdSayart);
        return insert;
    }

    /**
     * 评论别人的评论
     * @param ezdSayart
     * @return
     */
    @RequestMapping(value = "/ajaxCommentOnOthers",method = RequestMethod.POST)
    @ResponseBody
    public boolean commentOnOthers( EzdSayart ezdSayart){
        boolean b = ezdSayartService.commentOnOthers(ezdSayart);
        return b;

    }


    /**
     * 添加点赞
     * @param ezdPoint
     * @return
     */
    @RequestMapping(value = "/ajaxInsert",method = RequestMethod.POST)
    @ResponseBody
    public boolean insert( EzdPoint ezdPoint){
        boolean insert = ezdPointService.insert(ezdPoint);
        return insert;
    }
}
