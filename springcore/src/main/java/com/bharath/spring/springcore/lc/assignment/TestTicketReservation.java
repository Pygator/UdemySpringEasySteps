package com.bharath.spring.springcore.lc.assignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTicketReservation {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/springcore/lc/assignment/ticketreservationconfig.xml");
        TicketReservation ticketReservation = (TicketReservation) context.getBean("ticketReservation");
        context.registerShutdownHook();

    }
}
