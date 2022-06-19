package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import pages.Login;

public class LoginTestCases extends BaseClass{
	
	@Test
	@Parameters({"User","Pwd"})
	public void  LoginSuccessTest() {
		Login login = new Login(); 
		login.LoginFunction("User","Pwd");
	}
	
	@Test
	public void  LoginFailTest() {
		Login login = new Login(); 
		login.LoginFunction("test","secret_sauce");
		WebElement ErrorMsg = driver.findElement(By.xpath("//*[starts-with(text(),'Epic sadface:')]")); 
		String ActualMsg = ErrorMsg.getText();
		String ExpMsg = "Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(ActualMsg, ExpMsg);
	}

}
