package com.test.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterTest {

    @Test(groups="parameter")
    @Parameters({"name1","age"})
    public void parameterTest1(String name1,int age){
        System.out.println("name:"+name1+" age:"+age);
    }
}
