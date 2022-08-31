package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {
public WebDriver driver;
	
	
	


	public SignUpPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}

	private By username=By.xpath("//input[@name='UserFirstName']");
	private By lastname=By.xpath("//input[@name='UserLastName']");
	private By workemail=By.xpath("//input[@name='UserEmail']");;
	private By JobTitle=By.xpath("//select[@name='UserTitle']");
	private By company=By.xpath("//input[@name='CompanyName']");
	private By employees=By.xpath("//select[@name='CompanyEmployees']");
	private By phone=By.xpath("//input[@name='UserPhone']");
	private By country=By.xpath("//select[@name='CompanyCountry']");
	private By serviceAggrement=By.xpath("//input[@id='SubscriptionAgreement']");
	private By StartFreeTrial=By.xpath("//button[@name='start my free trial']");
	//input[@id='SubscriptionAgreement']
	public WebElement EnterFirstName() {
		
		return driver.findElement(username);
		
	}
	
	public WebElement EnterLastName() {
		return driver.findElement(lastname);
	}
	
	public WebElement EnterWorkEmail() {
		return driver.findElement(workemail);
	}
	public WebElement JobTitle() {
		
		return driver.findElement(JobTitle);
		
	}
	public WebElement EnterCompany() {
		return driver.findElement(company);
	}
	
	public WebElement EnterEmployees() {
		return driver.findElement(employees);
	}
	public WebElement EnterPhone() {
		return driver.findElement(phone);
 	}
	public WebElement EnterCountry() {
		return driver.findElement(country);
	}
	public WebElement ClickSerAggrement() {
		return driver.findElement(serviceAggrement);
	}
	public WebElement ClickStartFreeTrial() {
		return driver.findElement(StartFreeTrial);
	}

}
