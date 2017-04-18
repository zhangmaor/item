package com.ezd.controller.app;

import com.ezd.validators.RigisterValiddator;
import org.springframework.stereotype.Controller;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.InitBinder;

/**
 * Created by Administrator on 2017/4/7.
 */
@Controller
public class RegisterAndLogin {
    @InitBinder
    protected void init(DataBinder binde){
        binde.setValidator(new RigisterValiddator());
    }
}
