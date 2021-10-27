package Pack123;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
    private WebDriver driver;
    private WebDriverWait wait;
    
	@FindBy (xpath = "//input[@name='username']") 
	private WebElement useName;
	
	@FindBy (xpath = "//input[@name='pwd']") 
	private WebElement password;
	
	@FindBy (xpath = "//a[text()='Login']") 
	private WebElement logIn;
	
	@FindBy (xpath = "//a[text()='Login']") 
	private List<WebElement> logIn1;
	
	public LoginPage(WebDriver driver){    // driver = driver = new ChromeDriver()
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 20);
		PageFactory.initElements(driver, this);
	}
	
	public void sendUserName()
	{
		wait.until(ExpectedConditions.visibilityOf(useName));  
		wait.until(ExpectedConditions.elementToBeClickable(useName));
		useName.sendKeys("admin");
	}
		
	public void sendPassword()
	{
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys("manager");
	}
	
	public void clickOnlogIn()
	{
		
		logIn.click();
	}
	
	public String getLogInText()
	{
		String text = logIn.getText();
		return text;
	}
	
	public void loginActiTime() {
		useName.sendKeys("admin");
		password.sendKeys("manage");
		logIn.click();
	}
	
}
