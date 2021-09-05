package com.myapp.qa.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
	
	@Test
	public void fetchCurrentURL() throws InterruptedException
	{
		// Start chrome browser
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// open the addressboo app on the chrome browser
		
		driver.get("http://3.21.75.105:49153/addressbook/");
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
