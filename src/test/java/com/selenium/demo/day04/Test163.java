package com.selenium.demo.day04;

import com.po.page.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


public class Test163 {
    WebDriver driver;
    @BeforeMethod
    public void openChrom(){
        System.setProperty("webdriver.chrome.driver","D:\\IdeaProjects\\Selenium\\src\\driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://mail.163.com/");


        driver.findElement(LoginPage.emailInput).sendKeys("email");

    }
}
