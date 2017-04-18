package com.ezd.controller;

import com.ezd.model.EzdReadarti;
import com.ezd.service.EzdReadartiService;
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
@RequestMapping("/Readarti")
public class EzdReadartiController {

    @Resource
    private EzdReadartiService ezdReadartiService;

    /**
     * 添加阅读信息
     * @param ezdReadarti
     * @return
     */
    @RequestMapping(value = "/ajaxInsert",method = RequestMethod.POST)
    @ResponseBody
    public boolean insert( EzdReadarti ezdReadarti){
        boolean insert = ezdReadartiService.insert(ezdReadarti);
        return insert;

    }
}
