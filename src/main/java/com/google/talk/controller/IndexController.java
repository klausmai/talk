package com.google.talk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create by klaus
 */
@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(@RequestParam(name="name") String name,Model model){
        model.addAttribute("name",name);
        return "index";
    }
}
