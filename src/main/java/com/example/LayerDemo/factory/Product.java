package com.example.LayerDemo.factory;
// DTO & Entity
public class Product {
    // 변수
    private int pid;
    private String name;
    // 생성자 매개변수
    Product(int pid, String name) {
        this.pid = pid;
        this.name = name;
    }
    // getter
    int getPid() {
        return pid;
    }
    String getName() {
        return name;
    }
}
