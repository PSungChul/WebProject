package com.example.LayerDemo.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    // localhost:7777/
    @GetMapping("") // 입력
    String user() {
        return "main"; // main.html
    }
    // localhost:7777/hello
    @GetMapping("/hello") // 출력
    String info(@RequestParam("id") String id, @RequestParam("name") String name, Model model) {
        model.addAttribute("id", id); // ID
        model.addAttribute("name", name); // 이름
        return "hello";
    }
}