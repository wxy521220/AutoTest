package com.test.testng;

import org.testng.annotations.Test;

public class ExpectedExceptionTest {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExpectionFiled(){
        System.out.println("这是一个失败的异常");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExpectionSucc(){

        System.out.println("这是一个成功的异常");
        //一定要抛出异常才能测试成功
        throw new RuntimeException();
    }

}
