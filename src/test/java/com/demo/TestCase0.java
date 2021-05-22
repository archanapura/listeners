package com.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.BaseTest;

public class TestCase0 extends BaseTest{

    @Test(testName="t5",groups = {"new"})
    public void testcase5(){

        String pgsrc=driver.getTitle();
        System.out.println(pgsrc);
        System.out.println("test2 method1");
    }
	/*
	 * @Test(testName="t3",groups = {"smoke"}) public void testcase3(){
	 * 
	 * System.out.println("testcase3"); }
	 * 
	 * @Test(testName="t4",groups = {"new"}) public void testcase4(){ //
	 * Assert.assertEquals(false,true); System.out.println("testcase4"); }
	 */

}
