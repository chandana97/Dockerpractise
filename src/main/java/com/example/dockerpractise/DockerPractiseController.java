package com.example.dockerpractise;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerPractiseController {

    @RequestMapping("/")
    public String home(){
        return "Welcome to Docker application practise";
    }
}
