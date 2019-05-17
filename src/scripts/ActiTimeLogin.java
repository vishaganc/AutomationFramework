package scripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pompages.Homepg;
import pompages.LoginPage;
@Test
public class ActiTimeLogin  extends BaseTest{
	public void actiLogin() throws InterruptedException {
		LoginPage login=new LoginPage(driver);
		String username = Lib.getCellValue("ValidLogin",1, 0);
		login.setUsername(username);
		String pwd = Lib.getCellValue("ValidLogin", 1, 1);
		login.setPassword(pwd);
		login.clickLogin();
		Thread.sleep(5000);
		Homepg hm=new Homepg(driver);
		hm.clickHelp();
		Thread.sleep(2000);
		hm.ClickAbtActi();
		String actResult = hm.validText();
		System.out.println(actResult);
		Reporter.log("Version comparison",true);
		String expResult= Lib.getCellValue("ExpectedResult",0,0);
		System.out.println(expResult);
		Assert.assertEquals(expResult, actResult);
		System.out.println(actResult+" "+expResult);
		}
}



