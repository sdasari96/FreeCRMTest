package package002;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumWebD {

	public static void main(String[] args) 
	{
		File pathBinary = new File("C:\\Users\\ext-sdasari\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		WebDriver driver = new FirefoxDriver(firefoxBinary, firefoxProfile);
		driver.get("https://hydowa.techmahindra.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtLanId")).sendKeys("SD00477954");
		driver.findElement(By.id("txtPassword")).sendKeys("143muMm@18");
		driver.findElement(By.id("btnlogin")).click();
		driver.findElement(By.id("TimesheetEntrylinkNew")).click();
		//driver.findElement(By.id("btnsearchTask_11")).click();
	}

}
