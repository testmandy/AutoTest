package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @author mandy
 * @date 2018-12-14 13:12
 */
@Test(groups = "stu")
public class GroupsOnClass1 {

    public void stu1(){
        System.out.println("GroupsOnClass1中的stu1运行了！");
    }

    public void stu2(){
        System.out.println("GroupsOnClass1中的stu2运行了！");
    }

}
