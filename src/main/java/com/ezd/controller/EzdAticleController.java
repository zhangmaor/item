package com.ezd.Controller;

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
    @RequestMapping(value = "/ajaxGetArticleAll",method = RequestMethod.POST)
    @ResponseBody
    public List<EzdArticle> getArticleAll(){
        List<EzdArticle> articleAll = ezdArticleService.getArticleAll();
        return articleAll;
    }


}
