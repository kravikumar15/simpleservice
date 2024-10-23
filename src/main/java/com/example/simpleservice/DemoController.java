package com.example.simpleservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody;
/**
 *
 * @author fuser
 */
 
@Controller
public class DemoController { 

    @Value("${spring.application.name}")
    String appName;
  
    @RequestMapping("/hello") 
    @ResponseBody
     public String hello() 
    { 
        return "Hello World"; 
    } 

    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "home";
    }
}
