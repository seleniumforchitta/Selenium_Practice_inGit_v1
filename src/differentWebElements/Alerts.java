package differentWebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\CHITTARANJAN _SWAIN_D_Drive\\STUDY\\Software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//Click on confirmation alert
	driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
	//Now Java POP-UP will open , to which we will not be able spy.
	//Now we have to change our driver web element to Alert
	System.out.println(driver.switchTo().alert().getText());//logic is written later
	driver.switchTo().alert().accept();
	//If you have to click on OK/YES/done or any positive kind of scenario then	
	//you need to use accept();
	//If we want to click on any negative options, then we need to use below
	//driver.switchTo().alert().dismiss();
	//if we want to verify the text that getting displayed is correct or not
	//driver.switchTo().alert().getText();//This we need to use it before accept();
	//Suppose we want to give input inside popup, then we need to use below
	//driver.switchTo().alert().sendKeys(arg0);
	
   }
}
