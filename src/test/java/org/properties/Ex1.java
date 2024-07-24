package org.properties;

import java.io.FileInputStream;
import java.util.Properties;

import org.GenericUtility.GenericUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ex1 {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fis = new FileInputStream("./src/test/resources/org.configurations/config.properties");
			
			Properties prop = new Properties();
			
			prop.load(fis);
			
			String bName = prop.getProperty("bName");
			String url = prop.getProperty("URL");
			String username = prop.getProperty("uName");
			String pwd = prop.getProperty("pwd");
			
			
			
			GenericUtilities gu = new GenericUtilities();
			WebDriver driver = gu.startup(bName, url);
			
			WebElement userName = driver.findElement(By.id("username"));
			userName.sendKeys(username);
			
			WebElement password = driver.findElement(By.cssSelector(".textField.pwdfield"));
			password.sendKeys(pwd);
			
			WebElement loginbtn = driver.findElement(By.cssSelector("#loginButton>div"));
			loginbtn.click();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
