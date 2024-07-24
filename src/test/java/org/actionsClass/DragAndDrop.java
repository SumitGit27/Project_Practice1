package org.actionsClass;

import org.GenericUtility.GenericUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		GenericUtilities gu = new GenericUtilities();
		
		WebDriver driver = gu.startup("ch", null);
		
		WebElement scr = driver.findElement(null);
		WebElement dec = driver.findElement(null);
		
		Actions act = new Actions(driver);
		
	//	act.dragAndDrop(scr, dec).perform();
		
		//or
		
		act.moveToElement(scr).clickAndHold(scr)
		.moveToElement(dec).release(dec).build().perform();
		
	}

}
