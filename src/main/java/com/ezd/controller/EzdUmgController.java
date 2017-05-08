package com.ezd.controller;

import com.ezd.model.EzdUmg;
import com.ezd.model.EzdUsers;
import com.ezd.service.EzdUmgService;
import com.ezd.utils.Upload;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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
    public String insetAll(EzdUmg ezdUmg,Model model)throws Exception{
        int all=0;
        ezdUmg.setUmgUptime(new Date());
        all=ezdUmgService.upAll(ezdUmg);
        if(all>0){
            model.addAttribute(ezdUmg);
            return "inset";
        }
        return "error";
    }

    //获取个人页面所有的信息
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public String getAll(EzdUsers ezdUsers, Model model)throws Exception{
        List<EzdUmg> ezd;
        ezd = ezdUmgService.getAll(ezdUsers);
        if(ezd!=null){
            model.addAttribute("ezdUser",ezdUsers);
            return "umgIndex";
        }
        return "error";
    }

    //修改个人信息
    @RequestMapping(value = "update",method =  RequestMethod.POST)
    public String upAll(EzdUmg ezdUmg,Model model)throws Exception{
        int up=0;
        ezdUmg.setUmgUptime(new Date());
        up = ezdUmgService.upAll(ezdUmg);
        if (up>0){
            model.addAttribute(ezdUmg);
            return "update";
        }
        return "error";
    }
    //上传头像
    @RequestMapping(value = "upfile",method = RequestMethod.GET)
    public String upFile(String name, MultipartFile file, HttpServletRequest request, ModelMap modelMap,int type)throws Exception{
        Upload up = new Upload();
        String url = up.fildUpload(name,file,request,type);
        return url;
    }
}
