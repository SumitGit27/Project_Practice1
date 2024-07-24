package org.properties;

import java.io.FileInputStream;
import java.util.Properties;

import org.GenericUtility.GenericUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Ex2 {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fis = new FileInputStream("./src/test/resources/org.configurations/config.properties");
			
			Properties prop = new Properties();
			prop.load(fis);
			
			String bName = prop.getProperty("bName");
			String url = prop.getProperty("URL");
			String username = prop.getProperty("uName");
			String password = prop.getProperty("pwd");
			
			GenericUtilities gu = new GenericUtilities();
			
			WebDriver driver = gu.startup(bName, url);
			
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(password);
			driver.findElement(By.cssSelector("#loginButton>div")).click();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
