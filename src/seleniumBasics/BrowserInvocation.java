package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInvocation {
	public static void main(String[] args) {
		System.out.println("Welcome to Selenium !!!");
		System.setProperty("webdriver.chrome.driver", "C:\\CHITTARANJAN _SWAIN_D_Drive\\STUDY\\Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle()); //it will give the title
		//System.out.println(driver.getPageSource()); //To get the page source
		
		System.out.println("Webpage is opened now !!!");
		System.out.println(driver.getCurrentUrl()); // retrieves the current URL that is opened the browser
		//driver.close(); //Closes the entire browser
		driver.quit(); // only closes the tab that the link is opened		
	}
}
