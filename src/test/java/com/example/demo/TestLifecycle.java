package com.example.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

// -Djunit.jupiter.testinstance.lifecycle.default=per_class
// junit.jupiter.testinstance.lifecycle.default = per_class
@TestInstance(TestInstance.Lifecycle.PER_CLASS) //  테스트 클래스 당 한 번 새 테스트 인스턴스가 생성
public class TestLifecycle {

    @BeforeAll
    void beforeAll(){
        // 초기화
        System.out.println("beforeAll");
    }

    @AfterAll
    void afterAll(){
        // 초기화
        System.out.println("afterAll");
    }
}
