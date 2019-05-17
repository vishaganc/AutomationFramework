package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConstant {
	public WebDriver driver;
	static {
		System.setProperty(Gecko_KEY, Gecko_PATH);
		System.setProperty(CHROME_KEY, CHROME_PATH);
		//System.setProperty(IE_KEY, IE_PATH);
	}
	@BeforeMethod
	public void openApplication() {
		driver=new ChromeDriver();
		//driver=new FirefoxDriver();
		driver.get(Lib.getPropertyValue("URL"));
		
	}
	@AfterMethod
	public void closeApplication(ITestResult res) {
		if(ITestResult.FAILURE==res.getStatus()) {
			Lib.captureScreenshot(driver,res.getName());
		}
		//driver.close();
		
	}

}
