package com.example.dkr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@RestController
@Controller("*")
public class TestController2 {
	
	
    @GetMapping("/test")
    public String check()
    {
    	   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
    	   LocalDateTime now = LocalDateTime.now();  
    	   System.out.println(dtf.format(now));  
        return  "path is working and time is:"+now;
    }

	

}
