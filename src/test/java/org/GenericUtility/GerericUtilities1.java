package org.GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class GerericUtilities1 {
	
	
	public WebDriver startUp(String bName,String Url) {
		
		WebDriver driver =null;
		if(bName.equalsIgnoreCase("ch")) {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--Start-Maximized");
			driver = new ChromeDriver(option);
			driver.get(Url);
		}else if(bName.equalsIgnoreCase("edge")) {
			EdgeOptions options2 = new EdgeOptions();
			options2.addArguments("--Start-Maximized");
			driver = new EdgeDriver(options2);
			driver.get(Url);
		}else if(bName.equalsIgnoreCase("firefox")) {
			FirefoxOptions options3 = new FirefoxOptions();
			options3.addArguments("--Start-Maximized");
			driver = new FirefoxDriver(options3);
			driver.get(Url);
		}else {
			System.out.println("only support chrome,Edge and firefox Browser");
		}
		return driver;
	
	}
}

