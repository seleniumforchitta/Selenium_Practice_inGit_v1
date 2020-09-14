package seleniumAdvTopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\A_CHITTARANJAN_DOMAIN\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Now let's know how many frames are there in the page
		// System.out.println(driver.findElements(By.tagName("ifrane")).size());
		// So how to tell program that our webelemt is inside a frame
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		// in this CSS selector its tagname.class-name or iframe[class='demo-frame']
		driver.findElement(By.id("draggable")).click();
		// Now we will drag & drop
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		System.out.println("Drag & Drop is completed.");
	}
}
