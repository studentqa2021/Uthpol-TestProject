package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadFile {

	public static void upload_File(WebDriver driver) {

		WebElement upload_File = driver.findElement(By.xpath("//input[@id='file_up']"));
		upload_File.sendKeys("c;/users/test.img");

	}
}
