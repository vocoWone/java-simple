package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class RouteController {

    @RequestMapping("/")
    public ModelAndView route(){
        return new ModelAndView("index");
    }
}
