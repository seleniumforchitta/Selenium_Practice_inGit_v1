package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Verify;

public class  BasicLocators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\A_CHITTARANJAN_DOMAIN\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/"); //URL OF THE BROWSER
		driver.findElement(By.id("email")).sendKeys("9790917775");
		driver.findElement(By.name("pass")).sendKeys("XXXYYY");
		driver.findElement(By.linkText("Forgotten account?")).click();
		System.out.println(driver.getTitle());
		assert driver.getPageSource().contains("Facebook");
		assert driver.getTitle().matches("bbb");
		//softAssert.assertAll(); 
		Verify.verify(true, "Chitta", "Chitt");
		String s = null;
		driver.close();
	}
}
