package com.saomateus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){

        return "index";
    }

    @RequestMapping(value = "/exames", method = RequestMethod.GET)
    public String servicos(){

        return "services";
    }

    @RequestMapping(value = "/procedimentos", method = RequestMethod.GET)
    public String procedimentos(){

        return "departments-single";
    }
}
