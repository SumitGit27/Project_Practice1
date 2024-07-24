package org.basicProgram1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserEx1 {

	public static void main(String[] args) {
		
		System.out.println("Program Starts");
		//Open Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		System.out.println("Program Ends");

	}
}
