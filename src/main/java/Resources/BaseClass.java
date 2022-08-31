package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public WebDriver driver;
	public WebDriver browserLaunch() throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Parab\\eclipse-workspace\\20juneTestNGFramework\\src\\main\\java\\Resources\\data.properties");
		
		
		Properties prop=new Properties();
		prop.load(fis);
		String browserName=  prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Parab\\OneDrive\\Desktop\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
	        driver = new ChromeDriver();
		}
		return driver;
	}
	
//	@BeforeMethod
//	public void launchBrowser() throws IOException {
//		browserLaunch();
//		driver.get("https://login.salesforce.com/?locale=in");
//		
//	}

}
 