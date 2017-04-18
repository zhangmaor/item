package com.ezd.Controller.background;

import com.ezd.model.EzdBigret;
import com.ezd.service.EzdBigretService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/4/17.
 */
@Controller
@RequestMapping("/bg")
public class BgBigret {
    @Resource
    private EzdBigretService ezdBigretService;
    /**
     * 进入大招会列表页面
     */
    @RequestMapping("/bigret")
    public String displayBigret(){
        List<EzdBigret> bigretList = ezdBigretService.modeGet(0);//这个有问题吧！！！
        return "indexText";
    }
    /**
     * 点击其中一个大招会信息
     * 进入大招会详情
     *
     */
    @RequestMapping("/bigretDetail")
    public String datail(int id){
        EzdBigret ezdBigret = ezdBigretService.get(id);
        return "bigret";
    }
    /**
     * 点击修改
     * 进入修改页面
     */
    @RequestMapping("/updateBigret")
    public String update(int id){
        EzdBigret ezdBigret = ezdBigretService.get(id);
        return "";
    }

    /**
     * 提交修改的数据
     * 看返回值
     * @param
     * @param ezdBigret
     * @param id
     */

    @RequestMapping("/actionUpdate")
    @ResponseBody
    public boolean actionUp(EzdBigret ezdBigret, int id){
        boolean update = ezdBigretService.update(ezdBigret, id);
        return update;
    }

    /**
     * 进入添加页面
     * @return
     */
    @RequestMapping("/insert")
    public String getAdd(){
        return "";
    }

    /**
     * 提交添加页面
     * @param ezdBigret
     * @return
     */
    @RequestMapping("/actionInsert")
    public String add(EzdBigret ezdBigret, Model model){
        boolean add = ezdBigretService.add(ezdBigret);
        model.addAttribute("result",add);
        return "";
    }
}
