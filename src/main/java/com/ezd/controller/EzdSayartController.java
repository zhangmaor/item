package com.ezd.controller;

import com.ezd.model.EzdSayart;
import com.ezd.service.EzdSayartService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
     * 删除评论
     * @param ezdSayart
     * @return
     */
    @RequestMapping(value = "/ajaxDelete",method = RequestMethod.POST)
    @ResponseBody
    public boolean delete( EzdSayart ezdSayart){
        boolean delete = ezdSayartService.delete(ezdSayart);
        return delete;
    }

    /**
     * 管理员审核评论
     * @param ezdSayart
     * @return
     */
    @RequestMapping(value = "/ajaxUpdate",method = RequestMethod.POST)
    @ResponseBody
    public boolean update( EzdSayart ezdSayart){
        boolean update = ezdSayartService.update(ezdSayart);
        return update;
    }
}
