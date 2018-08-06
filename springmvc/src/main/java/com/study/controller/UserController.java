package com.study.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by acer on 2018/8/6.
 */
@Controller
@RequestMapping("/users")
public class UserController {
    private Logger logger= LoggerFactory.getLogger(HomeController.class);
    @RequestMapping(value = "/{id:\\d+}",method = RequestMethod.GET )
    public String show(@PathVariable Integer id ){
        logger.debug("ID {}"+id);
        return "user/show";
    }

}
