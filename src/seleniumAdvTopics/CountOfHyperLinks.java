package seleniumAdvTopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfHyperLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\A_CHITTARANJAN_DOMAIN\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Count of the links in the entire page
		System.out.print("Total number links in ebay website page : ");
		System.out.println(driver.findElements(By.tagName("a")).size());
		// Count of links in the footer section of the page
		WebElement footer = driver.findElement(By.xpath("//footer[@id='glbfooter']"));
		// Now in the above line I have created a footer webelemt and bu that webelement
		// >I will count the number of links present in footer section.
		// The above is way to create driver object for footer section
		System.out.print("Number links present in footer section : ");
		System.out.println(footer.findElements(By.tagName("a")).size());
		// get the links of all links present in 2nd column of footer section
		WebElement footer_col2 = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		System.out.print("Number links present in 2nd column of footer section : ");
		System.out.println(footer_col2.findElements(By.tagName("a")).size());
		// Now we want to print all the links of 2nd column
		String beforeClicking = null;
		String afterClicking;
		System.out.println("Print ing all the links of 2nd column below !!! ");
		for (int i = 0; i < footer_col2.findElements(By.tagName("a")).size(); i++) {
			System.out.println(footer_col2.findElements(By.tagName("a")).get(i).getText());
			// Now I need to click on the "Site map" link present in the 2nd column
			// Suppose the "Site map" link is dynamic , it changes it's place everyday
			if (footer_col2.findElements(By.tagName("a")).get(i).getText().contains("Site map")) {
				// checking what is the link title before clicking
				System.out.print("Title of main page : ");
				System.out.println(driver.getTitle());
				beforeClicking = driver.getTitle();
				footer_col2.findElements(By.tagName("a")).get(i).click();
				// When we get sitemap , then it will open in another page , so now when
				// >we traverse again in the for loop it will throw error ,So, break it.
				break;
			}
		}
		System.out.print("Now the title of newly opened page : ");
		System.out.println(driver.getTitle());
		afterClicking = driver.getTitle();
		// Now compare the old and new page titles
		if (beforeClicking != afterClicking) {
			boolean abc = driver.findElement(By.xpath("html/body/div[2]/div[1]/h1")).isDisplayed();
			if (abc == true) {
				System.out.print("Text present in SiteMap page is : ");
				System.out.println(driver.findElement(By.xpath("html/body/div[2]/div[1]/h1")).getText());
				System.out.println("Test case is PASS !!!");
			}
		} else {
			System.out.println("Test case is FAIL !!!");
		}

	}
}
