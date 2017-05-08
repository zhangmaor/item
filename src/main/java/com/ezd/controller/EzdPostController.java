package com.ezd.controller;

import com.ezd.model.EzdPostOne;
import com.ezd.model.EzdPostTwo;
import com.ezd.service.EzdPostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2017/4/24.
 */
@Controller
@RequestMapping("post")
public class EzdPostController {

    @Resource
    private EzdPostService ezdPostService;

    /**
     * 查询出所有的一级岗位/post/ajaxFindPostOne
     * @return
     */
    @RequestMapping(value = "/ajaxFindPostOne",method = RequestMethod.GET)
    @ResponseBody
    public List<EzdPostOne> findPostOne() throws Exception {
        List<EzdPostOne> list = ezdPostService.findPostOne();
        return list;
    }

    /**
     * 根据一级岗位查询出二级岗位/post/ajaxGetPostTwo
     * @param
     * @return
     */
    @RequestMapping(value = "/ajaxGetPostTwo",method = RequestMethod.GET)
    @ResponseBody
    public List<EzdPostTwo> getPostTwo(int pone_id){
        List<EzdPostTwo> list = ezdPostService.getPostTwo(pone_id);
        return list;
    }

}
