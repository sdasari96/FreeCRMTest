package seleniumwd;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class MultipleFrames {

	public static void main(String[] args) throws Exception {
		File pathBinary=new File("C:\\Users\\ext-sdasari\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver(new FirefoxBinary(pathBinary), new FirefoxProfile());
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		
		WebElement[] framee = {driver.findElement(By.name("packageFrame")),driver.findElement(By.name("packageListFrame"))};
		System.out.println(driver.switchTo().frame(framee[0]).findElements(By.tagName("a")).size());
		driver.switchTo().parentFrame();
		System.out.println(driver.switchTo().frame(framee[1]).findElements(By.tagName("a")).size());
		driver.close();
	}

}
