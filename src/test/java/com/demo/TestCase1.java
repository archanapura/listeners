package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import utils.BaseTest;

public class TestCase1 extends BaseTest{

    @Test(groups = {"smoke"})
    public void testcase1(){
        String url=driver.getCurrentUrl();
        System.out.println(url);
     
        System.out.println("test1 method1");
    }


}
