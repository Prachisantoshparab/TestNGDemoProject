package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPageObjects {
	
	private By username=By.xpath("//input[@id='username']");
	private By password=By.xpath("//input[@id='password']");
	private By login=By.xpath("//input[@id='Login']");
	private By TryForFree=By.xpath("//a[@id='signup_link']");
	public WebDriver driver;
	
	
	public LogInPageObjects(WebDriver driver2) {
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}
	public WebElement EnterUserName() {
		
		return driver.findElement(username);
		
	}
	public WebElement EnterPassword() {
		
		return driver.findElement(password);
		
	}
	public WebElement ClickLogin() {
		
		return driver.findElement(login);
		
	}
	public WebElement TryForFree() {
		
		return driver.findElement(TryForFree);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
