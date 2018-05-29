package com.bharath.spring.springcore.lc.assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {

    @PostConstruct
    public void initialize() {
        System.out.println("Inside Initialize Method");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Inside Cleanup Method");
    }
}
