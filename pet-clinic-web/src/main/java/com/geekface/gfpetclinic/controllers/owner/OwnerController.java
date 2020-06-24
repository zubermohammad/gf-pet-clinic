package com.geekface.gfpetclinic.controllers.owner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {
    @RequestMapping({"", "/"})
    public String listOwners(){
        return "owners/index";
    }
}
