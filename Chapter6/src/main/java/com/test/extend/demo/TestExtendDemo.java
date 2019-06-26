package com.test.extend.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestExtendDemo {
    @Test
    public void test1(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void test2(){
        Assert.assertEquals(2,2);
    }
    @Test
    public void test3(){
        Assert.assertEquals(1,2);
    }
    @Test
    public void test4(){
        Reporter.log("王小颖打印的日志");
        throw new RuntimeException("运行时异常");
    }
    @Test(dataProvider = "wangjianjian")
    public void test1(String name,int age){
        System.out.println("name:"+name+" age:"+age);
    }

    @DataProvider(name="wangjianjian")
    public Object[][] test5(){
        Object[][] aaa=new Object[][]{
                {"王建林",27},
                {"王小颖",24}
        };
        return aaa;
    }
}
