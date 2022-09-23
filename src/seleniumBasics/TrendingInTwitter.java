package seleniumBasics;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrendingInTwitter {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\CHITTARANJAN _SWAIN_D_Drive\\STUDY\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/"); // URL OF THE BROWSER
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		//driver.findElement(By.xpath("//input[text()='Use phone, email or username']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@autocomplete='username']")).click();
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("9692195204");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='password']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Hello@123");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		Thread.sleep(5000);
		//#TejRan 
		for(int i=0;i<100;i++)
		{
		driver.findElement(By.xpath("//div[@aria-label='Tweet text']/div/div/div")).click();
		Random rand = new Random();
		int rand_int1 = rand.nextInt(1000);
		driver.findElement(By.xpath("//div[@aria-label='Tweet text']/div/div/div"))
		.sendKeys("Best Love story I've experienced ever. In love with @itsmetejasswi \r\n"
				+ "#KaranKundrra #TejasswiPrakash #Tejran\r\n"
				+ "#BBQueenTejasswi \r\n"
				+ "SABKE DIL MEIN KARAN"+rand_int1);
		driver.findElement(By.xpath("(//span[text()='Tweet'])[2]")).click();
		driver.navigate().refresh();
		Thread.sleep(5000);
		}
		
		
	}
}
