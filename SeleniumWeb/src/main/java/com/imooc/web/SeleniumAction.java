package com.imooc.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAction {
    public WebDriver driver;
    public void InitDriver(){
        System.setProperty("webdriver.chrome.driver", "C:/webdriver/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://mail.163.com/");
    }
}
