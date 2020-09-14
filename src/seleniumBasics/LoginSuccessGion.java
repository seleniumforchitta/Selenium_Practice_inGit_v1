package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginSuccessGion {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\A_CHITTARANJAN_DOMAIN\\Software\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.get("https://customer.i-on.in/login"); 
		driver.manage().window().maximize(); 
		//driver.findElement(By.xpath("//a[contains(text(),'Customer Login')]")).click();
		driver.findElement(By.cssSelector("#user")).sendKeys("GION54074");  	
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("GION54074");  
		driver.findElement(By.xpath("//*[@id='login']/input")).click();	
		System.out.println("Login attempt completed successfully !!!");	
	}
}
