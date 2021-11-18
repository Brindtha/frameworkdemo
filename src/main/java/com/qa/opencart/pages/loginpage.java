package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.Elementutils;

public class loginpage {

		private By username = By.id("input-email");
		private By password = By.id("input-password");
		private By login = By.xpath("//*[@value='Login']");
		private By forgottenPwdLink = By.xpath("//*[text()='Forgotten Password']");
		private By loginLink = By.xpath("(//li/a[text()='Login'])[2]");

		private WebDriver driver;
		private Elementutils elementUtils;

		public loginpage(WebDriver driver) {
			this.driver = driver;
			elementUtils = new Elementutils(this.driver);
		}

		public String getLoginPageTitle() {
			return elementUtils.getPageTitle();
		}

		public void loginOpenCart(String uname, String pwd) {
			elementUtils.doSendKeys(username, uname);
			elementUtils.doSendKeys(password, pwd);
			elementUtils.clickAnElement(login);
		}

		public boolean loginLinkExist() {
			return elementUtils.isElementDisplayed(loginLink);
		}

		public boolean forgottenPwdLinkExist() {
			return elementUtils.isElementDisplayed(forgottenPwdLink);
		}

	}
	


