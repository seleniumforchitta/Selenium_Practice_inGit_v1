package seleniumBasics;
import  org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Welcome to Selenium !!!");
		System.setProperty("webdriver.chrome.driver", "C:\\CHITTARANJAN _SWAIN_D_Drive\\STUDY\\Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/"); //URL OF THE BROWSER
		driver.findElement(By.id("email")).sendKeys("9790917775");
		driver.findElement(By.name("pass")).sendKeys("XXXYYY");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		String ErrorMsg = driver.findElement(By.xpath("//div[@id='loginform']/div[2]/div[2]")).getText();
		System.out.println(ErrorMsg);
		System.out.println(ErrorMsg.equals("The password that you've entered is incorrect. Forgotten password?"));
		driver.close();
	}
}
