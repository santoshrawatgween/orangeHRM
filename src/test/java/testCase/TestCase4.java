package testCase;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genriclib.BaseClass;
import pomPages.AssignClaimPage;
import pomPages.HomePage;
import pomPages.LoginPage;
import pomPages.ViewAssignClaimPage;

public class TestCase4 extends BaseClass
{
	@Test
	public void tc4() throws FileNotFoundException, IOException
	{
		
		LoginPage l = new LoginPage(driver);
		l.usernameTextBox(pdata.getData("username"));
		l.passwordTextBox(pdata.getData("password"));
		l.loginButton();
		HomePage hp = new HomePage(driver);
		hp.claimButtonClick();
		ViewAssignClaimPage v = new ViewAssignClaimPage(driver);
		v.assignClaimButtonClick();
		AssignClaimPage asp= new AssignClaimPage(driver);
		asp.autosuggestionEnter("sa");
		
		
		
		
		
		
	}
	
	

}
