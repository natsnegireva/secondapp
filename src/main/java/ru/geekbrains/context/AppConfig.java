package ru.geekbrains.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//-- файл конфигурации
@Configuration
@ComponentScan("ru.geekbrains.context")
public class AppConfig {
    private ProductRepository productRepository;

    @Bean
    public ProductCartRepository productCartRepository(ProductRepository productRepository) {
        ProductCartRepository productCartRepository = new ProductCartRepository(productRepository);
        return productCartRepository;
    }
}
