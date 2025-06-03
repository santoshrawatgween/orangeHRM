package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_UserManagementPage 
{

	@FindBy(xpath="(//span[@class='oxd-topbar-body-nav-tab-item'])[1]")
	private WebElement UserManagementOption;
	
	@FindBy(xpath="//a[text()='Users']")
	private WebElement users;
	
	@FindBy(xpath="(//div[@class='oxd-select-text--after'])[1]")
	private WebElement userRoleSelection;
	
	
	public Admin_UserManagementPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void UserManagementOptionclick()
	{
		UserManagementOption.click();
	}
	public void usersClick()
	{
		users.click();
	}
	
	public void userRoleSelection()
	{
		userRoleSelection.click();
	}
}
