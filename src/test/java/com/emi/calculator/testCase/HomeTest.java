package com.emi.calculator.testCase;

import com.emi.calculator.screen.HomeScreen;
import com.emi.calculator.utill.General;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest{
    HomeScreen homeScreen;

    @Test
    public void checkAppName(){
        homeScreen=screen.getInstance(HomeScreen.class);
        Assert.assertEquals(General.APP_NAME,homeScreen.getAppName());
    }
    @Test
    public void checkStartBtn(){
        Assert.assertTrue(homeScreen.hasStartBtn());
    }


}
