package com.example.Nykaams;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Skincare {
    @GetMapping("/facewash")
    public String getData(){
        return  "buy one get on free";
    }
}
