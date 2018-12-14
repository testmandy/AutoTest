package com.course.testng;

import org.testng.annotations.Test;

/**
 * @author mandy
 * @date 2018-12-14 12:54
 */
public class IgnoreTest {

    @Test
    public void ignoreTest1(){
        System.out.println("this is Ignored Test 1~");
    }

    @Test(enabled = false)
    public void ignoreTest2(){
        System.out.println("this is Ignored Test 2~");
    }

    @Test(enabled = true)
    public void ignoreTest3(){
        System.out.println("this is Ignored Test 3~");
    }
}
