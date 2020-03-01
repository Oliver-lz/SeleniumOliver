package com.po.page;

import org.openqa.selenium.By;

public class LoginPage {
    //定义邮箱
    public static By emailInput= By.name("email");
    //定义密码
    public static By pwdInput=By.name("password");
    //定义登录按钮
    public static By loginButton=By.id("dologin");
    //去注册
    public static By signButton=By.id("changepage");


}
