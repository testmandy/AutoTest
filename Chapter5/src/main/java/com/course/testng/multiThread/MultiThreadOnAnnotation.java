package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @author mandy
 * @date 2018-12-14 15:07
 *
 * annotation----注解
 *
 * invocationCount----表示执行的次数(相当于Jmeter中的线程数量设置)
 *
 * threadPoolSize-----表示线程池的内线程的个数
 *
 * timeOut-------超时时间-毫秒
 *
 * %c,%d,%s与后面的c,i,s对应的，%c是表示以字符格式输出c，%d表示以整数形式输出i，%s表示以字符串形式输出s，最后的\n是换行符
 */
public class MultiThreadOnAnnotation {

    @Test(invocationCount = 10, threadPoolSize = 3)
    public void test(){
        System.out.println("这是一个多线程测试");
        System.out.printf("Thread ID: %s%n", Thread.currentThread().getId());
    }
}
