package com.bharath.spring.springcore.shoppingcart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestShoppingcart {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/springcore/shoppingcart/shoppingcartconfig.xml");

        System.out.println("Display Item details for item1.");
        Item item1 = (Item) context.getBean("item1");
        System.out.println(item1.getId());
        System.out.println(item1.getName());
        System.out.println(item1.getPrice());
        System.out.println(item1.getQuantity());
        System.out.println(item1.getName().getClass().getName());

        System.out.println("Display Item details for item2.");
        Item item2 = (Item) context.getBean("item2");
        System.out.println(item2.getId());
        System.out.println(item2.getName());
        System.out.println(item2.getPrice());
        System.out.println(item2.getQuantity());
        System.out.println(item2.getName().getClass().getName());

        System.out.println("Display shopping cart details.");
        ShoppingCart shoppingCart = (ShoppingCart) context.getBean("shoppingcart");
        System.out.println(shoppingCart);
    }
}
