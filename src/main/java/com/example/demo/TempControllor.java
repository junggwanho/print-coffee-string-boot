package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TempControllor{

    @GetMapping("/coffee")
    public ModelAndView coffe(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("coffee", "아메리카노");
        modelAndView.setViewName("coffee");

        return modelAndView;
    }

    
}