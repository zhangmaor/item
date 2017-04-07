package com.ezd.Controller;

import com.ezd.validators.RigisterValiddator;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.InitBinder;

/**
 * Created by Administrator on 2017/4/7.
 */
public class RegisterAndLogin {
    @InitBinder
    protected void init(DataBinder binde){
        binde.setValidator(new RigisterValiddator());
    }
}
