package POMPckage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy (xpath = "//input[@name='timeTarack']") 
	private WebElement timeTrack;
	
	@FindBy (xpath = "//input[@name='task']") 
	private WebElement task;
	
	@FindBy (xpath = "//a[text()='report']") 
	private WebElement report;
	
    public HomePage(WebDriver driver1){
		
		PageFactory.initElements(driver1, this);
		
	}
	
    public void openTimeTarck()
	{
    	timeTrack.click();
	}
	
	public void openTask()
	{
		task.click();
	}
	
	public void openReport()
	{
		report.click();
	}

}
