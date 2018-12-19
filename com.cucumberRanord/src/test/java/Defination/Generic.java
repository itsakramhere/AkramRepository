package Defination;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Generic 
{

		public static Select dropdown_handle( WebElement Element)
		{
			Select sel=new Select(Element);
			return sel;
			
		}
		public static Alert Alert_handle(WebDriver driver)
		{
			Alert a=driver.switchTo().alert();
			return a;
		}
}
