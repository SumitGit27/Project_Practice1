package org.basicProgram1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoadUrlInBrowserEx2 {

	public static void main(String[] args) {
		
		System.out.println("Program Starts");
		//Open Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		//Loads or Hits the Url in Browser.
		driver.get("https://www.google.com/");
		
		//returns Current page Url
		String str1 = driver.getCurrentUrl();
		System.out.println("Current page Url ="+str1);
		
		//returns Current page Title
		String str2 = driver.getTitle();
		System.out.println("Current page Title ="+str2);
		
		System.out.println("Program Ends");

	}
}
