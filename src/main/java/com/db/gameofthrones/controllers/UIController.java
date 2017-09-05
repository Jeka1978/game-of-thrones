package com.db.gameofthrones.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * Created by Evegeny on 05/09/2017.
 */
@Controller
@RequestMapping("/api")
public class UIController {
    @Autowired
    private HttpServletRequest request;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name, ModelMap modelMap) {
        modelMap.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/hello/exam")
    public String handle() {
        return "OK";
    }



}
