package pomPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PersonalDetail 
{
	@FindBy(name="firstName")
	private WebElement firstName;
	
	@FindBy(name="lastName")
	private WebElement lastName;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement saveButton1;
	
	public PersonalDetail(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public  WebElement firstNameDisplay()
	{
		return firstName;
	}
	
	public void firstNameEnter()
	{
		firstName.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		firstName.sendKeys("santosh");
	}
	public void lastNameEnter()
	{
		lastName.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		lastName.sendKeys("Singh");
	}
	public void saveButton1Click()
	{
		saveButton1.click();
	}
	

}
