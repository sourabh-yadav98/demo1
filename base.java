package Com.Ecommerce.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Com.Ecommerce.Utilities.utilities;

public class base
{
	public static WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromdriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(utilities.implicit_wait, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(utilities.pageloade,TimeUnit.SECONDS);
		
		driver.get("https://demo.nopcommerce.com/login");
		
	}
	 
//	@AfterMethod
//	public void out()
//	{
//		driver.quit();
//	}

}
