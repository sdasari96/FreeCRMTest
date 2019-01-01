package testngg;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Test1 {
	
  WebDriver driver;
  @Test
  public void f() {
	 System.out.println(driver.findElements(By.tagName("a")).size()); 
	 Assert.assertEquals(driver.findElements(By.tagName("a")).size(), 2);
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver(new FirefoxBinary(new File("C:\\Users\\ext-sdasari\\AppData\\Local\\Mozilla Firefox\\firefox.exe")),new FirefoxProfile());
	  driver.get("https://easy.techmahindra.com");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
