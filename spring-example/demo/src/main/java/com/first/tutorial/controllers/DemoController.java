package com.first.tutorial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.first.tutorial.daos.DemoDao;

@Controller
public class DemoController {
    @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    @ResponseBody
    public String index() {
        return "My first returned string";
    }

    @Autowired
    private DemoDao demoDao;

    @RequestMapping(value = "/home.html", method = RequestMethod.GET)
    public String home(ModelMap modelMap) {
        modelMap.addAttribute("name", demoDao.getFirstName());
        return "home.html";
    }
}
