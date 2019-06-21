package com.meidi.controller;


import com.meidi.dao.pojo.TbUser;
import com.meidi.dao.pojo.ext.TbUserExt;
import com.meidi.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


@Controller
public class TestController {

    @Resource
    UserService userService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody

//    public String test() {
//        List<TbUser> users = userService.getUsers();
//        return users.get(0).getPassword() + ":" + users.get(0).getUsername();
//    }
    public TbUserExt test(){

        TbUserExt poUser = userService.getUserAndComsume(1);
        return poUser;
    }
}
