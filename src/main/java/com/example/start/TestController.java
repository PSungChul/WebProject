package com.example.start;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Controller라고 Spring한테 알려주는 역할
public class TestController {
    // request
    // @GetMapping("http://localhost:7777/hello") URL을 아래처럼 줄여서 쓸 수 있다.
    @GetMapping("/hello") // HTTP가 날아다니는 방법을 알려주는 역할, Mapping 앞에 단어가 방법을 뒤에 URL이 클라이언트를 뜻한다.
    public String hello() {
        return "hello"; // response "hello".html
    }
}
