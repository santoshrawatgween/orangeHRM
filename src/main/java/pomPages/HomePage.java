package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath="//span[text() ='Admin']")
	private WebElement admin;
	
	@FindBy(xpath="//span[text()='My Info']")
	private WebElement myinfo;
	
	@FindBy(xpath="//span[text()='Claim']")
	private WebElement claimButton;
	
	
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void adminClick()
	{
		admin.click();
	}
	public void myinfoClick()
	{
		myinfo.click();
	}
	public void claimButtonClick()
	{
		claimButton.click();
	}
	

}
