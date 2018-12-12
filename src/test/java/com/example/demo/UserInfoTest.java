package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(UserInfoParameterResolver.class)
public class UserInfoTest {

    private UserInfo userInfo;

    public UserInfoTest(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Test
    void userInfoTest(){
        System.out.println(userInfo.getName());
        System.out.println(userInfo.getEmail());

        assertEquals(userInfo.getName(), "arthur");
        assertEquals(userInfo.getEmail(), "arthur.choi@within.co.kr");
    }
}
