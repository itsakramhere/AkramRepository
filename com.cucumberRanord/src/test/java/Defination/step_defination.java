package Defination;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pageLibrary.com.cucumberRanord.Branches;
import com.pageLibrary.com.cucumberRanord.Newbranch_entry;
import com.pageLibrary.com.cucumberRanord.loginPage;

import DataHelper.Helper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.Branches_m;
import modules.NewBranch_m;
import modules.login_mod;

public class step_defination 
{
	WebDriver driver;
	List<HashMap<String, String>> map;
	 public step_defination() 
	{
		this.driver=Hooks.driver;
		map=Helper.excelData(".//ExcelData//DataFile.xlsx", "Sheet1");
	}
	@Given("^launch site$")
	public void launch_site() throws Throwable 
	{
		driver.get("http://srssprojects.in/home.aspx");
	    
	}

	@When("^Enter the username with \"([^\"]*)\" and password with \"([^\"]*)\" data and click on loin Btn$")
	public void Enter_the_username_with_and_password_with_data_and_click_on_loin_Btn(String user, String pwd) throws Throwable 
	{
		PageFactory.initElements(driver, loginPage.class);
	   login_mod.login_m(user, pwd);
	}

	@Then("^Branches should be Displayed$")
	public void Branches_should_be_Displayed() throws Throwable 
	{
		PageFactory.initElements(driver, Branches.class);
		Branches_m.Branch_click();
	}

	@Then("^close site$")
	public void close_site() throws Throwable {
	   driver.close();
	}

	@When("^Enter the \"([^\"]*)\" data from excel$")
	public void Enter_the_data_from_excel(String row) throws Throwable 
	{
		PageFactory.initElements(driver, Newbranch_entry.class);
		int index=Integer.parseInt(row)-1;
		NewBranch_m.newBranch_btn(map,index);
		Generic.Alert_handle(driver).accept();
		
	 }


}
