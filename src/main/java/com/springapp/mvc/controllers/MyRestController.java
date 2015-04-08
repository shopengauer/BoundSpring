package com.springapp.mvc.controllers;

import com.springapp.mvc.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Vasiliy on 08.04.2015.
 */
@RestController
@RequestMapping(value = "/resources")
public class MyRestController {

//    @RequestMapping(method = RequestMethod.GET)
//    public Map<String,Object> objectMap(){
//        Map<String,Object> model = new HashMap<String,Object>();
//        model.put("id", UUID.randomUUID().toString());
//        model.put("content", "Hello World");
//        return model;
//    }


    @RequestMapping(method = RequestMethod.GET)
    public User getStr(){

        return new User("JSON","Jackson");
    }

    @RequestMapping(value = "/home")
//    @ResponseBody
    public String home(){
//        Map<String,Object> model = new HashMap<String,Object>();
//        model.put("id", UUID.randomUUID().toString());
//        model.put("content", "Hello World");
        return "Hello from response body";
    }

}
