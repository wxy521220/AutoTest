package com.test.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderTest {

    @Test(dataProvider = "wangjianjian")
    public void test1(String name,int age){
        System.out.println("name:"+name+" age:"+age);
    }

    @DataProvider(name="wangjianjian")
    public Object[][] test2(){
        Object[][] aaa=new Object[][]{
                {"王建林",27},
                {"王小颖",24}
        };
        return aaa;
    }
}
