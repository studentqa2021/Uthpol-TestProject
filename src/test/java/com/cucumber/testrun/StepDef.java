package com.cucumber.testrun;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.selenium.pagefactory.SeleniumPageFactory;
import com.util.Constant;
import com.util.Highlighter;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	
	Constant cons;
	WebDriver driver;
	SeleniumPageFactory pf;
	WebDriverWait wait;
	
	
	@Given("open a browser")
	public void open_a_browser() {
		cons = new Constant(); //all --> usrnm,pass,url

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		pf = new SeleniumPageFactory(driver); // all--> xpath

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}

	@Given("go to app url")
	public void go_to_app_url() {
		driver.get(cons.getUrl());
	}

	@When("enter valid username")
	public void enter_valid_username() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(pf.getUsrNm()));

		Highlighter.getColor(driver, pf.getUsrNm(), "green");
		pf.getUsrNm().click();
		pf.getUsrNm().sendKeys(cons.getUsr());
	}

	@When("enter valid passward")
	public void enter_valid_passward() {
		wait.until(ExpectedConditions.elementToBeClickable(pf.getUsrNm()));
		
		Highlighter.getColor(driver, pf.getPassWd(), "blue");
		pf.getPassWd().click();
		pf.getPassWd().sendKeys(cons.getPass());
	}

	@When("click login buttion")
	public void click_login_buttion() {
		Highlighter.getColor(driver, pf.getSignIn(), "black");
		pf.getSignIn().click();
	}

	@Then("verify the login")
	public void verify_the_login() {	
	}
}
