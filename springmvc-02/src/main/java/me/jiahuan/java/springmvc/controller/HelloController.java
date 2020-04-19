package me.jiahuan.java.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.constraints.NotNull;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/h1")
    public String hello(Model model) {
        model.addAttribute("testMsg", "你好，世界");
        return "hello";
    }


    @GetMapping("/h2")
    public String hello2(@RequestParam(value = "name", required = false) String name, @NotNull Model model) {
        model.addAttribute("testMsg", "name = " + name);
        return "hello";
    }

    @ResponseBody
    @GetMapping("/h3")
    public String hello3() {
        return "xxxxx";
    }
}
