package com.qa.opencart.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.factory.Driverfactory;
import com.qa.opencart.pages.loginpage;

public class Basetest {
	public Driverfactory driverFactory;
	public WebDriver driver;
	public loginpage loginPage;
	public Properties prop;

	@BeforeTest
	public void setUp() {
		driverFactory = new Driverfactory();
		driver = driverFactory.init_driver();
		prop= driverFactory.init_prop();
		loginPage = new loginpage(driver);

	}

	@AfterTest
	public void tearDown() {

		driver.quit();

	}



}
