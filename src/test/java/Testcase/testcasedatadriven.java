package Testcase;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobjects.Login;
import utility.XLutils;

public class testcasedatadriven extends Baseclass{
	
	@Test(dataProvider="aruna.xlsx")
	public void loginDDT(String user,String pwd) throws InterruptedException
	{
		Login lp=new Login(driver);
		lp.setmail(user);
		Thread.sleep(3000);
		log.info("user name provided");
		lp.setpassbtn();
		lp.setpassword(pwd);
		Thread.sleep(3000);
		log.info("password provided");
		lp.setlogin();

		Thread.sleep(3000);
	}
	
		@DataProvider(name="aruna.xlsx")
		String [][] getData() throws IOException
		{
			String path=System.getProperty("user.dir")+"./src/test/java/testdata/aruna.xlsx";

			int rownum=XLutils.getrowcount(path, "Sheet1");
			int cell=XLutils.getcellcount(path,"Sheet1",1);
			
			String LoginData[][]=new String[rownum][cell];

			for(int i=1;i<=rownum;i++)
			{
				for(int j=0;j<cell;j++)
				{
					LoginData[i-1][j]=XLutils.getCellData(path,"Sheet1", i,j);//1 0
				}

			}
			return LoginData;
		}
}