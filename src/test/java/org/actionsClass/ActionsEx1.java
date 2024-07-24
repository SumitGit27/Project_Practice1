package org.actionsClass;

import org.GenericUtility.GenericUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsEx1 {

	public static void main(String[] args) {
		
		GenericUtilities gu = new GenericUtilities();
		
		WebDriver driver = gu.startup("ch", "http://localhost:93/login.do");
		
		WebElement uName = driver.findElement(By.id("username"));
		Actions act = new Actions(driver);
		act.sendKeys(uName, "admin").perform();
		
		
		WebElement pwd = driver.findElement(By.cssSelector(".textField.pwdfield"));
		act.sendKeys(pwd, "manager").perform();
		
		WebElement loginbtn = driver.findElement(By.cssSelector("#loginButton>div"));
		act.click(loginbtn).perform();
		
		driver.close();
		
		
	}

}
