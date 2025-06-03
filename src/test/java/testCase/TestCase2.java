package testCase;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genriclib.BaseClass;
import pomPages.Admin_UserManagementPage;
import pomPages.HomePage;
import pomPages.LoginPage;

public class TestCase2 extends BaseClass
{

	@Test
	public void transitToAdmin_UserManagementPage() throws FileNotFoundException, IOException, InterruptedException
	{
		LoginPage action = new LoginPage(driver); 
		action.usernameTextBox(pdata.getData("username"));
		action.passwordTextBox(pdata.getData("password"));
		action.loginButton();
		
		HomePage  hp = new HomePage(driver);
		hp.adminClick();
		
		
		Admin_UserManagementPage au = new Admin_UserManagementPage(driver);
		au.UserManagementOptionclick();
		Thread.sleep(2000);
		au.usersClick();
		
		
		
	}
}
