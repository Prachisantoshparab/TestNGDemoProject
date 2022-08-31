package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class commonUtilities {
	
	
	//common method to handle dropdown
	public static void dropdownHandle(WebElement dropDownXpath,int index) {
		
		Select s=new Select(dropDownXpath);
		s.selectByIndex(index);
		
	}
	

}
