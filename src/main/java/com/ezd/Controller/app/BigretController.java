package com.ezd.Controller.app;

import com.ezd.model.EzdBigret;
import com.ezd.service.EzdBigretService;
import com.ezd.utils.AjaxUtil;
import org.json.simple.JSONValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.persistence.SqlResultSetMapping;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2017/4/17.
 * 大招会的app相关的
 */
@Controller
@RequestMapping("/bigret")
public class BigretController {
    @Resource
    private EzdBigretService ezdBigretService;

    /**
     * 显示一个详细信息
     * @param response
     * @param id
     */
    @RequestMapping(value = "/ajaxBigret", method = RequestMethod.POST)
    @ResponseBody
    public EzdBigret get(HttpServletResponse response, int id){
        EzdBigret ezdBigret = ezdBigretService.get(id);
       return ezdBigret;
    }
    @RequestMapping(value = "/ajaxBigretList", method = RequestMethod.POST)
    @ResponseBody
    public List<EzdBigret> statusGet(int status){
        List<EzdBigret> bigretList = ezdBigretService.modeGet(status);
        return bigretList;
    }

}

