package org.basicProgram1;

import java.util.List;

import org.GenericUtility.GenericUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPageEx1 {

	public static void main(String[] args) {
		
		System.out.println("Program Starts");
		GenericUtilities gu = new GenericUtilities();
		WebDriver driver = gu.startup("ch", "");
		

		WebElement uName = driver.findElement(By.id("username"));
		uName.sendKeys("admin");
		
		
		WebElement pwd = driver.findElement(By.id("pwd"));
		pwd.sendKeys("manager");
		
		
		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
		loginBtn.click();
		
		WebElement timeTrackTab = driver.findElement(By.id(""));
		System.out.println(timeTrackTab.isDisplayed());
		
		List<WebElement> allTabs = driver.findElements(By.id(""));
		
		for(int i=0;i<allTabs.size();i++) {
			String str = allTabs.get(i).getText();
			System.out.println(str);
		}
		System.out.println("Program Ends");

	}

}
