package com.example.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/hello")
    public String home() {
        logger.info("日志啊");
        return "Hello World!";
    }
}
