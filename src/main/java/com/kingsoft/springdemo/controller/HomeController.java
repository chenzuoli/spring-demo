package com.kingsoft.springdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * company: wetech
 * user: chenzuoli
 * date: 2018/11/24 8:35
 * description:
 */
@RestController
public class HomeController {
    @RequestMapping(value="/home")
    public String home(){
        System.out.println("redirect to home page!");
        return "index";
    }


    @RequestMapping(value="/home/page")
    @ResponseBody
    public ModelAndView goHome(){
        System.out.println("go to the home page!");
        ModelAndView mode = new ModelAndView();
        mode.addObject("name", "zhangsan");
        mode.setViewName("index");
        return mode;
    }

}
