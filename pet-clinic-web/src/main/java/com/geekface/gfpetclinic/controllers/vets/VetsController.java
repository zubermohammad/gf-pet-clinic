package com.geekface.gfpetclinic.controllers.vets;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
public class VetsController {

    @RequestMapping({"", "/"})
    public String listVets(){
        return "vets/index";
    }
}
