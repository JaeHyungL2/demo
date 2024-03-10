package com.ajaxtest.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")  //그냥 이렇게해두면 기본지정이면 바로 여기로 오도록.. 받도록 미리지정
    public String index() {
        return "index";  // '/'요청오면 index보여주도록 해줌.
    }

}
