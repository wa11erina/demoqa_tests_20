package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

public class DemoJUnitTest {

    @BeforeAll
    static void BeforeAll() {
        System.out.println("#### @BeforeAll");
//        Configuration.browser = "chrome";
    }

    @AfterAll
    static void AfterAll() {
        System.out.println("#### @AfterAll");
//        Configuration.browser = "chrome";
    }

    @BeforeEach
    void BeforeEach() {
        System.out.println("    #### @BeforeEach");
        Calculator calc = new Calculator();
    }

    @AfterEach
    void AfterEach() {
        System.out.println("    #### @AfterEach");
    }

    @Test
    void FirstTest() {
        System.out.println("    #### @Test FirstTest");
        Calculator calc = new Calculator();
        int result = calc.summ(2, 2);
        Assertions.assertTrue(result == 4);
    }

    @Test
    void SecondTest() {
        System.out.println("    #### @Test SecondTest");
        Calculator calc = new Calculator();
        int result = calc.mult(2, 2);
        Assertions.assertTrue(result == 4);
    }
}
