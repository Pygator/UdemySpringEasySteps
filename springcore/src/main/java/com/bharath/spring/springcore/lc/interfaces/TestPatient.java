package com.bharath.spring.springcore.lc.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPatient {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/springcore/lc/interfaces/patientconfig.xml");
        Patient patient = (Patient) context.getBean("patient");
        System.out.println(patient);
        context.registerShutdownHook();

    }
}
