package com.bharath.spring.springcore.shoppingcart;

import java.util.Set;

public class ShoppingCart {

private Item item;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "item=" + item +
                '}';
    }
}
