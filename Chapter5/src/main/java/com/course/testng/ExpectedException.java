package com.course.testng;

import org.testng.annotations.Test;

/**
 * @author mandy
 * @date 2018-12-14 13:25
 *
 * 什么时候会用到异常测试？
 * 在我们期望结果为某一个异常的时候
 * 比如：我们输入了不合法的参数，程序抛出了异常
 *
 */
public class ExpectedException {

    // 这是一个运行结果会失败的异常
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }

    // 这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeSuccess(){
        System.out.println("这是我的异常测试");
        throw new RuntimeException();
    }
}
