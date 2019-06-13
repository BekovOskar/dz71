package com.bekov.receiver_user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;


@Component
public class ReceiverService {

    @Autowired
    UserRepository userRepository;

    @JmsListener(destination = "users")
    public void messageReciever(String str) throws JMSException {
        User user = new User(str);
        userRepository.save(user);
       // System.out.println(user);
    }

}
