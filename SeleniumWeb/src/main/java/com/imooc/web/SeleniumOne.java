package com.imooc.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class SeleniumOne {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/webdriver/chromedriver.exe");
        WebDriver driver;

        driver = new ChromeDriver();
        driver.get("https://mail.163.com/");
        String title = driver.getTitle();
        System.out.printf(title);

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement iframe = driver.findElement(By.xpath("//*[@id=\"loginDiv\"]/iframe[1]"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//*[@id='account-box']//input")).sendKeys("17329271366");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.close();

    }
}
