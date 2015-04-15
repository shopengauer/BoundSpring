package com.springapp.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Василий on 11.04.2015.
 */
@Controller
public class PathController {

    @RequestMapping(value = "/path/{name}",method = RequestMethod.GET)
    public String getName(@PathVariable(value = "name")String curName,Model model,@MatrixVariable(pathVar = "name",defaultValue = "1") String q){

       model.addAttribute("name",curName);
       model.addAttribute("q",q);
       return "displayName";
    }


}
