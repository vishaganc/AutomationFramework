package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	WebElement unTb;
	
	@FindBy(name="pwd")
	WebElement pwdTb;
	
	@FindBy(xpath="//div[text()=\"Login \"]")
	WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void setUsername(String un) {
		unTb.sendKeys(un);
	}
	public void setPassword(String pwd) {
		pwdTb.sendKeys(pwd);
	}
	public void clickLogin() {
		loginBtn.click();
	}
	
	

}
