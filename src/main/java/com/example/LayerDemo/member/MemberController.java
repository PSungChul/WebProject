package com.example.LayerDemo.member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

// controller
@Controller
// @RequestMapping("/coffee") // 기본주소에 추가적으로 가장 먼저 입력해야 하는 주소값
public class MemberController {
    // Service에게 일을 시킨다.
    MemberService memberService;
    // 생성자 매개변수 - DI 구현
    MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
    // localhost:7777/create
    @GetMapping("/create") // create 실행
    String create(Model model) {
        Member member = new Member(1, "sungchul");  // 가짜 객체를 만들고,
        Member savedMember = memberService.save(member);       // 객체를 서비스에게 전달하면서 일을 시키고, 객체를 받아온다.
        model.addAttribute("member", savedMember); // hello.html에 값을 전달
        return "hello"; // View 파일 이름
    }
    // localhost:7777/request
//  @PostMapping("/request") == @RequestMapping(value="/request", method= RequestMethod.POST)
//  == @GetMapping("/request")
    @RequestMapping(value="/request", method= RequestMethod.GET)
    String request(@RequestParam("na") String name, Model model) { // 매개변수 어노테이션, Model 추가
        System.out.println(name);
        model.addAttribute("nm", name); // Model 매개변수
        return "request"; // request.html
    }
}
