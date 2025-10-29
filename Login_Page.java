package amazonprograms.Amazon_Practise;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	
	

	ChromeDriver driver;
	
	public Login_Page(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@type=\"email\"]")
	WebElement enteremail;
	
	@FindBy(xpath="//input[@class=\"a-button-input\"]")
	WebElement continueclick;
	
	@FindBy(xpath="//input[@type=\"password\"]")
	WebElement password;
	
	@FindBy(id= "signInSubmit")
	WebElement signin;
	
	public void enteremail()
	{
		enteremail.sendKeys("pratiksha051994@gmail.com"+Keys.ENTER);
	}
	
	public void continueclick()
	{
		continueclick.click();
	}
	
	public void password()
	{
		password.sendKeys("Amazon@1000");
	}
	
	
	public void signin()
	{
		signin.click();
	}
	
	
	
}
