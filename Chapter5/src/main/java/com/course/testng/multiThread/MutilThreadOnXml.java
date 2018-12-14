package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @author mandy
 * @date 2018-12-14 15:38
 */
public class MutilThreadOnXml {

    @Test
    public void test1(){
        System.out.println("这是基于xml的多线程测试11111");
        System.out.printf("Thread: %s%n", Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.println("这是基于xml的多线程测试22222");
        System.out.printf("Thread: %s%n", Thread.currentThread().getId());
    }

    @Test
    public void test3(){
        System.out.println("这是基于xml的多线程测试33333");
        System.out.printf("Thread: %s%n", Thread.currentThread().getId());
    }
}
