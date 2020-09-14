package differentWebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownNewtours {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\A_CHITTARANJAN_DOMAIN\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("userName")).sendKeys("ch245510");
		driver.findElement(By.name("password")).sendKeys("ch245510");
		driver.findElement(By.name("login")).click();
		// Now to select a dropdown item, there is a class called select
		Select s = new Select(driver.findElement(By.name("passCount")));
		s.selectByValue("2"); // open all the child tags of ID , select whatever you want
		s.selectByIndex(3); // index starts from 0.
		s.selectByVisibleText("1"); // the space that follows the visible text will not be considered
	}
}
