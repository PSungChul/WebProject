package com.example.LayerDemo.member;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

// Repository
@Repository
public class MemberRepository {
    Map<Integer, Member> db = new HashMap<>(); // DB 대체제

    Member save(Member member) {
        db.put(member.getmID(), member);
        System.out.println("db에 " + member.getName() + "객체가 저장되었습니다.");

        return db.get(member.getmID());
    }
}
