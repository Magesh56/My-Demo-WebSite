package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utils.Utils;

import junit.framework.Assert;

public class loginPom extends BaseClass {
	
	public loginPom() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[normalize-space(text())='Log in']")
	private WebElement loginBtn;
	
	@FindBy(id = "Email")
	private WebElement email;
	
	@FindBy(id ="Password")
	private WebElement pass;

	@FindBy(xpath="//input[@class='button-1 login-button']")
	private WebElement logBtn;
	
	@FindBy(xpath="//a[normalize-space(text())='commissionarindia@gmail.com']")
	private WebElement loginMgs;
	
	@FindBy(xpath="//span[normalize-space(text())='Login was unsuccessful. Please correct the errors and try again.']")
	private WebElement valaditation;

	public WebElement getValaditation() {
		return valaditation;
	}

	public void setValaditation(WebElement valaditation) {
		this.valaditation = valaditation;
	}

	public WebElement getLoginMgs() {
		return loginMgs;
	}

	public void setLoginMgs(WebElement loginMgs) {
		this.loginMgs = loginMgs;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getPass() {
		return pass;
	}

	public void setPass(WebElement pass) {
		this.pass = pass;
	}

	public WebElement getLogBtn() {
		return logBtn;
	}

	public void setLogBtn(WebElement logBtn) {
		this.logBtn = logBtn;
	}
	
	
	public static void clikcLoginlink() {
		loginPom l=new loginPom();
		click(l.getLoginBtn());
		
	}
	
	public static void enterLogin(String username,String password) {
		loginPom l=new loginPom();
		sendKeys(l.getEmail(),Utils.getProperty(username));
		sendKeys(l.getPass(), Utils.getProperty(password));
		
	}
	
	public static void LoginBtn() {
		loginPom l=new loginPom();
		click(l.getLogBtn());
	}
	
	public static String valaditation() {
		loginPom l=new loginPom();
		l.getValaditation();
		return null;
	
	}
	
	
	
	
	
	
	
	
	
	
}
