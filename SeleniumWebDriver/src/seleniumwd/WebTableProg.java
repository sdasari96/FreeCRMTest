package seleniumwd;

import java.io.File;
import java.io.FileOutputStream;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class WebTableProg {

	public static void main(String[] args) throws Exception{
		
		File pathBinary = new File("C:\\Users\\ext-sdasari\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		WebDriver driver = new FirefoxDriver(firefoxBinary, firefoxProfile);
		//driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.get("http://toolsqa.wpengine.com/automation-practice-table");
		//driver.manage().window().maximize();
		WebElement table = driver.findElement(By.xpath(".//*[@id='content']/table/tbody"));
		int rc=table.findElements(By.tagName("tr")).size();
		//System.out.println(rc);
		
		FileOutputStream fout = new FileOutputStream("D:\\Sneha\\Selenium\\WebTableData.xls");
		WritableWorkbook wwb=Workbook.createWorkbook(fout);
		WritableSheet ws=wwb.createSheet("WebtableResult", 0);
		for(int i=1;i<=rc;i++)
		{
			Label l = new Label(0, i, table.findElement(By.xpath("tr["+i+"]/td[2]")).getText());
			ws.addCell(l);
		}
		wwb.write();
		wwb.close();
	}

}
