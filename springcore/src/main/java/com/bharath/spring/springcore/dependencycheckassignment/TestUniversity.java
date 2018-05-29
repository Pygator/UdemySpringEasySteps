package com.bharath.spring.springcore.dependencycheckassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUniversity {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/springcore/dependencycheckassignment/universityconfig.xml");

        University university1 = (University) context.getBean("university");
        System.out.println(university1);
        System.out.println(university1.hashCode());

        University university2 = (University) context.getBean("university");
        System.out.println(university2);
        System.out.println(university2.hashCode());
    }
}
