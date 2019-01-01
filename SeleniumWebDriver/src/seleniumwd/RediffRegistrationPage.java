package seleniumwd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RediffRegistrationPage {
	
	@FindBy(xpath=".//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input") WebElement Uid;
	By pass=By.xpath(".//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]");
	

}
