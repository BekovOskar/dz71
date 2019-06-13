package com.bekov.sender_user.controller;

import com.bekov.sender_user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @Autowired
    JmsTemplate jmsTemplate;



    //http://localhost:9090/send?fullName=User3&number=555123456
    @PostMapping ("/send")
    public String  sendUsers(@RequestParam("fullName") String fullName,
                             @RequestParam("number") int number){

        User user = new User(fullName,number);

        jmsTemplate.convertAndSend("users", user.toString());
        return "отправлено";

    }
}
