package com.test.testng;

import org.testng.annotations.*;

public class BasicText {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("测试方法之前运行的");
    }
    //用来标记这是一个测试方法
    @Test
    public void testCase1(){
        System.out.println("测试test标签");
    }

    @Test
    public void testCase2(){
        System.out.println("测试test2标签");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("测试方法之后运行的");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("测试套件beforeSuite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("测试套件afterSuite");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("测试beforeClass");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("测试beforeClass");
    }

}
