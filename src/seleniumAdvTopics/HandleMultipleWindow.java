package seleniumAdvTopics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\A_CHITTARANJAN_DOMAIN\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/SignUp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
		System.out.println("Before switching to child !!!");
		System.out.println(driver.getTitle());
		// In above line it will give the title of parent window
		// Now we need to get the title of child window
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids.size());
		// This will give all the open window IDs that is opened at the moment
		// below iterator will used for iterating on all the IDs and get whenever is ID
		// is needed
		Iterator<String> it = ids.iterator();
		String parentID = it.next();
		String childID = it.next();// it will take to the child window
		driver.switchTo().window(childID); // it will switch to the window depending on the ID
		// > that is passed to the window()
		System.out.println("After switching to child !!!");
		System.out.println(driver.getTitle());// it will print the child title
		// All the operation you will do now , it will from child window
		// Now how to switch back to parent window
		driver.switchTo().window(parentID);
		System.out.println("After switching back to parent again !!!");
		System.out.println(driver.getTitle());// it will print the parent title
	}
}
