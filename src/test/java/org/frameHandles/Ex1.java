package org.frameHandles;

import org.GenericUtility.GenericUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ex1 {

	public static void main(String[] args) {
		
		GenericUtilities gu = new GenericUtilities();
		
		WebDriver driver = gu.startup("ch", null);
		
		WebElement ele = driver.findElement(null);
		
		driver.switchTo().frame(ele);
		WebElement ele1 = driver.findElement(null);
		String str = ele1.getText();
		System.out.println(str);
		 
		//or
		
		driver.switchTo().frame(0);
		
		//or
		
		//driver.switchTo().frame(null);
		
		
		//from inner frame to outer frame
		driver.switchTo().parentFrame();
		
		//from inner frame to root frame
		driver.switchTo().defaultContent();

	}

}
