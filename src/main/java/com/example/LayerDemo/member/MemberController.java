package com.example.LayerDemo.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// controller
@RestController
public class MemberController {
    // Service에게 일을 시킨다.
    MemberService memberService;
    // 생성자 매개변수 - DI 구현
    MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
    // localhost:7777/create
    @GetMapping("/create") // create 실행
    String create() {
        Member member = new Member(1, "sungchul");  // 가짜 객체를 만들고,
        memberService.save(member);                            // 객체를 서비스에게 전달하면서 일을 시킨다.

        return "create 메소드가 호출되었습니다.";
    }
}
