package com.example.LayerDemo.factory;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository {
    // DB 대체제
    Map<Integer, Product> db = new HashMap<>();
    // INSERT
    String save(Product product) {
        db.put(product.getPid(), product);
        return "saved"; // saved.html
    }
    // SELECT
    String findById(int n) {
        System.out.println(db.get(n).getName());
        return "found"; // found.html
    }
}
