package com.bharath.spring.springcore.reftypes;

import com.bharath.spring.springcore.map.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRefType {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/springcore/reftypes/reftypeconfig.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
        System.out.println(student.getScores().getMaths());

    }
}
