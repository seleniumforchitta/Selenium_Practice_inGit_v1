package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FollowingSibling_QAcademy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\A_CHITTARANJAN_DOMAIN\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com"); //URL OF THE Webpage
		driver.manage().window().maximize(); //Maximizes the window 
		driver.findElement(By.xpath("//*[@id=\"homepage\"]/header/div[2]/div/nav/ul/li[4]/a")).click();
		System.out.println("Kouthi");
		driver.findElement(By.xpath("//*[@id='tablist1-tab1']")).click();
		System.out.println("Eithi");
		driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[1]")).click();
		driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[2]")).click();
		driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[3]")).click();
		driver.close();
	}
}
