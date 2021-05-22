package com.demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Testcase2 extends BaseTest{
    @Test(groups = {"new"},dataProvider = "data1")
    public void testcase2(String user,String pwd){
        System.out.println(driver.getTitle());
        int size=driver.findElements(By.xpath("//span[contains(text(),'Hello')]")).size();
        System.out.println(size>0);
        System.out.println("test1 method2");
        System.out.println(user);
        System.out.println(pwd);
    }
}
