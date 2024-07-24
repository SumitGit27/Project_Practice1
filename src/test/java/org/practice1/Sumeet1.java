package org.practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Sumeet1 {

	public WebDriver startUp(String bName, String Url) {
	
		WebDriver driver=null;
		if(bName.equalsIgnoreCase("ch")) {
		ChromeOptions opt1= new ChromeOptions();
		opt1.addArguments("--Starts Maximized--");
		driver =new ChromeDriver(opt1);
		driver.get(Url);
		}else if(bName.equalsIgnoreCase("edge")) {
		EdgeOptions opt2= new EdgeOptions();
		opt2.addArguments("--Starts Minimized--");
		driver =new EdgeDriver(opt2);
		driver.get(Url);
		}else {
		System.out.println("program end");
	    }
		return driver;
    
}
}

