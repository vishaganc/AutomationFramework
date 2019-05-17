package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;
@Test(priority=0,description="ValidLogin Function ")
public class TestValidLogin extends BaseTest {
	public void testValidLogin() throws InterruptedException {
	LoginPage login=new LoginPage(driver);
	String username = Lib.getCellValue("ValidLogin",1, 0);
	login.setUsername(username);
	String pwd = Lib.getCellValue("ValidLogin", 1, 1);
	login.setPassword(pwd);
	login.clickLogin();
	Thread.sleep(7000);
	//System.out.println("ValidLogin Function");
	//Reporter.log("ValidLogin Function");
	Reporter.log("ValidLogin Function",true);
	//Assert.fail();
	
//	String aHomePageTitle=driver.getTitle();
//	Assert.assertEquals(aHomePageTitle,"actiTIME - Login");
//	if(aHomePageTitle.("wrong page")) {
//		System.out.println("Login successful");
//	}else {
//		System.out.println("Login failed..");
//	}
	}

}
