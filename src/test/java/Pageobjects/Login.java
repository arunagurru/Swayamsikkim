package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

public WebDriver driver;
public Login(WebDriver driver) 
	{	
this.driver=driver;
PageFactory.initElements(driver, this);
}

@FindBy(id="mat-input-1")
WebElement textmail;

@FindBy(xpath=" //span[normalize-space()='Login with password'] ")
WebElement passwordbtn;
@FindBy(xpath="/html/body/app-root/main/mat-sidenav-container/mat-sidenav-content/section/core-auth/div/app-sign-in-wrapper/section/mat-card/div/div/div[1]/core-sign-in/form/mat-form-field/div/div[1]/div[4]/input")
WebElement textpass;
@FindBy(xpath="//span[text()='Login']")
WebElement login;
	

public void setmail(String Email) {

	textmail.sendKeys(Email);	
}
	public void setpassbtn() {
		passwordbtn.click();
		
	}
	public void setpassword(String pass) {
		textpass.sendKeys(pass);
	}
	public void setlogin() {
		login.click();
	}
}



