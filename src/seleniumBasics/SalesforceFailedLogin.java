package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SalesforceFailedLogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\CHITTARANJAN _SWAIN_D_Drive\\STUDY\\Software\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/"); //URL OF THE BROWSER
		driver.manage().window().maximize(); //Maximizes the window 
		driver.findElement(By.cssSelector("#username")).sendKeys("GION54074");  //By CSSSELECTOR	
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("GION54074");  // BY Xpath
		driver.findElement(By.xpath("//*[@id='Login']")).click();	//BY XPATH
		System.out.println("Printing the error message below - ");	
		 System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		 System.out.println(driver.getTitle());
		assert driver.getPageSource().contains("salesforce");
		System.out.println("Login attempt completed successfully!!!");	
		driver.close();
		
	}
}
