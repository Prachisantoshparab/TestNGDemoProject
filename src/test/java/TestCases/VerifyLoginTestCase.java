package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LogInPageObjects;
import Resources.BaseClass;

public class VerifyLoginTestCase extends BaseClass {
	@Test
	public void login() throws IOException, InterruptedException{
		
		LogInPageObjects Lpo=new LogInPageObjects(driver);
		Lpo.EnterUserName().sendKeys("rahul");
		Lpo.EnterPassword().sendKeys("123");
		Lpo.ClickLogin().click();
		Lpo.TryForFree().click();
		
//		String expected="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
//		String actual=driver.findElement(By.xpath("//div[@id='error'")).getText();
//		SoftAssert assertion=new SoftAssert();
//		assertion.assertEquals(actual, expected);
//		assertion.assertAll();
	}

}
