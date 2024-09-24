package com.emi.calculator.screen;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomeScreen extends BaseScreen{

    private By startbtn=By.id("btnStart");

    public HomeScreen(AndroidDriver driver) {
        super(driver);
    }

    public String getAppName(){
        By name=By.id("appName");
        waitForElement(name);
        return getWebElement(By.id("appName")).getText().trim();
    }

    public void tapStartBtn(){
        getWebElement(startbtn).click();
    }
    public EmiCalculatorScreen tapCompareBtn(){
        getWebElement(startbtn).click();

      return getInstance(EmiCalculatorScreen.class);
    }

    public boolean hasStartBtn(){
return getWebElements(startbtn).size() > 0;
    }
}
