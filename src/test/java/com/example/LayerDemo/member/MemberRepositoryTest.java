package com.example.LayerDemo.member;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MemberRepositoryTest {
    // MemberRepository를 사용하기 위해 객체화
    @Autowired
    MemberRepository memberRepository;
//    MemberRepository memberRepository = new MemberRepository(); // 어노테이션을 사용하지 않고 직접 객체화

    @Test
    @DisplayName("Member 객체가 저장이 잘 되는지 확인") // 아래 메소드에 대한 description
    void saveTest() {
        // Member m = new Member(1, "sungchul);
        memberRepository.save(new Member(1, "sungchul"));

        // Assertions - 다시보기 보면서 다시 작성하기
    }
}