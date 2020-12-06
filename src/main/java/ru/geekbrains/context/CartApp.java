package ru.geekbrains.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Collections;


public class CartApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ProductCartRepository productCartRepository = context.getBean("productCartRepository", ProductCartRepository.class);
        System.out.println(productCartRepository.addProduct(1));
        System.out.println(productCartRepository.addProduct(2));
        System.out.println(productCartRepository.addProduct(3));
        System.out.println(productCartRepository.addProduct(4));
        System.out.println(productCartRepository.deleteProduct(3));
        System.out.println(productCartRepository.clearCart());
        System.out.println(productCartRepository.addProduct(2));


        context.close();
        }
    }

