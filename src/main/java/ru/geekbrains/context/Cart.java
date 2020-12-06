package ru.geekbrains.context;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> cartList;

    public Cart() {
        cartList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartList=" + cartList +
                '}';
    }
}
