package com.selenium.pagefactory;

import org.openqa.selenium.By;

public class SeleniumPageObjectModel {

	private By UsrNm = By.xpath("//*[@name = 'username']");
	private	By PassWd = By.xpath("//*[@name='password']");
	private By SignIn = By.xpath("//*[@type='submit']");
	
	public By getUsrNm() {
		return UsrNm;
	}
	public By getPassWd() {
		return PassWd;
	}
	public By getSignIn() {
		return SignIn;
	}
}

//java-encapsulation, selenium By method
//selenium data type -->
//By --> By() methods, Web element, List <Web elements>