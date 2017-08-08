package com.git;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestGIT {
	
	@Test
	public void Login() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.co.in");
		String title = driver.getTitle();
		System.out.println("Title is : "+title);
		//Comments added
		//Comments for JENKINS
		driver.quit();
	}

}
