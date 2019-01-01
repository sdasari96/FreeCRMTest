package takedasites;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestSite {

	public static void main(String[] args) {
		File pathBinary=new File("C:\\Users\\ext-sdasari\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver(new FirefoxBinary(pathBinary),new FirefoxProfile());
		driver.get("https://mytakeda.sharepoint.com/sites/myTakeda-Dev/rohittest/SitePages/Home.aspx");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement uid=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("i0116")));
		uid.sendKeys("techmspo2@mytakeda.com");
		
		WebElement next=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='idSIButton9']")));
		next.click();
		
		WebElement pwd=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='i0118']")));
		pwd.sendKeys("Takeda$1234");
		driver.findElement(By.xpath(".//*[@id='idSIButton9']")).click();
		driver.findElement(By.xpath(".//*[@id='KmsiCheckboxField']")).click();
		driver.findElement(By.xpath(".//*[@id='idSIButton9']")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath(".//*[@id='zz14_RootAspMenu']/li[6]/a")).click();
		driver.findElement(By.xpath(".//*[@id='appRoot']/div/div[3]/div/div[2]/div[2]/div/div[2]/div[1]/div/div/a")).click();
		driver.findElement(By.xpath(".//*[@id='idHomePageNewItem']/span[2]")).click();
		driver.findElement(By.xpath(".//*[@id='Gender_25642945-b2c5-483e-b301-3b921f87edb5_$RadioButtonChoiceField0']")).click();
		System.out.println(driver.findElement(By.xpath(".//*[@id='Gender_25642945-b2c5-483e-b301-3b921f87edb5_$RadioButtonChoiceField0']")).getAttribute("value"));
		/*Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='Designation_3f975d33-dc4e-4690-8f74-0751d6b4a1f7_$DropDownChoice']")));
		dropdown.selectByIndex(2);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		dropdown.selectByValue("Software Engineer");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		dropdown.selectByVisibleText("Assosciate Software Engineer");*/
		//driver.quit();
	}

}
