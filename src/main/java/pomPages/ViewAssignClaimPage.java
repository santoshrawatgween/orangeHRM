package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewAssignClaimPage 
{
	@FindBy(xpath="//i[@class='oxd-icon bi-plus oxd-button-icon']")
	private WebElement assignClaimButton;
	
	public ViewAssignClaimPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void assignClaimButtonClick()
	{
		assignClaimButton.click();
	}

}
