package ru.geekbrains.context;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@Primary
public class ProductRepository implements ProductRepo {
    private static final List<Product> products = new ArrayList<>();

    public ProductRepository() {
        add(new Product(1, "tshirt", 200));
        add(new Product(2, "shorts", 100));
        add(new Product(3, "glasses", 50));
        add(new Product(4, "socks", 20));
        add(new Product(5, "slaps", 80));
    }


    @Override
    public List<Product> getProduct() {
        return Collections.unmodifiableList(products);
    }

    public void add(Product product) {
        products.add(product);
    }

    public Product getById(int id) {
        if (products.size() != 0) {
            for (Product product : products) {
                if (id == product.getId()) {
                    return product;
                }
            }
        }
        return null;
    }

}
