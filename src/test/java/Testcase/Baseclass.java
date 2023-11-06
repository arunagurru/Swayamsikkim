package Testcase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utility.Readdata;


public class Baseclass {
	Readdata rd=new Readdata();
	
	
	public String url=rd.getapplicationurl();
	public String Email=rd.getEmail();
public String pass=rd.getpassword();
public static Logger log;

public static WebDriver driver;

public ResourceBundle rb;
@BeforeClass
	public void  openapplication() {
	
	rb=ResourceBundle.getBundle("s");
	log=Logger.getLogger(this.getClass());
	PropertyConfigurator.configure("log4j.properties");
		driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}

	@AfterClass
	public void closeapplication() {
	//	driver.close();
	}
	public void captureScreen(WebDriver driver,String name) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File target=new File("./Screenshot/"+name+".png");
		FileUtils.copyFile(src, target);
		log.info("Screenshot is taken");
		
		
		
		
	}
	}


