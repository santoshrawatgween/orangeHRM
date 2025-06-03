package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genriclib.BaseClass;

public class LoginPage 
{

	@FindBy(name="username")
	private WebElement usernameTextBox;
	
	@FindBy(name="password")
	private WebElement passwordTextBox;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void usernameTextBox(String username)
	{
		usernameTextBox.sendKeys(username);
	}
	
	public void passwordTextBox(String password)
	{
		passwordTextBox.sendKeys(password);
	}
	public void loginButton()
	{
		loginButton.click();
	}
	
}
