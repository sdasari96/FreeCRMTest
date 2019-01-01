package seleniumwd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SWD1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Sneha\\Selenium\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://easy.techmahindra.com");
		driver.manage().window().maximize();
		
		
	}
	
	
}
