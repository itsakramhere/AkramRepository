package modules;

import com.pageLibrary.com.cucumberRanord.loginPage;

public class login_mod 
{

	public static void login_m(String u,String p)
	{
		loginPage.username.sendKeys(u);
		loginPage.password.sendKeys(p);
		loginPage.LoginBtn.click();
	}
}
