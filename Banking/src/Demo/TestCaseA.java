package Demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCaseA{

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class A");
	}

	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before method A");
	}
	
	@Test
	public void demoA() {
		System.out.println("test A  from testclass A");
	}
	
	@Test (timeOut = 3000)  // mili seconds
	public void demoB() throws InterruptedException {
		
		System.out.println("test B from testclass A");
		//Thread.sleep(5000);
		System.out.println("Hi");
	}
	
	@Test 
	public void demoC() {
		System.out.println("test C from testclass A");
		
	}
	
	@Test (priority = -1)
	public void demoD() {
		System.out.println("test D from testclass A");
	}
		
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method A");
	}

	@AfterClass
	public void afterClass() throws InterruptedException
	{
		System.out.println("after class A");
	}

	
}
