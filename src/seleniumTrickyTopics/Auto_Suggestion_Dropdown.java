package seleniumTrickyTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Auto_Suggestion_Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\A_CHITTARANJAN_DOMAIN\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://fantasycricket.dream11.com/IN/");
		WebDriverWait wd = new WebDriverWait(driver, 7);
		// it will wait for the element maximum up to the given time, whenever an
		// element is found it will continue its execution without waiting for the whole
		// second mentioned here - This is explicit wait
		// But in case thread.sleep(3000) - Though it has found in 1 sec, still it will
		// wait for 7 sec.
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='m_rtxtEmail1']")).sendKeys("chit");
		wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='m_frmRegister']/div[1]/ul")));
		// in above it waits for auto suggestion & below it clicks on one of them
		driver.findElement(By.xpath(".//*[@id='m_frmRegister']/div[1]/ul/li[2]/p")).click();

	}

}
