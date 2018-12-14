package com.course.testng;

import org.testng.annotations.*;

/**
 * @author mandy
 * @date 2018-12-14 10:49
 */
public class BasicAnnotation {
    // 最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("this is test case 1");
    }

    @Test
    public void testCase2(){
        System.out.println("this is test case 2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("this is before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("this is after method");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite 测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suit 测试套件");
    }
}
