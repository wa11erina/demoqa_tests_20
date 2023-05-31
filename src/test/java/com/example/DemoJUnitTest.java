package com.example;

import org.junit.jupiter.api.*;

public class DemoJUnitTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("#### @BeforeAll");
//        Configuration.browser = "chrome";
    }

    @AfterAll
    static void afterAll() {
        System.out.println("#### @AfterAll");
//        Configuration.browser = "chrome";
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("    #### @BeforeEach");
        Calculator calc = new Calculator();
    }

    @AfterEach
    void afterEach() {
        System.out.println("    #### @AfterEach");
    }

    @Test
    void firstTest() {
        System.out.println("    #### @Test FirstTest");
        Calculator calc = new Calculator();
        int result = calc.sum(2, 2);
        Assertions.assertTrue(result == 4);
    }

    @Test
    void secondTest() {
        System.out.println("    #### @Test SecondTest");
        Calculator calc = new Calculator();
        int result = calc.mult(2, 2);
        Assertions.assertTrue(result == 4);
    }
}
