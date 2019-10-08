package com.example.springmvc.boot;

import com.example.springmvc.model.Product;
import com.example.springmvc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader  implements CommandLineRunner {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Product product1= new Product();
        product1.setName("Product1 name");
        product1.setCategory("Product1 category");
        product1.setDescription("Product1 description");
        product1.setPrice(0.0);
        product1.setType("Product1 type");

        productRepository.save(product1);


        Product product2= new Product();
        product2.setName("Product2 name");
        product2.setCategory("Product2 category");
        product2.setDescription("Product2 description");
        product2.setPrice(10.0);
        product2.setType("Product2 type");

        productRepository.save(product2);



    }
}
