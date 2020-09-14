package seleniumTrickyTopics;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeOptions_for_SSL {

	public static void main(String[] args) {
		// SSL certificate

		// desired capability is a class to provide the knowledge to the browser
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		// ch.acceptInsecureCerts();
		// You can use the above or the below

		Proxy proxy = new Proxy();
		proxy.setHttpProxy("myhttpproxy:3337");
		ch.setCapability("proxy", proxy);
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions c = new ChromeOptions();
		// chromeoptions belongs to our own local chrome browser
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver",
				"D:\\A_CHITTARANJAN_DOMAIN\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		driver.get("google.com");
	}
}
