package package001;

import com.thoughtworks.selenium.DefaultSelenium;


public class SeleniumRC001 {

	public static void main(String[] args) {
		
		DefaultSelenium ds = new DefaultSelenium("localhost", 4444, "*firefox C:\\Users\\ext-sdasari\\AppData\\Local\\Mozilla Firefox\\firefox.exe", "https://easy.techmahindra.com");
		ds.start();
		ds.open("/");
		ds.windowMaximize();
		ds.type("id=txtLanId", "SD00477954");
		ds.type("id=txtPassword", "143muMm@18");
		ds.click("id=btnlogin");
		//ds.close();
	}

}
