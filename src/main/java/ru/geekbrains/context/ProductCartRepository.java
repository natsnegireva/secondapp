package ru.geekbrains.context;

import java.util.ArrayList;
import java.util.List;


public class ProductCartRepository implements ProductRepo {
    private static final List<Product> cartList = new ArrayList<>();
    private ProductRepository productRepository = null;

    public ProductCartRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
        clearCart();
    }


    @Override
    public List<Product> getProduct() {
        return cartList;
    }

    public List<Product> addProduct(int id) {
        cartList.add(productRepository.getById(id));
        return cartList;
    }

    public List<Product> deleteProduct (int id) {
        if (cartList.size() != 0) {
        cartList.remove(productRepository.getById(id));
        return cartList;
        }
        return null;
    }

    public String clearCart() {
        cartList.clear();
        return "Cart empty";
    }
}
