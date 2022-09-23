package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CompleteLoginLocatorSalesForce {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\CHITTARANJAN _SWAIN_D_Drive\\STUDY\\Software\\chromedriver_win32\\chromedriver.exe");
		 	WebDriver driver = new ChromeDriver();
			driver.get("https://login.salesforce.com/");
			driver.manage().window().maximize(); 
			driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 username']")).sendKeys("Hello");
		//without tagname
			driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Hello"); // with tagname
			//driver.findElement(By.cssSelector("#Login")).click();	// using # before ID
			driver.findElement(By.cssSelector(".button.r4.wide.primary")).click(); 
		//Using dot in class	where multiple words are there
			driver.close();
	}
		}
