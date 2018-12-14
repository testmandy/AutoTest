package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @author mandy
 * @date 2018-12-14 14:22
 */
public class DataProviderTest {
    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"amy",10},
                {"bob",11},
                {"coco",12}
        };
        return o;
    }

    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age){
        System.out.println("name= "+name + "; age = "+age);
    }


    @Test(dataProvider = "methodData")
    public void test1(String name, int age){
        System.out.println("test1111方法运行, name= "+name + "; age = "+age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age){
        System.out.println("test2222方法运行, name= "+name + "; age = "+age);
    }


    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null;
        if (method.getName().equals("test1")){
            result = new Object[][]{
                    {"AMY",21},
                    {"BOB",22}
            };
        }else if (method.getName().equals("test2")){
            result = new Object[][]{
                    {"COCO",23},
                    {"DAVE",24}
            };
        }
        return result;
    }


}
