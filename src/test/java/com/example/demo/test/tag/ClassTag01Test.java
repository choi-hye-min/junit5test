package com.example.demo.test.tag;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@Tag("development")
public class ClassTag01Test {

    @Test
    @Tag("userManagement1")
    void testCaseA(TestInfo testInfo) {
    }
}
