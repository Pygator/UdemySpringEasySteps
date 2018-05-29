package com.bharath.spring.springcore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InnerbeansTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/springcore/innerbeans/config.xml");

        // scope=singleton : both return the same value.
        // scope=prototype : sout returns different values.
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee.hashCode());

        Employee employee2 = (Employee) context.getBean("employee");
        System.out.println(employee2.hashCode());

    }

}
