package com.bekov.sender_user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SenderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SenderUserApplication.class, args);
    }

}
