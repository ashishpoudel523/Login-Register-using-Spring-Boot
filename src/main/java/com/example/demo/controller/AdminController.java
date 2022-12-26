package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@CrossOrigin("http://192.168.10.70:3000")
public class AdminController {

    @RequestMapping(value = {"/admin/dashboard"}, method = RequestMethod.GET)
    public String adminHome(){
        return "admin/dashboard";
    }
}
