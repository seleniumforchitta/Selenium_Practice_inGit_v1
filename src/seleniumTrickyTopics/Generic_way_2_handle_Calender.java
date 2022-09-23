package seleniumTrickyTopics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Generic_way_2_handle_Calender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\CHITTARANJAN _SWAIN_D_Drive\\STUDY\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		// Aug 23 - How click on a perticular date
		driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
		// As we saw from the HTML tags from calender that all the dates falls under
		// >day class. Now we will take all the dates into a list

		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText()
				.contains("April")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}

		// Here while loop will give us the month, it will go inside the loop, whenever
		// it will not find the month"April"

		//List<WebElement> dates = driver.findElements(By.className("day"));
		// Grab the common attribute , put it into and iterate
		int count = driver.findElements(By.className("day")).size();
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase("26")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}

		}
		System.out.println("Test execution completed !");
	}

}
