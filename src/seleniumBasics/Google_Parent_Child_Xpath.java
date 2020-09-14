package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Parent_Child_Xpath {

public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "D:\\A_CHITTARANJAN_DOMAIN\\Software\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.google.co.in/");
     driver.findElement(By.xpath("//div[@class='gb_jegb_Rgb_Dggb_ug']/div[2]/a")).click();
     //Above one will search image tab and gets the xpath from parent to child
     driver.findElement(By.xpath("//div[@class='lst-c']/div/div[2]/div/input")).sendKeys("Chittaranjan");
     //Above one will get the xpath for search box using parent to child traversal
     driver.findElement(By.xpath("//div[@class='sbibod']/button/span/svg")).click();		
	}
}
