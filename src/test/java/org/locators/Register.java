package org.locators;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register extends BaseClass {
	public Register() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@type='text']")
	WebElement username;
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	@FindBy(xpath="(//input[@type='password'])[2]")
	WebElement cpassword;
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement fullname;
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement email;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getCpassword() {
		return cpassword;
	}
	public WebElement getFullname() {
		return fullname;
	}
	public WebElement getEmail() {
		return email;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
