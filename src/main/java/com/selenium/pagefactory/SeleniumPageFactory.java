package com.selenium.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPageFactory {

	WebDriver driver;

	public SeleniumPageFactory(WebDriver driver) {
		this.driver = driver;
		// selenium --->code
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@name = 'username']")
	private WebElement UsrNm;

	@FindBy(xpath = "//*[@name='password']")
	private WebElement PassWd;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement SignIn;

	public WebElement getUsrNm() {
		return UsrNm;
	}

	public WebElement getPassWd() {
		return PassWd;
	}

	public WebElement getSignIn() {
		return SignIn;
		
		
	}
}

//coding @ --> called annotation : similar like method
// @ is faster then method
