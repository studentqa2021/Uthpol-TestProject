package com.util;

public class Constant {
	private String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	private String usr = "Admin";
	private String pass = "admin123";

	private String xpUsr = "//*[@name = 'username']";
	private String xpPass = "//*[@name='password']";
	private String xpSign = "//*[@type='submit']";

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsr() {
		return usr;
	}

	public String getPass() {
		return pass;
	}

	public String getXpUsr() {
		return xpUsr;
	}

	public String getXpPass() {
		return xpPass;
	}

	public String getXpSign() {
		return xpSign;
	}

}
