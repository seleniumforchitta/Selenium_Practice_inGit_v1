package BrowserStack;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

public class BrowserStackSampleTest {
  public static final String USERNAME = "chittaranjanswai1";
  public static final String AUTOMATE_KEY = "E7DyjUzrQBMqci1cJE3H";
  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
  public static void main(String[] args) throws Exception {
    DesiredCapabilities caps = new DesiredCapabilities();
    
    caps.setCapability("os", "Windows");
    caps.setCapability("os_version", "10");
    caps.setCapability("browser", "Chrome");
    caps.setCapability("browser_version", "latest");
    caps.setCapability("project", "Practice");
    caps.setCapability("build", "Practice-1");
    caps.setCapability("name", "Practice-Run");
    caps.setCapability("browserstack.local", "false");
    caps.setCapability("browserstack.selenium_version", "3.14.0");
    caps.setCapability("name", "chittaranjanswai1's First Test");
    
    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    driver.get("http://www.google.com");
    WebElement element = driver.findElement(By.name("q"));

    element.sendKeys("BrowserStack");
    element.submit();

    System.out.println(driver.getTitle());
    driver.quit();
  }
}