package seleniumTrickyTopics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kill_A_Running_Process {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\A_CHITTARANJAN_DOMAIN\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Killing excel opened in our system now
		// WindowsUtils.killByName("excel.exe");
		//kILL BY NAME IS DEPRICATED NOW ... SO HERE IS A ALTERBATIVE

		if (System.getProperty("os.name").contains("excel")) {
			Process process = Runtime.getRuntime().exec("taskkill /F /IM excel.exe /T");
			process.destroy();
		}

		driver.get("https://www.google.co.in/");
	}

}
