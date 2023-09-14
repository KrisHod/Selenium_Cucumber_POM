package com.fdmgroup.testscripts;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.fdmgroup.pages.HomePage;
import com.fdmgroup.pages.UserIndexPage;
import com.fdmgroup.util.DriverUtilities;

public class LogoutTest {
	private DriverUtilities driverUtilities;
	private WebDriver driver;

	@Before
	public void setUp() {
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
	}

	@Test
	public void testLogoutFunctionality() {
		UserIndexPage.usernameDropDown(driver).click();
		if (UserIndexPage.usernameDropDown(driver).isDisplayed()) {
			UserIndexPage.usernameDropDown(driver).click();
		}
		assertTrue(HomePage.signInButton(driver).isDisplayed());
	}

}
