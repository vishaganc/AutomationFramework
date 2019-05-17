package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepg {
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[6]/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td/div/div[3]/div/div[1]/div")
	WebElement help;
	@FindBy(xpath="//a[text()=\"About your actiTIME\"]")
	WebElement abtActi;
	@FindBy(xpath="//span[text()=\"actiTIME 2019.2 Pro\"]")
	WebElement version;
	
public Homepg(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void clickHelp() {
	help.click();
}
public void ClickAbtActi() {
	abtActi.click();
}

public String validText() {
	return version.getText();
	
}
}