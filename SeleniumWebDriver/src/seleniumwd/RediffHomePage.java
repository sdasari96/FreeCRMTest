package seleniumwd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RediffHomePage 
{
	By SignInLink = By.xpath(".//*[@id='signin_info']/a[1]");
	@FindBy(xpath=".//*[@id='signin_info']/a[2]") WebElement RegistrationLink;
}