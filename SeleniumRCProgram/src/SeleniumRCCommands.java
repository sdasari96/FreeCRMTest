import com.thoughtworks.selenium.DefaultSelenium;


public class SeleniumRCCommands {

	public static void main(String[] args) 
	{
		DefaultSelenium ds = new DefaultSelenium("localhost", 4444, "*firefox C:\\Users\\ext-sdasari\\AppData\\Local\\Mozilla Firefox\\firefox.exe", "http://");
		ds.start();
		//Step 1
		System.out.println("Step 1");
		ds.open("https://easy.techmahindra.com/");
		ds.windowMaximize();
		if(ds.isElementPresent("id=txtLanId")==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		String Rtitle = ds.getTitle();
		if(Rtitle.length()==20)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		if(Rtitle.startsWith("R")==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		if(Rtitle.contains("k") && Rtitle.contains("l")==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		if(Rtitle.contains("z")==false)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		if(Rtitle.endsWith("z") || Rtitle.endsWith("y")==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		//Step 2
		System.out.println("Step 2");
		ds.open("http://www.rediff.com/");
		ds.windowMaximize();
		ds.click("xpath=.//*[@id='signin_info']/a[2]");
		if(ds.isElementPresent("name=name4a1babdb")==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		
		System.out.println("Is Editable");
		if(ds.isEditable("xpath=.//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")==true)
			System.out.println("Is Editable");
		else
			System.out.println("Not Editable");
		
		String RedTitle=ds.getTitle();
		if(Rtitle.length() > RedTitle.length() == true)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		//Step 3
		System.out.println("Step 3");
		ds.type("xpath=.//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input", "Sneha Dasari");
		if(ds.isEditable("xpath=.//*[@id='tblcrtac']/tbody/tr[9]/td[3]/input")==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		if(ds.isTextPresent("abcdef")==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		//Step 4
		System.out.println("Step 4");
		ds.select("xpath=.//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]", "1");
		if(ds.isElementPresent("xpath=.//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]")==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		if(ds.isChecked("xpath=.//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[1]") && ds.isChecked("xpath=.//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[2]")==false)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		//Step 5
		System.out.println("Step 5");
		ds.click("xpath=.//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[2]");
		if(ds.isChecked("xpath=.//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[1]")==false)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		String[] Redlinks=ds.getAllLinks();
		if(Redlinks.length > ds.getAllButtons().length)
			System.out.println("Pass Links are " + Redlinks.length + "Buttons are "+ ds.getAllButtons().length);
		else
			System.out.println("Fail Links are " + Redlinks.length + "Buttons are "+ ds.getAllButtons().length);
		
		//Step 6
		System.out.println("Step 6");
		ds.open("https://in.yahoo.com/?guccounter=1");
		ds.windowMaximize();
		if(ds.getTitle().length() > Rtitle.length() && ds.getTitle().length() > RedTitle.length() == true)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		//Step 7
		ds.click("xpath=.//*[@id='uh-signin']");
		ds.type("xpath=.//*[@id='login-username']", "Sneha96");
		System.out.println("Step 7");
		String[] YLinks = ds.getAllLinks();
		if(YLinks.length > Redlinks.length && YLinks.length > 20==true)
			System.out.println("Pass " + YLinks.length);
		else
			System.out.println("Fail " + YLinks.length);
	}

}
