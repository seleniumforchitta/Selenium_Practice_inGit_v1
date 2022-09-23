package differentWebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\CHITTARANJAN _SWAIN_D_Drive\\STUDY\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@value='Cheese']")).click();

		// Below code will count the number of radio buttons
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		// Now without value attribute still, I want to click on that radio button
		for (int i = 0; i < count; i++) {
			// driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			// get will give us which element has to be clicked.
			// Now it will click on each item one by one.
			// Now clicking on the item when we find "cheese".
			String s = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if (s == "cheese") {
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}
	}
}
