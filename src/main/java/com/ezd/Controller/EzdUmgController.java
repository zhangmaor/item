package com.ezd.Controller;

import com.ezd.model.EzdUmg;
import com.ezd.model.EzdUsers;
import com.ezd.service.EzdUmgService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017-04-20.
 */
@Controller
@RequestMapping("umg")
public class EzdUmgController {
    @Resource
    private EzdUmgService ezdUmgService;

    //添加个人信息
    @RequestMapping(value = "/insetAll",method = RequestMethod.POST)
    public String insetAll(EzdUmg ezdUmg,Model model){
        int all=0;
        ezdUmg.setUmgUptime(new Date());
        all=ezdUmgService.insetAll(ezdUmg);
        if(all>0){
            model.addAttribute(ezdUmg);
            return "inset";
        }
        return "error";
    }

    //获取个人页面所有的信息
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public String getAll(EzdUsers ezdUsers, Model model){
        List<EzdUmg> ezd;
        ezd = ezdUmgService.getAll(ezdUsers);
        if(ezd!=null){
            model.addAttribute("ezdUser",ezdUsers);
            return "umgIndex";
        }
        return "error";
    }

    //修改个人信息
    @RequestMapping(value = "uopdate",method =  RequestMethod.POST)
    public String upAll(EzdUmg ezdUmg,Model model){
        int up=0;
        ezdUmg.setUmgUptime(new Date());
        up = ezdUmgService.upAll(ezdUmg);
        if (up>0){
            model.addAttribute(ezdUmg);
            return "update";
        }
        return "error";
    }
}
