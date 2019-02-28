package sampleTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class NewTest {

	public WebDriver driver;
	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Before Method of first test Browser is lauched successfully");
	}
	@BeforeClass
	public void maximize() {
		try {
			driver.manage().window().maximize();
			System.out.println("the wondow is maximized succesfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("The before class of first test the window is thorwing erorr");
		}
	}
	
	@BeforeTest
	public void sample() {
		try {
			System.out.println("The before test of first test is succesfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("The before test of first test is unsuccesfully");
		}
	}
	@Test//(priority = 4)
	//@Test //(groups = "Regression")
	public void test_d() throws InterruptedException {


		driver.get("https://www.gmail.com");
//		driver.findElement(By.id("identifierId")).sendKeys("gopipj022");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		driver.findElement(By.name("password")).sendKeys("gopivilliers22");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		Thread.sleep(3000);
//		String element = driver.findElement(By.xpath("//div[text()='Compose']")).getText();
//		String correctEle = element.toLowerCase();
//		System.out.println(correctEle);
//		if(correctEle.equals("compose")) {
//			System.out.println("The gmail logged in successfully");
//		}
//		else {
			System.out.println("The gmail log in is not successfully");
//		}
	}
	@Test//(priority = 4)
	//@Test //(groups = "Regression")
	public void test_a() {
		driver.get("https://www.facebook.com");
		System.out.println("facebook is logged in successfully");
	}
	@Test//(priority = 2)
	//@Test //(groups = "Smoke")
	public void test_b() {
		driver.get("https://www.cricinfo.com");
		System.out.println("cricinfo is logged in successfully");
	}
	
	@Test//(priority = 3)
	//@Test //(groups = {"Smoke", "Regression"})
	public void test_c() {
		driver.get("https://www.flipkart.com");
		System.out.println("flipkart is logged in successfully");
	}
	
	@AfterTest
	public void printStatement1() {
		try {
		System.out.println("the after test of first test is passed");
		}
		catch(Exception e){
			System.out.println("the after test of first test is failed");
		}
	}
	
	@AfterMethod
	public void terminate() {
		System.out.println("after method of first test browser is going to close");
		driver.close();
	}

	@AfterClass
	public void printStatement() {
		try {
		System.out.println("the afterclass of first test is passed succesfully");
		}
		catch(Exception e){
			System.out.println("the after class of first test is failed");
		}
	}
	
	
}
