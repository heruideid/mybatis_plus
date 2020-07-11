package com.nostalgia.mybatis_plus.controller;


import com.nostalgia.mybatis_plus.entity.User;
import com.nostalgia.mybatis_plus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author nostalgia
 * @since 2020-07-11
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/index")
    public String index(Model model){
        List<User> list=userService.list();
        model.addAttribute("list",list);
        return "index";
    }
}

