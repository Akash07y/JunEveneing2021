package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMPckage.LoginPage;

public class TestClass1 {
	
	int r = 0;
	
	private LoginPage loginPage;
	private WebDriver driver;
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Class\\New folder\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp") ;
	}
	@BeforeMethod
	public void beforeMethod(){
		 loginPage = new LoginPage(driver);
	
	}
	
	@Test (invocationCount = 5)
	public void testA() throws InterruptedException {
		System.out.println("TestA ClassC");
	
		
		r ++;
	}
	
	@Test 
	public void testB() {
		System.out.println("TestB ClassC");
	}
	
	@Test 
	public void testC() throws InterruptedException {
		System.out.println("TestC ClassC");
	}
	
	@Test 
	public void testD() {
		System.out.println("TestD ClassC");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("after method ClassC");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("after class ClassC");
		driver = null;
		loginPage = null;
		System.gc();
	}
}
