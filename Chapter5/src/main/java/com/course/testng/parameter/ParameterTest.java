package com.course.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author mandy
 * @date 2018-12-14 13:56
 */
public class ParameterTest {
    @Test
    @Parameters({"name","age"})
    public void paramTest(String name, int age){
        System.out.println("name = "+name);
        System.out.println("age = "+age);
    }
}
