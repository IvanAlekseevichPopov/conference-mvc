package com.pluralsight.conference.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class Mailer {

    @Async
    public void sendMail() {
        System.out.println("test before");

        try {
            //Heavy async task imitation
            Thread.sleep(5000L);
        } catch (InterruptedException exception) {
            System.out.println("Interrupted");
        }

        System.out.println("test after");
    }
}
