package org.windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.GenericUtility.GenericUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ex1 {

	public static void main(String[] args) {
		
		GenericUtilities gu = new GenericUtilities();
		
		WebDriver driver = gu.startup("ch", null);
		
		String pwinid = driver.getWindowHandle();
		
		driver.switchTo().window(pwinid);
		
		Set<String> allwinid = driver.getWindowHandles();
		
		Iterator<String> itr = allwinid.iterator();
		
		while(itr.hasNext()){
		String id = itr.next();
		
		if(id.equals(pwinid)) {
			 id = itr.next();
		}
		driver.switchTo().window(id);
		try {
			WebElement ele = driver.findElement(null);
			String str = ele.getText();
			System.out.println("Element text ="+ str);
		}catch(Exception e) {
			driver.close();
			continue;
		}
		}
		driver.switchTo().window(pwinid);
		driver.close();
		
	}
}


