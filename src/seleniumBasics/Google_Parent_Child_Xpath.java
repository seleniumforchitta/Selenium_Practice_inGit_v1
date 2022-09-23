package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Parent_Child_Xpath {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\CHITTARANJAN _SWAIN_D_Drive\\STUDY\\Software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
     driver.get("https://www.google.co.in/");
     driver.manage().window().maximize();
     driver.findElement(By.xpath("//input[@aria-label='Search']")).click();
     //Above one will search image tab and gets the xpath from parent to child
     driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("Chittaranjan");
     //Above one will get the xpath for search box using parent to child traversal
     driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys(Keys.ENTER);
     driver.close();
	}
}
