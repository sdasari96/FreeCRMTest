package junitpackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePOM 
{
	@FindBy(xpath=".//*[@id='txtLanId']") WebElement Uid;
	@FindBy(xpath=".//*[@id='txtPassword']") WebElement Pass;
}
