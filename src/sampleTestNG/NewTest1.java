package sampleTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.SkipException;
import org.testng.annotations.*;

public class NewTest1 {

	public WebDriver driver;
	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Before Method of second test Browser is lauched successfully");
	}
	@BeforeClass
	public void maximize() {
		try {
			driver.manage().window().maximize();
			System.out.println("the wondow is maximized succesfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("The before class of second test the window is thorwing erorr");
		}
	}
	
	@BeforeTest
	public void sample() {
		try {
			System.out.println("The before test of second test is succesfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("The before test of second test is unsuccesfully");
		}
	}
//	@Test(priority = 1)
//	public void g() throws InterruptedException {
//
//
//		driver.get("https://www.gmail.com");
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
//			System.out.println("The gmail log in is not successfully");
//		}
//	}
	@Test//(priority = -4, enabled=false)
	//@Test
	public void a() {
		driver.get("https://www.amazon.in");
		System.out.println("amazon is logged in successfully");
	}
	//@Test//(priority = 0)
	@Test
	public void cricb() {
		driver.get("https://www.cricbuzz.com");
		System.out.println("cricbuzz is logged in successfully");
		//throw new SkipException("Skipping this case");
				//System.out.println("The test case is skipped");
	}
	
	//@Test//(priority = 1)
	@Test
	public void flip() {
		int a = 3;
		
		driver.get("https://www.google.com");
		System.out.println("google is logged in successfully");
//		System.out.println("Im in Conditional Skip");
//		if(a>0)
//		throw new SkipException("Skipping this exception");
//		System.out.println("Executed Successfully");
//		driver.get("https://www.google.com");
//		System.out.println("google is logged in successfully");
//		System.out.println("Im in Conditional Skip");


	}
	
	@AfterTest
	public void printStatement1() {
		try {
		System.out.println("the after test of second test is passed");
		}
		catch(Exception e){
			System.out.println("the after test of second test is failed");
		}
	}
	
	@AfterMethod
	public void terminate() {
		System.out.println("browser is going to close");
		driver.close();
	}

	@AfterClass
	public void printStatement() {
		try {
		System.out.println("the after class of second class is passed succesfully");
		}
		catch(Exception e){
			System.out.println("the after class of second class is failed");
		}
	}
	
	
}
