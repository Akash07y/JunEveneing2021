package Pack123;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass {
//	WebDriver driver;
//	LoginPage login;
//	@BeforeClass
//	public void beforeClass()
//	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\OneDrive\\Desktop\\chromedriver.exe");
//		driver = new ChromeDriver();
//		
//	}
//
//	@BeforeMethod
//	public void beforemethod()
//	{
//		driver.get("http://desktop-b2220qc/login.do") ;
//		login = new LoginPage(driver);
//	}
//	
//	@Test
//	public void testA() {
//		login.sendUserName();
//		login.sendPassword();
//		login.clickOnlogIn();
//		System.out.println("verification");
//	}
//		
//	@AfterMethod
//	public void afterMethod()
//	{
//		System.out.println("logOut");
//	}
//
//	@AfterClass
//	public void afterClass() throws InterruptedException
//	{
//		Thread.sleep(5000);
//		driver.close();
//	}

	public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp") ;
		Thread.sleep(3000);
		
		WebElement alert = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		WebElement confirm = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		WebElement promt = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
		WebElement linkeBreak = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
		
		//alert.click();
		//or
		
		Actions act = new Actions(driver);
		
		act.moveToElement(alert).click().build().perform();
		
		
//		act.click();   //  left click 
//		act.doubleClick();  // double left click
//		act.contextClick();  // right click
//		act.moveToElement(target);  // move pointer to target elelement
//		act.dragAndDrop(source, target);   // drag source ele and drop on target ele
//		act.build();   // to combine 2 or more methods of actions class in single statement
//		act.perform();  // to execute the mouse actions on browser
		
		
		
//		alert.click();  //  4
//		confirm.click();  //3 
//		promt.click();     //2 
//		linkeBreak.click();  //1
//		
//		String addr = driver.getWindowHandle();   // Main Page
//		System.out.println(addr);
//		//Set<String> addr1 = driver.getWindowHandles();  // Main Page + All child browser popup
//		
//		ArrayList<String> allAddr =  new ArrayList<String>(driver.getWindowHandles());
//		
//		driver.switchTo().window(allAddr.get(0));
//		String url = driver.getCurrentUrl();
//		System.out.println(allAddr.get(0)  +  "  "  + url);
//		
//		driver.switchTo().window(allAddr.get(1));
//		url = driver.getCurrentUrl();
//		System.out.println(allAddr.get(1)  +  "  "  + url);
//		
//		driver.switchTo().window(allAddr.get(2));
//		url = driver.getCurrentUrl();
//		System.out.println(allAddr.get(2)  +  "  "  + url);
//		
//		driver.switchTo().window(allAddr.get(3));
//		url = driver.getCurrentUrl();
//		System.out.println(allAddr.get(3)  +  "  "  + url);
//		
//		driver.switchTo().window(allAddr.get(4));
//		url = driver.getCurrentUrl();
//		System.out.println(allAddr.get(4)  +  "  "  + url);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		
//		
//		
//		
//		
//		Thread.sleep(5000);
//		
//		Alert alt = driver.switchTo().alert();
//		
//		String text = alt.getText(); 
//		System.out.println(text);
//		alt.dismiss();
//		
//		
//		
//		alt.accept();   // OK, Yes, Accept, Continue
//		alt.dismiss();  // No, Cancel, 
//		alt.sendKeys("Velocity");  // to send the text on alert 
//		String text = alt.getText();       // to get the text on alert
//		
//		
		
		
		
		
		
		
		
		
//		
//		// waiting time
//		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
//				
//				//  waiting + condition 
//		WebDriverWait wait = new WebDriverWait(driver,10);  // 10 seconds
//				
//		WebElement useName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='uame']")));
//				
//				
//		useName.sendKeys("Velocity");
				
		
//		LoginPage loginPage = new LoginPage(driver);
//			
//		loginPage.sendUserName();
//		loginPage.sendPassword();
//		loginPage.clickOnlogIn();
//		
//		Thread.sleep(3000);
//		
//		HomePage homePage  = new HomePage(driver);
//		homePage.openReport();
//		
//		String url = driver.getCurrentUrl();
//		
//		System.out.println(url);
//		
//		if(url.equals("http://desktop-b2220qc/reports"))
//		{
//			System.out.println("PASS");
//		}
//		else
//		{
//			System.out.println("FAIL");
//		}
		
		
		
		// waiting time
		//driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		//  waiting + condition 
//		WebDriverWait wait = new WebDriverWait(driver,30);  // 10 seconds
//		
//		WebElement useName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='uame']")));
//		
//		
//		useName.sendKeys("Velocity");
		
		
		// waiting time + condition + polling frequency
		
//		
//		Wait<WebDriver> wait =  new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(20))   // max waiting time
//				.pollingEvery(Duration.ofMillis(100))   // polling freq. to check condtion
//				.ignoring(NoSuchElementException.class);  // condition
//		
//		
//		WebElement ele = wait.until(new Function<WebDriver,WebElement>(){
//			
//			public WebElement apply(WebDriver driver)
//			{
//				return driver.findElement(By.xpath("//input[@name='uame']"));
//			}
//			
//		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		LoginPage loginPage = new LoginPage(driver);
//		
//		String text = loginPage.getLogInText();
//		
//		if(text.equals("LogIn"))
//		{
//			
//		}
//		else {
//			
//		}
//		
//		loginPage.sendUserName();
//		loginPage.sendPassword();
//		loginPage.clickOnlogIn();
//		
//		Thread.sleep(3000);
//		
//		HomePage homePage  = new HomePage(driver);
//		homePage.openReport();
//		
//		String url = driver.getCurrentUrl();
//		
//		System.out.println(url);
//		
//		if(url.equals("http://desktop-b2220qc/reports"))
//		{
//			System.out.println("PASS");
//		}
//		else
//		{
//			System.out.println("FAIL");
		}
		
	
	
}
