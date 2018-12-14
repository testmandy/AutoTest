package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @author mandy
 * @date 2018-12-14 11:20
 */
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite is RUNNING!");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite is RUNNING!");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("after test");
    }

}
