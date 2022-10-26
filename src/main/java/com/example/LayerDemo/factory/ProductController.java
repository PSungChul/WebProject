package com.example.LayerDemo.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    // DI 구현
    @Autowired
    ProductService productService;

    @GetMapping("/save")
    String save() {
        Product product = new Product(111, "ipad");
        return productService.save(product);
    }
    @GetMapping("/save/findById")
    String findById() {
        return productService.findById(111);
    }
}
