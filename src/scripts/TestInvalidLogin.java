package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;
@Test(priority=1,description="InvalidLogin Function ")
public class TestInvalidLogin extends BaseTest {
	public void testInValidLogin() throws InterruptedException {
		//System.out.println("InvalidLogin Function");
		//Reporter.log("InValidLogin Function");
		Reporter.log("InValidLogin Function",true);
		LoginPage login=new LoginPage(driver);
		for (int i=1; i <=Lib.getTotalRowCount("InValidLogin"); i++) {
		String username = Lib.getCellValue("InValidLogin",i, 0);
		login.setUsername(username);
		Thread.sleep(6000);
		String pwd = Lib.getCellValue("InValidLogin", i, 1);
		login.setPassword(pwd);
		Thread.sleep(6000);
		login.clickLogin();
		Thread.sleep(2000);
		
		}

	}
}
