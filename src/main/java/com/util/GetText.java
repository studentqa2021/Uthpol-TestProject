package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetText {

	public static void get_Text() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/");

		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
System.out.println(driver.findElement(By.xpath("//*[@class='display-1 mt-0 mt-md-5 pb-1']")).getText());

	}

	public static void main(String[] args) {
		GetText.get_Text();
	}
}
