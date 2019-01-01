package junitpackage;

import java.io.File;
import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

import org.junit.After;

import org.junit.Before;

import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	File pathBinary = new File("C:\\Users\\ext-sdasari\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
	WebDriver driver = new FirefoxDriver(new FirefoxBinary(pathBinary), new FirefoxProfile());
	
	@Before
	public void launchApp(){
		driver.get("https://easy.techmahindra.com");
		driver.manage().window().maximize();
	}
	
	@After
	public void closeApp()
	{
		driver.close();
	}
	
	@Test
	public void LoginFunctionality() throws Exception
	{
		HomePOM hpom=PageFactory.initElements(driver, HomePOM.class);
		//HomeRM homeRM = new HomeRM();
		FileInputStream f = new FileInputStream("D:\\Sneha\\Selenium\\TestData\\LoginTestData.xls");
		Workbook workbook= Workbook.getWorkbook(f);
		Sheet sheet = workbook.getSheet(0);
		hpom.Uid.sendKeys(sheet.getCell(0, 0).getContents());
		System.out.println(sheet.getCell(0, 0).getContents());
	}
}
