package com.selenium.demo.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class OpenBrowerse {
    WebDriver driver;
    //打开谷歌
    @Test
    public void openChrome(){
         System.setProperty("webdriver.chrome.driver","D:\\IdeaProjects\\Selenium\\src\\driver\\chromedriver.exe");
         driver=new ChromeDriver();
         driver.get("http://wwww.baidu.com");
         driver.quit();
    }
    //打开火狐浏览器
    @Test
    public void openFifox() throws InterruptedException {
       System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        driver=new FirefoxDriver();
        driver.get("http://wwww.baidu.com");
        Assert.assertEquals(1,2);
        Thread.sleep(3000);
        driver.quit();
    }

}
