package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_Regular_Exp {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\A_CHITTARANJAN_DOMAIN\\Software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.rediff.com/"); 
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("a[title*='Sign in']")).click(); 
	//searches for 'Sign in' keyword & finds the title which matches it first.
	driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Hello");
	driver.findElement(By.cssSelector("#password")).sendKeys("Hello"); // filling password field using CSS
	//it can be input#passowrd (tagname#id) or #password (#id)
    driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
    //Using regular expression in xpath	
    driver.close();
	}
}

