package seleniumAdvTopics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\CHITTARANJAN _SWAIN_D_Drive\\STUDY\\Software\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Before switching to child !!!");
		driver.findElement(By.xpath("//a[@title='Naukri FastForward- Resume Services']")).click();
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
		System.out.println(driver.getTitle());
		System.out.println("Before switching to child !!!");
		driver.switchTo().window(childID); // it will switch to the window depending on the ID
		// > that is passed to the window()
		System.out.println("After switching to child !!!");
		System.out.println(driver.getTitle());// it will print the child title
		// All the operation you will do now , it will from child window
		// Now how to switch back to parent window
		driver.switchTo().window(parentID);
		System.out.println("After switching back to parent again !!!");
		System.out.println(driver.getTitle());// it will print the parent title
		driver.switchTo().window(childID);
		System.out.println("After switching to child !!!");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
