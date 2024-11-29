package com.ud.demobase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class DemoBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoBaseApplication.class, args);
    }

}
