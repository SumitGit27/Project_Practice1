package org.practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverMethods {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--Start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.flipkart.com/");

		System.out.println("Current page Title  =" + driver.getTitle());
		
		
		System.out.println("Current page Url  =" + driver.getCurrentUrl());
		
		System.out.println("Current page Url  =" + driver.getPageSource());
		
		WebElement ttTabLink = driver.findElement(By.xpath("//a[div[text()='TIME-TRACK']]"));
		String value = ttTabLink.getAttribute("class");
		System.out.println(value);
		
		
	}

}
