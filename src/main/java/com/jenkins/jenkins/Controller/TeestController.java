package com.jenkins.jenkins.Controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class TeestController {
    @GetMapping("/api/name")
    public String name(){
        return "Krishna Purohit";
    }
}
