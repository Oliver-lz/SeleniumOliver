package com.selenium.demo.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
        Thread.sleep(3000);
        driver.quit();
    }
    //打开edge浏览器
    @Test
    public  void openedge() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "D:\\IdeaProjects\\Selenium\\src\\driver\\MicrosoftWebDriver.exe");
        driver=new EdgeDriver();
        Thread.sleep(3000);
        driver.quit();
    }

}
