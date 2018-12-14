package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @author mandy
 * @date 2018-12-14 13:12
 */
@Test(groups = "teacher")
public class GroupsOnClass3 {

    public void teacher1(){
        System.out.println("GroupsOnClass3中的teacher1运行了！");
    }

    public void teacher2(){
        System.out.println("GroupsOnClass3中的teacher2运行了！");
    }

}
