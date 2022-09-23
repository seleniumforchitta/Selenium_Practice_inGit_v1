package seleniumBasics;
import java.io.IOException;

import  org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CountHyperLinks {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println("Welcome to Selenium !!!");
		System.setProperty("webdriver.chrome.driver", 
				"C:\\CHITTARANJAN _SWAIN_D_Drive\\STUDY\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.javatpoint.com/java-tutorial"); //URL OF THE BROWSER
		int totalLinks = driver.findElements(By.tagName("a")).size();
		System.out.println("CountHyperLinks - "+totalLinks);	
		Runtime.getRuntime().exec("taskkill /f /t /IM EXCEL.EXE");
		driver.close();
	}
}
