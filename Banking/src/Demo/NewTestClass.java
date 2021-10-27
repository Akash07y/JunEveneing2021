package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pack123.LoginPage;

public class NewTestClass {

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class");
	}

	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before method");
		System.out.println("before method");
		System.out.println("before method");
		System.out.println("before method");
		System.out.println("before method");
	}
	
	@Test
	public void testA() {
		System.out.println("test A");
	}
	
	@Test (timeOut = 3000)  // mili seconds
	public void testB() throws InterruptedException {
		
		System.out.println("test B");
		//Thread.sleep(5000);
		System.out.println("Hi");
	}
	
	@Test 
	public void testC() {
		System.out.println("test C");
		
	}
	
	@Test (priority = -1)
	public void testD() {
		System.out.println("test D");
	}
		
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method");
	}

	@AfterClass
	public void afterClass() throws InterruptedException
	{
		System.out.println("after class");
	}

	
	
	
}
