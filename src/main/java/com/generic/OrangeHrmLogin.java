package com.generic;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.selenium.pagefactory.SeleniumPageFactory;
import com.util.Constant;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmLogin {

	public void LoginTest() {

		Constant cons = new Constant(); //all --> usrnm,pass,url

//		WebDriverManager.chromedriver().setup();  //sel ver 4 works without this
		WebDriver driver = new ChromeDriver();
		
		SeleniumPageFactory pf = new SeleniumPageFactory(driver); // all--> xpath

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.get(cons.getUrl());

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(pf.getUsrNm()));

		pf.getUsrNm().click();
		pf.getUsrNm().sendKeys(cons.getUsr());

		wait.until(ExpectedConditions.elementToBeClickable(pf.getUsrNm()));
		pf.getPassWd().click();
		pf.getPassWd().sendKeys(cons.getPass());

		pf.getSignIn().click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();

	}
}
