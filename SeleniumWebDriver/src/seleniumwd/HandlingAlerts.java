package seleniumwd;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class HandlingAlerts {

	public static void main(String[] args) throws Exception{
		
		File pathBinary = new File("C:\\Users\\ext-sdasari\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary firefoxbinary = new FirefoxBinary(pathBinary);
		FirefoxProfile firefoxprofile = new FirefoxProfile();
		WebDriver driver = new FirefoxDriver(firefoxbinary,firefoxprofile);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement button = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input"));
		button.click();
		
		Thread.sleep(3000);
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();
		
		
		driver.close();
	}

}
