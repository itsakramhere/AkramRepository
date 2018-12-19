package modules;

import com.pageLibrary.com.cucumberRanord.Branches;

public class Branches_m 
{
	public static void Branch_click()
	{
		if(Branches.branches.isDisplayed())
		{
			System.out.println("Branches button is displayed");
			Branches.branches.click();
		}
	}
}
