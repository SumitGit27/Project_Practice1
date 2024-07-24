package org.alertHandling;

import java.time.Duration;

import org.GenericUtility.GenericUtilities;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ex1 {

	public static void main(String[] args) {
		
		GenericUtilities gu = new GenericUtilities();
		
		WebDriver driver = gu.startup("ch", null);
		
	}
}
