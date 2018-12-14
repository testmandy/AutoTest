package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @author mandy
 * @date 2018-12-14 13:00
 */
public class GroupOnMethod {

    @Test(groups = "server")
    public void groupTest1(){
        System.out.println("这是服务端组测试方法111111");
    }

    @Test(groups = "server")
    public void groupTest2(){
        System.out.println("这是服务端组测试方法222222");
    }

    @Test(groups = "client")
    public void groupTest3(){
        System.out.println("这是客户端组测试方法333333");
    }

    @Test(groups = "client")
    public void groupTest4(){
        System.out.println("这是客户端组测试方法444444");
    }



    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("BeforeGroups这是运行服务端组前运行的方法");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("AfterGroups这是运行服务端组后运行的方法");
    }

}


