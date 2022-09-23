package seleniumAdvTopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\CHITTARANJAN _SWAIN_D_Drive\\STUDY\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Below is the way to create a action claa object
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		// How enter string in capital letters in any search box.
		// Below we are using a text field and sending some text(in CAPs)
		// a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		// In above syntax we are pressing the shift button and writng some text
		// Now how to double click on the entire text selected
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).doubleClick().build().perform();

		// a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		// In stead of the above one, we can use it using a webelement variable also.
		a.moveToElement(move).build().perform();
		// When we create an action then we have to build()& perform()it, bcoz build
		// makes it ready to execute.
		// By using build we can make some composite actions also
		// Now let's right click on that element
		a.moveToElement(move).contextClick().build().perform();
		// Action class has a feature called drag & drop, that we will learn in the
		// frames class
		driver.close();
	}
}
