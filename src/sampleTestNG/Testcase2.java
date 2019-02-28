package sampleTestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Testcase2 {
	
	WebDriver driver; 
	@Test(groups = "regression")
	public void group2() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://cricbuzz.com");
		System.out.println("cricbuzz is opened successfully");
	}

}
