package com.pageLibrary.com.cucumberRanord;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Branches 
{
	@FindBy(xpath="//a[@href='admin_banker_master.aspx']/img[@src='images/Branches_but.jpg']")
	public static WebElement branches;
}
