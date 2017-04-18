package com.ezd.controller;

import com.ezd.model.EzdSayart;
import com.ezd.service.EzdSayartService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/4/18.
 */
@Controller
@RequestMapping("/Sayart")
public class EzdSayartController {


    @Resource
    private EzdSayartService ezdSayartService;

    /**
     * 添加评论
     * @param response
     * @param ezdSayart
     * @return
     */
    @RequestMapping(value = "/ajaxInsert")
    public boolean insert(HttpServletResponse response, EzdSayart ezdSayart){
        boolean insert = ezdSayartService.insert(ezdSayart);
        return insert;
    }

    /**
     * 评论别人的评论
     * @param response
     * @param ezdSayart
     * @return
     */
    @RequestMapping(value = "/ajaxCommentOnOthers",method = RequestMethod.POST)
    public boolean commentOnOthers(HttpServletResponse response, EzdSayart ezdSayart){
        boolean b = ezdSayartService.commentOnOthers(ezdSayart);
        return b;

    }

    /**
     * 删除评论
     * @param response
     * @param ezdSayart
     * @return
     */
    @RequestMapping(value = "/ajaxDelete",method = RequestMethod.POST)
    public boolean delete(HttpServletResponse response, EzdSayart ezdSayart){
        boolean delete = ezdSayartService.delete(ezdSayart);
        return delete;
    }

    /**
     * 管理员审核评论
     * @param response
     * @param ezdSayart
     * @return
     */
    @RequestMapping(value = "/ajaxUpdate",method = RequestMethod.POST)
    public boolean update(HttpServletResponse response, EzdSayart ezdSayart){
        boolean update = ezdSayartService.update(ezdSayart);
        return update;
    }
}
