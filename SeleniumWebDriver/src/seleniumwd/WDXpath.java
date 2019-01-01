package seleniumwd;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class WDXpath {

	public static void main(String[] args) 
	{
		/*File pathBinary = new File("C:\\Users\\ext-sdasari\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		WebDriver driver = new FirefoxDriver(firefoxBinary, firefoxProfile);*/
		
		
		File pathBinary=new File("C:\\Users\\ext-sdasari\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		WebDriver driver=new FirefoxDriver(new FirefoxBinary(pathBinary),new FirefoxProfile());
		
		driver.get("http://www.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='signin_info']/a[2]")).click();
		driver.findElement(By.xpath(".//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("Sneha");
		
		if(driver.findElement(By.xpath(".//*[@id='tblcrtac']/tbody/tr[9]/td[3]/input")).isDisplayed()==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		
		System.out.println("Is Editable");
		String a=driver.findElement(By.xpath(".//*[@id='tblcrtac']/tbody/tr[9]/td[3]/input")).getAttribute("readonly");
		if(a==null)
			System.out.println("Is Editable");
		else
			System.out.println("Not Editable");
		
	}

}
