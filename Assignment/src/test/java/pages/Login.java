package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.BaseClass;

public class Login {
	
	WebDriver driver = BaseClass.driver;
	
	@FindBy(id = "user-name")
	WebElement UserName;
	
	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(id = "login-button")
	WebElement LoginBtn;
	
	public Login() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void LoginFunction(String User, String Pwd) {
		UserName.sendKeys(User);
		Password.sendKeys(Pwd);
		LoginBtn.click();
	}
	
}
