package differentWebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDownSpiceJet {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\CHITTARANJAN _SWAIN_D_Drive\\STUDY\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("2");// open all the child tags of ID , select whatever you want
		s.selectByIndex(3);// index starts from 0.
		s.selectByVisibleText("1");
		//the space that follows the visible text will not be considered
		// We can use above functions only when there is select tag
		// Now we need to select from location
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		// a[@value='GOI']
		driver.findElement(By.xpath("//a[@value='GOI']")).click(); // FROM
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click(); // TO
		// Both To & from are having same code here in the html
		// (//a[@value='DEL'])[2] - This will go the 2nd instance of the same XPATH - (Most Important)
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		// isSelected(); will be used to check if it already selected or not
		//Clicking checkbox below
		driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
		// Now checking whether checkbox is selected or not
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());

	}
}
