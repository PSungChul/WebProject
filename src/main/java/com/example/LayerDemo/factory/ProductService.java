package com.example.LayerDemo.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    // DI 구현
    @Autowired
    ProductRepository productRepository;

    String save(Product product) {
        return productRepository.save(product);
    }

    String findById(int n) {
        return productRepository.findById(n);
    }
}
