package seleniumwd;

import java.io.File;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class MultipleWindows {

	public static void main(String[] args) throws Exception{
		
		File pathBinary = new File("C:\\Users\\ext-sdasari\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver(new FirefoxBinary(pathBinary),new FirefoxProfile());
		driver.get("https://easy.techmahindra.com");
		driver.findElement(By.xpath(".//*[@id='txtLanId']")).sendKeys("SD00477954");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("143MUMm@2018");
		driver.findElement(By.xpath(".//*[@id='btnlogin']")).click();
		driver.findElement(By.xpath(".//*[@id='lnkFav0']")).click();
		driver.findElement(By.xpath(".//*[@id='lnkFav1']")).click();
		
		ArrayList a = new ArrayList(driver.getWindowHandles());
		System.out.println(a.size());
		for(int i=0;i<a.size();i++)
		{
			System.out.println(driver.switchTo().window((String)a.get(i)).getTitle());
			//driver.switchTo().window((String)a.get(i)).close();
		}
		//System.out.println(driver.switchTo().window((String)a.get(0)).getTitle());
		//Thread.sleep(3000);
		//System.out.println(driver.switchTo().window((String)a.get(1)).getTitle());
		//System.out.println(driver.switchTo().window((String)a.get(1)).switchTo().window((String)a.get(2)).getTitle());
		driver.quit();
	}

}
