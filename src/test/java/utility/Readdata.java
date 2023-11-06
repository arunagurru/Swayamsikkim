package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readdata {
Properties pro;
public Readdata()  {
	File file=new File("./configaration/s.properties");
	try {
	FileInputStream fis=new FileInputStream(file);
	pro=new Properties();
	pro.load(fis);
	}
	catch (Exception e) {
		System.out.println("exception is "+e.getMessage());
		
	}
	
}
public String getapplicationurl() {
	String baseurl=pro.getProperty("url");
	return baseurl;
}
public String getEmail() {
	String mail=pro.getProperty("Email");
	return mail;
}
public String getpassword() {
	String pass=pro.getProperty("password");
	return pass;
}

	
}

