    package seleniumTrickyTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Handing_Cricbuzz {

	public static void main(String[] args) {
		int sum = 0;
		System.setProperty("webdriver.chrome.driver", "C:\\CHITTARANJAN _SWAIN_D_Drive\\STUDY\\Software\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"http://www.cricbuzz.com/live-cricket-scorecard/17695/aus-vs-eng-3rd-odi-england-tour-of-australia-2018");
		driver.manage().window().maximize();
		// Now lets search a perticular table where we want to check our test case
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		// Now lets use that table to get the other elements
		// Now lets a go the class name of each row
		//int rowcount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		// Now we click on the 3rd chlid of the row
		int batsman_count = table
				.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();

		for (int i = 0; i < batsman_count - 2; i++) {
			String value = table
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)
					.getText();
			// Now let's convert string value into int
			int valueInt = Integer.parseInt(value);
			sum = sum + valueInt;
		}
		System.out.println("Sum of all the runs without extra :" + sum);

		// Now reading the element based on a string
		String extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		System.out.println("Extra runs :" + extras);
		int extraInt = Integer.parseInt(extras);
		int TotalInt = extraInt + sum;
		System.out.println("Sum of all the runs & extra :" + TotalInt);
		String ActualTotal = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int ActualTotalInt = Integer.parseInt(ActualTotal);
		if (TotalInt == ActualTotalInt) {
			System.out.println("Count Matches !!!");
		} else
			System.out.println("Count has not matched !!!");
		driver.quit();
	}

}
