package com.example.hallyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/")
    public String homePage() {
        return "index";
    }

//    @GetMapping("/questionnaire")
//    public String questionnairePage() {
//        return "questionnaire";
//    }
    
    @GetMapping("/about")
    public String abt() {
        return "about";
    }
    
    @GetMapping("/swicy")
    public String tracks() {
        return "swicy";
    }
    
    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
    
    @GetMapping("/result")
    public String result() {
        return "results";
    }
    
    @GetMapping("/privacy-policy")
    public String privacypolicy() {
        return "privacy-policy";
    }
    
    @GetMapping("/terms-of-service")
    public String termofservice() {
        return "term-of-service";
    }
     
    @GetMapping("/disclaimer")
    public String disclaimer() {
        return "disclaimer";
    }
    
}