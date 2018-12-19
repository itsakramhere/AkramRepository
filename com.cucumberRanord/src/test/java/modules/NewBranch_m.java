package modules;

import java.util.HashMap;
import java.util.List;

import com.pageLibrary.com.cucumberRanord.Newbranch_entry;

import Defination.Generic;

public class NewBranch_m 
{
 public static void newBranch_btn(List<HashMap<String, String>> map,int index)
 {
	 Newbranch_entry.NewBranch_click.click();
	 Newbranch_entry.Branch_name.sendKeys(map.get(index).get("Branch_Name"));
	 Newbranch_entry.Address1.sendKeys(map.get(index).get("Address1"));
	 Newbranch_entry.Address2.sendKeys(map.get(index).get("Address2"));
	 Newbranch_entry.Address3.sendKeys(map.get(index).get("Address3"));
	 Newbranch_entry.Area.sendKeys(map.get(index).get("Area"));
	 Newbranch_entry.Zip_code.sendKeys(map.get(index).get("Zipcode"));
	 Generic.dropdown_handle(Newbranch_entry.Country).selectByVisibleText(map.get(index).get("contryNB"));
	 Generic.dropdown_handle(Newbranch_entry.state).selectByVisibleText(map.get(index).get("stateNB"));
	 Generic.dropdown_handle(Newbranch_entry.city).selectByVisibleText(map.get(index).get("cityNB"));
	 Newbranch_entry.submit.click();
 }
 
 

}
