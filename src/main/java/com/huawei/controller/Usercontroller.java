package com.huawei.controller;

import com.huawei.pojo.User;
import com.huawei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;


@Controller
public class Usercontroller {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<User> findAll(Model model) {
        List<User> userList = userService.findAll();
        model.addAttribute("userList", userList);
        return userList;
    }


    @RequestMapping("/userList")
    public String userList() {
        System.out.println("niubi");
        return "userList-ajax";
    }
}
