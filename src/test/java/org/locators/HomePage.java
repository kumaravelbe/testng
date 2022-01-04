package org.locators;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
public HomePage() {
PageFactory.initElements(driver, this);
}

@FindBy(xpath="(//input[@type='text'])")
WebElement username;
@FindBy(xpath="(//input[@type='password'])")
WebElement password;
@FindBy(xpath="(//a[text()='Forgot Password?'])")
WebElement forgetpassword;
@FindBy(xpath="(//input[@type='Submit'])")
WebElement login;
@FindBy(xpath="//a[text()='New User Register Here']")
WebElement newuser;


public WebElement getNewuser() {
	return newuser;
}
public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getForgetpassword() {
	return forgetpassword;
}
public WebElement getLogin() {
	return login;
}


	
	
	
}
