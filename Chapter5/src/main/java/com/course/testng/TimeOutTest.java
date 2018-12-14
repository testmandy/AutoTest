package com.course.testng;

import org.testng.annotations.Test;


/**
 * @author mandy
 * @date 2018-12-14 16:27
 */
public class TimeOutTest {

    @Test(timeOut = 3000) // 单位为毫秒
    public void timeOutSuccess() throws InterruptedException {
//        System.out.println("这是一个超时测试");
        Thread.sleep(2000);
    }

    @Test(timeOut = 1000) // 单位为毫秒
    public void timeOutFailed() throws InterruptedException {
        Thread.sleep(2000);
    }
}
