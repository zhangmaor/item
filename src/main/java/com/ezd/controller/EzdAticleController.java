package com.ezd.controller;

import com.ezd.model.EzdArticle;
import com.ezd.model.EzdArtittype;
import com.ezd.service.EzdArticleService;
import com.ezd.utils.RandomName;
import com.ezd.utils.Upload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
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
     * /aticle/ajaxInsert
     */
    @RequestMapping(value = "/ajaxInsert",method = RequestMethod.POST)
    public String insert(EzdArticle  ezdArticle, MultipartFile file, MultipartFile file2, HttpServletRequest request){
        Upload upload = new Upload();
        String url = null;
        String url2 = null;
        try {
            url = upload.fildUpload(new RandomName().getRandom(),file,request,4);
            url2 = upload.fildUpload(new RandomName().getRandom(),file2,request,4);
        } catch (Exception e) {
            e.printStackTrace();
        }
        boolean bl =false;
        if(url!=null){
            ezdArticle.setArticleLogo(url);
            ezdArticle.setArticlePic(url2);
            ezdArticle.setArticleTime(new Date());
             bl = ezdArticleService.insert(ezdArticle);
        }
        HttpSession session = request.getSession();
        if(bl){
            session.setAttribute("articleResult",1);
        }else{
            session.setAttribute("articleResult",0);
        }
        return "redirect:/enret/index";
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

    /**
     * 更改状态
     * @param ezdArticle
     * @return
     */
    @RequestMapping(value = "/ajaxUpdateStatus",method = RequestMethod.POST)
    @ResponseBody
    public boolean updateStatus(EzdArticle ezdArticle){
        boolean b = ezdArticleService.updateStatus(ezdArticle);
        return b;
    }
        /* /aticle/getArtitTypeAll
            * */
    @RequestMapping(value = "/getArtitTypeAll",method = RequestMethod.GET)
    @ResponseBody
    public List<EzdArtittype> getType(){
        List<EzdArtittype> artitTypeAll = ezdArticleService.getArtitTypeAll();
        return artitTypeAll;
    }
}
