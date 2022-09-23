package seleniumAdvTopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\CHITTARANJAN _SWAIN_D_Drive\\STUDY\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
		// Below will click on the first hotel of the search results
		driver.findElement(By.xpath(".//*[@id='listingSortDropDown']/button")).click();
		driver.findElement(By.id("2")).click();
		driver.findElement(By.id("js-hotelName-0")).click();
	}
}
