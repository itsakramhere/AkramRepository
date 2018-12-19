package com.pageLibrary.com.cucumberRanord;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPage 
{
 @FindBy(name="txtuId")
 public static WebElement username;
 
 @FindBy(name="txtPword")
 public static WebElement password;
 
 @FindBy(name="login")
 public static WebElement LoginBtn;
 
 
}
