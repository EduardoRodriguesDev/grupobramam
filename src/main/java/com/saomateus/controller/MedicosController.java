package com.saomateus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MedicosController {

    @RequestMapping(value = "/joao-fernandes", method = RequestMethod.GET)
    public String dr1(){

        return "medicos/joao-fernandes";
    }

    @RequestMapping(value = "/marcel-lacerda", method = RequestMethod.GET)
    public String dr2(){

        return "medicos/marcel-lacerda";
    }

    @RequestMapping(value = "/sandra-fernandes", method = RequestMethod.GET)
    public String dr3(){

        return "medicos/sandra-fernandes";
    }

    @RequestMapping(value = "/julio-kong", method = RequestMethod.GET)
    public String dr4(){

        return "medicos/julio-kong";
    }

    @RequestMapping(value = "/andre-farias", method = RequestMethod.GET)
    public String dr5(){

        return "medicos/andre-farias";
    }

}
