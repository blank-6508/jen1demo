package com.example.demo.Controller;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
    @GetMapping("/")
    public String Home(){
        return "home.html";
    }  

}
