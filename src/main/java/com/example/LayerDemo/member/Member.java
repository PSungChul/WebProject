package com.example.LayerDemo.member;
// DTO & Entity
public class Member {
    // 변수
    private int mID; // 구분용 id
    private String name; // 이름
    // 생성자 매개변수
    Member(int mID, String name) {
        this.mID = mID;
        this.name = name;
    }
    // getter
    int getmID() {
        return mID;
    }

    public String getName() {
        return name;
    }
}
