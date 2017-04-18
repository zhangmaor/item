package com.ezd.controller;

import com.ezd.model.EzdPoint;
import com.ezd.service.EzdPointService;
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
@RequestMapping("/point")
public class EzdPointController {

    @Resource
    private EzdPointService ezdPointService;

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
