package com.geekface.gfpetclinic.controllers.pets;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pets")
public class PetsController {

    @RequestMapping({"", "/"})
    public String listPets(){
        return "pets/index";
    }
}
