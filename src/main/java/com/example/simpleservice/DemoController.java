/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.simpleservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody;
/**
 *
 * @author fuser
 */
// Annotation 
@Controller
// Main class 
public class DemoController { 
  
    @RequestMapping("/hello") 
    @ResponseBody
  
    // Method 
    public String hello() 
    { 
        return "Hello World"; 
    } 
}
