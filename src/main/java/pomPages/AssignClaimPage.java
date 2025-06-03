package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignClaimPage 
{
	@FindBy(xpath="//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']")
	private WebElement autosuggestion;
	
	public AssignClaimPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public  void autosuggestionEnter(String name)
	{
		autosuggestion.click();
		autosuggestion.sendKeys(name);
	}
}
