package org.iesdm.pipeline_spring_boot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Controller
@RestController
public class HelloControler {

    @GetMapping("/hello")
    public String hello(){
        return "Hola desde mi primer PipeLine con Spring Boot!!";
    }
}
