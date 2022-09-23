/*package seleniumAdvTopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\A_CHITTARANJAN_DOMAIN\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#ch_login_icon>span")).click();
		driver.findElement(By.cssSelector("#ch_login_email")).sendKeys("emailtochitta@gmail.com");
		driver.findElement(By.cssSelector("#ch_login_password")).sendKeys("XXXXXXXXX");
		driver.findElement(By.cssSelector("#ch_login_btn")).click();
		driver.findElement(By.id("header_tab_hotels")).click();
		driver.findElement(By.id("hp-widget__sDest")).click();
		driver.findElement(By.id("hp-widget__sDest")).sendKeys("GOA");
		driver.findElement(By.id("hp-widget__chkIn")).click();
		driver.findElement(By.linkText("20")).click();
		driver.findElement(By.linkText("21")).click();
		driver.findElement(By.id("hp-widget__paxCounter")).click();
		driver.findElement(By.xpath(".//*[@id='js-adult_counter']/li[3]")).click();
		driver.findElement(By.linkText("Done")).click();
		// driver.findElement(By.className("close_pax
		// pull-right")).sendKeys(Keys.ENTER);
		// above it is mentioned, how to hit enter , but it's not useful here.
		driver.findElement(By.id("searchBtn")).click();
		// Now using Explicit wait which is applicable to only next load not for all
		// load
		WebDriverWait d = new WebDriverWait(driver, 20);
		// We can keep implicit wait and explicit wait for both together, in that case
		// >implicit wait time will be applicable for all but explicit wait timing will
		// be applicable loads controlled by "d" object , see below
		// Below will click on the first hotel of the search results
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='listingSortDropDown']/button")));
		// there are several functionality for Expected Conditions
		driver.findElement(By.xpath(".//*[@id='listingSortDropDown']/button")).click();
		driver.findElement(By.id("2")).click();
		// You need to apply the explicit wait before each loading , like below
		d.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-hotelName-0")));
		driver.findElement(By.id("js-hotelName-0")).click();
		// implicit wait doesn't have condition but explicit wait have so many
		// condition.
	}
}
*/
