package org.practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class MultiBrowsingOpening {
	static WebDriver driver = null;
	public static void main(String[] args) {
		
		System.out.println("Program starts");
		MultiBrowsingOpening obj = new MultiBrowsingOpening();
		obj.startup("edge", "https://www.flipkart.com/");
		obj.startup("ch", "https://www.Google.com/");
		obj.startup("firefox", "https://www.facebook.com/");
		obj.startup("ie", "https://www.flipkart.com/");
		driver.close();
		
		System.out.println("Program starts");
		
	}
	
	public void startup(String bName,String Url) {
		
		
		if(bName.equalsIgnoreCase("Edge")) {
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--Start-maximized");
		    driver = new EdgeDriver(options);
		    driver.get(Url);
		}else if(bName.equalsIgnoreCase("firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--Start-maximized");
			driver = new FirefoxDriver(options);
			driver.get(Url);
		}else if(bName.equalsIgnoreCase("ch")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--Start-maximized");
			driver = new ChromeDriver(options);
			driver.get(Url);
		}else {
			System.out.println("Compatible only Chrome,firefox and Edge Browser");
		}
		
	}

}
