package org.practice1;

import org.GenericUtility.GerericUtilities1;
import org.openqa.selenium.WebDriver;

public class Ex2 {

	public static void main(String[] args) {
		
		
		GerericUtilities1 gu1 = new GerericUtilities1();
		
		WebDriver driver = gu1.startUp("ch", "https://www.facebook.com/");
	   
	}

}
 
