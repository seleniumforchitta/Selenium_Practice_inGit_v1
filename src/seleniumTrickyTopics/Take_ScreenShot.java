package seleniumTrickyTopics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils; 
// if you don't have this package then download
//https://commons.apache.org/proper/commons-io/download_io.cgi

public class Take_ScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\A_CHITTARANJAN_DOMAIN\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");

		// Below is the way to take screenshot
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now we will copy the screenshot into our system
		FileUtils.copyFile(src, new File("D:\\A_CHITTARANJAN_DOMAIN\\google.jpeg"));
		// You can put this C driver, you need to have admin rights and its complicated
		// if you don't have any other directory except C then direct it to User folder
		// in C

	}

}
