package com.menagit.demooauth2.basicApi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/basic")
public class BasicAuth {
    
    @GetMapping("/hello")
    public String greeting(@RequestParam String name) {
        return "Hello "+ name ;
    }    

}
