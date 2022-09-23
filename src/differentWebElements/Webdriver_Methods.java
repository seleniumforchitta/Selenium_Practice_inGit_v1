package differentWebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\CHITTARANJAN _SWAIN_D_Drive\\STUDY\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(" Before clicking on multi-city radio button ");

		System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());
		// isDisplayed() will check , if the UI element is in visible mode or not.
		driver.findElement(By.xpath(".//*[@id='multicity']/label")).click();
		System.out.println(" After clicking on multi-city radio button ");
		System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());
		int count = driver.findElements(By.xpath(".//*[@id='multicity']/label")).size();
		// Only driver.findElements will have size() method , driver.findElement will
		// not have
		if (count == 1) {
			System.out.println("Web element present though it is not visible!!!");
			// this is the difference between .size() and .isdisplayed()
			// size will check if the element is present or not or how many element present
			// But isdisplayed() will give if the elements are present but not visible
		}
		Thread.sleep(3000L);
		//Now we learn calender
		driver.findElement(By.xpath(".//*[@id='hp-widget__depart']")).click();
		//Below is the way to click on a calender date when the date is given in A HREF value
		//in this case xpath&css may not work , use linkText
		driver.findElement(By.linkText("20")).click();
		//Below it will choose 6 passengers
		driver.findElement(By.xpath(".//*[@id='hp-widget__paxCounter']")).click();
		driver.findElement(By.xpath(".//*[@id='js-adult_counter']/li[6]")).click();
		driver.findElement(By.xpath(".//*[@id='jsfilterOptins']/div/div[9]/div[1]/a")).click();

		//driver.findElement(By.xpath(".//*[@id='dp1515127469077']/div/div[1]/table/tbody/tr[4]/td[7]")).click();

		//if you want to validate object which is prespent in web page or code base 
		//then we have to use .size()

		//Now we will discuss on the topic isEnabled()
		//Now we will discuss on getText()
		System.out.println(driver.findElement(By.xpath(".//*[@id='fd-wrap']/div[2]/h2")).getText());
		//it will o/p as Discover Hot Deals

	}
}
