package org.basicProgram1;

import org.GenericUtility.GenericUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActitimeLoginEx1 {
	
	public static void main(String[] args) {
		System.out.println("Program starts");
		GenericUtilities gu = new GenericUtilities();
		WebDriver driver = gu.startup("ch", "");
		
		WebElement uName = driver.findElement(By.id("username"));
		uName.sendKeys("admin");
		
		
		WebElement pwd = driver.findElement(By.id("pwd"));
		pwd.sendKeys("manager");
		
		
		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
		loginBtn.click();
		
		driver.close();
		

		System.out.println("Program Ends");
	}

}
