package com.pageLibrary.com.cucumberRanord;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Newbranch_entry 
{
	@FindBy(name="BtnNewBR")
	public static WebElement NewBranch_click;
	
	@FindBy(name="txtbName")
	public static WebElement Branch_name;
	
	@FindBy(id="txtAdd1")
	public static WebElement Address1;
	
	@FindBy(id="Txtadd2")
	public static WebElement Address2;
	
	@FindBy(id="txtadd3")
	public static WebElement Address3;
	
	@FindBy(id="txtArea")
	public static WebElement Area;
	
	@FindBy(id="txtZip")
	public static WebElement Zip_code;
	
	@FindBy(name="lst_counrtyU")
	public static WebElement Country;
	
	@FindBy(name="lst_stateI")
	public static WebElement state;
	
	@FindBy(name="lst_cityI")
	public static WebElement city;
	
	@FindBy(id="btn_insert")
	public static WebElement submit;
	
}
