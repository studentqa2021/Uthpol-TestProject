package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PressButton {

	public static void keyBoard_button(WebDriver driver) {

		WebElement textBox = driver.findElement(By.xpath("//*[@id='box']"));
		textBox.sendKeys(Keys.ENTER);

	}
}
