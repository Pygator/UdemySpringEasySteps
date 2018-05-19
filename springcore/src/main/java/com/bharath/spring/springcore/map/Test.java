package com.bharath.spring.springcore.map;

import com.bharath.spring.springcore.list.Hospital;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/springcore/map/mapconfig.xml");
        Customer customer = (Customer) context.getBean("customer");
        System.out.println(customer);
    }
}
