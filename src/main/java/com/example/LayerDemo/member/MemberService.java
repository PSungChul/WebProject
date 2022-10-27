package com.example.LayerDemo.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// Service
@Service
public class MemberService {
    // Repository에게 일을 시킨다.
    @Autowired // 새로운 DI 구현 방식
    MemberRepository memberRepository;

    Member save(Member member) {
        return memberRepository.save(member);
    }
}
