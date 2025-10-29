package amazonprograms.Amazon_Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_Page {

	ChromeDriver driver;
	
	public Home_Page(ChromeDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			WebElement dropdowns= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchDropdownBox")));
	
					
					//@FindBy(xpath="//select[@id=\"searchDropdownBox\"]")
	//WebElement dropdowns;
	
	@FindBy(id="nav-search-submit-button")
	WebElement search;
	
	public void dropdown()
	{
		Select dropdown = new Select (dropdowns);
		dropdown.selectByVisibleText("Computers");
		
		
	}
	
	public void search()
	{
		search.click();
	}
	
}
