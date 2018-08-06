package com.study.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by acer on 2018/8/6.
 */
@Controller
public class HomeController {
    private Logger logger= LoggerFactory.getLogger(HomeController.class);
    @RequestMapping("/home")
    public String Home(){
        logger.debug("Hello Springmvc");
        return "home";

    }
}
