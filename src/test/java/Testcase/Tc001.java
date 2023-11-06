package Testcase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pageobjects.Login;

public class Tc001 extends Baseclass{

	@Test
public void Loginapplication() throws IOException {
	driver.get(rb.getString("url"));
	log.info("url is enter");
	Login po=new Login(driver);
		
	po.setmail(Email);
	log.info("Email is enter");
	po.setpassbtn();
	po.setpassword(pass);
	log.info("pass is enter");
	po.setlogin();
	/*String Actualresult=driver.getTitle();
System.out.println(Actualresult);
String Expectedresult="Buy the best organic products, , handlooms and more at reasonable prices. Order directly from producers through Swayam Sikkim.";
if(Actualresult.equals(Expectedresult)) {
	Assert.assertTrue(true);
	System.out.println("test case is passed");
}
else {
	captureScreen(driver,"Loginapplication");
	Assert.assertFalse(true);
	System.out.println("test case is failed");
	
}*/

	}
	
}

