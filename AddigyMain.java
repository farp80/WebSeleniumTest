package addigy.fidel.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddigyMain {

	WebDriver webDriver;
	
	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fidel\\Downloads\\chromedriver_win32\\chromedriver.exe");	
			System.setProperty("org.apache.xalan.extensions.bsf.BSFManager","http://www.org.apache.bsf.BSFManager");

			webDriver = new ChromeDriver();
			webDriver.manage().deleteAllCookies();
			webDriver.manage().window().maximize();
			webDriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			webDriver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			
			webDriver.get("https://dev.addigy.com/signup");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 AddigyMain firstStep = new AddigyMain();
	 firstStep.invokeBrowser();

	}

}
