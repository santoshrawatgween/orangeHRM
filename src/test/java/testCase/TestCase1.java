package testCase;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genriclib.BaseClass;
import pomPages.LoginPage;

public class TestCase1 extends BaseClass
{

	@Test
	public void login() throws FileNotFoundException, IOException
	{
		LoginPage action = new LoginPage(driver); 
		action.usernameTextBox(pdata.getData("username"));
		action.passwordTextBox(pdata.getData("password"));
		action.loginButton();
	}
}
