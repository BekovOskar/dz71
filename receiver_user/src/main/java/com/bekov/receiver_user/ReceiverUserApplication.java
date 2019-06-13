package com.bekov.receiver_user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class ReceiverUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReceiverUserApplication.class, args);
    }

}
