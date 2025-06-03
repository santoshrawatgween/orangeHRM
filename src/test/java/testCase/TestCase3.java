package testCase;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genriclib.BaseClass;
import pomPages.HomePage;
import pomPages.LoginPage;
import pomPages.PersonalDetail;

public class TestCase3 extends BaseClass
{

	@Test
	public void myInfo() throws FileNotFoundException, IOException, InterruptedException
	{
		LoginPage action = new LoginPage(driver); 
		action.usernameTextBox(pdata.getData("username"));
		action.passwordTextBox(pdata.getData("password"));
		action.loginButton();
		
		HomePage  hp = new HomePage(driver);
		hp.myinfoClick();
		PersonalDetail p = new PersonalDetail(driver);
		utilities.waitTillElementVisible(driver, p.firstNameDisplay());
		Thread.sleep(3000);
		p.firstNameEnter();
		p.lastNameEnter();
		p.saveButton1Click();
		
		
	}
}
