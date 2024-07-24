package org.basicProgram1;

import org.GenericUtility.GenericUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActitimeLoginFieldsEx1 {
	
	public static void main(String[] args) {
		System.out.println("Program starts");
		GenericUtilities gu = new GenericUtilities();
		WebDriver driver = gu.startup("ch", "");
		
		WebElement uNameField = driver.findElement(By.id("username"));
		System.out.println("UserName Displayed " +uNameField.isDisplayed());
		
		WebElement pwdField = driver.findElement(By.id("pwd"));
		System.out.println("Password Displayed " +pwdField.isDisplayed());
		
		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
		System.out.println("Login Button Displayed " +loginBtn.isDisplayed());
		
		WebElement label = driver.findElement(By.id("label"));
		System.out.println("Login Button Displayed " +label.isDisplayed());
		

		System.out.println("Program Ends");
	}

}
