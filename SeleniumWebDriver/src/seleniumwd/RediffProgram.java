package seleniumwd;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.PageFactory;



public class RediffProgram {


	public static void main(String[] args) throws Exception{
		
		File pathBinary=new File("C:\\Users\\ext-sdasari\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver(new FirefoxBinary(pathBinary),new FirefoxProfile());
		driver.get("http://www.rediff.com/");
		                                                
		RediffHomePage rhp = PageFactory.initElements(driver, RediffHomePage.class);
		rhp.RegistrationLink.click();
		System.out.println("clicked");
		RediffRegistrationPage rrp = PageFactory.initElements(driver, RediffRegistrationPage.class);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		rrp.Uid.sendKeys("Sneha Dasari");
		driver.findElement(rrp.pass).sendKeys("Password2018");
		File f=((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\ext-sdasari\\Desktop\\rediffReg.PNG"));
		driver.close();

	}

}
