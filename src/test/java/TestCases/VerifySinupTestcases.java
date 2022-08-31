package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LogInPageObjects;
import PageObjectModel.SignUpPageObjects;
import Resources.BaseClass;
import Resources.commonUtilities;

public class VerifySinupTestcases extends BaseClass {
	
	
	@Test
	public void SignUp() throws IOException, InterruptedException {
		
		
		
		
		browserLaunch();
		driver.get("https://login.salesforce.com/?locale=in");
		LogInPageObjects Lpo=new LogInPageObjects(driver);
		
		SignUpPageObjects spo=new SignUpPageObjects(driver);
		
		Lpo.TryForFree().click();
		
		Thread.sleep(5000);
		
		spo.EnterFirstName().sendKeys("Prachi");
		spo.EnterLastName().sendKeys("Parab");
		spo.EnterWorkEmail().sendKeys("prachiparab15@rediffmail.com");
		Select s=new Select(spo.JobTitle());
		s.selectByIndex(1);
		
		spo.EnterCompany().sendKeys("SuperTech");
		
		Select s1=new Select(spo.EnterEmployees());
		s1.selectByIndex(1);
		spo.EnterPhone().sendKeys("7249821906");
		
		Select s2=new Select(spo.EnterCountry());
		s2.selectByIndex(0);
		//spo.ClickSerAggrement().click();
	//	spo.ClickStartFreeTrial().click();
		
//		commonUtilities.dropdownHandle(spo.JobTitle(),1);
//		
//		commonUtilities.dropdownHandle(spo.CompanyEmployees(),2);
//		
//		Select s=new Select(spo.JobTitle());
//		s.selectByIndex(0);
//		
		System.out.println(driver.getTitle());
		String actualTitle="";
		
		
	}

}
