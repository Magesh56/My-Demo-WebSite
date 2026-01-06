package org.pages;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utils.Utils;

public class RegistrationPage extends BaseClass {
	
	public RegistrationPage() {
		
			PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText = "Register")
	private WebElement regesterClk;
	
	@FindBy(id="gender-male")
	private WebElement genderClk;

	@FindBy(id="FirstName")
	private WebElement FirstName;

	@FindBy(id="LastName")
	private WebElement LastName;

	@FindBy(id="Email")
	private WebElement Email;
	
	@FindBy(id="Password")
	private WebElement Password;
	
	@FindBy(id="ConfirmPassword")
	private WebElement ConfirmPassword;
	
	@FindBy(id="register-button")
	private WebElement regesbutton;
	
	@FindBy(className ="result")
	private WebElement resultPrint;
	
	@FindBy(xpath ="//input[@class='button-1 register-continue-button']")
	private WebElement ContinueBtnt;
	
	@FindBy(xpath ="//li[normalize-space(text())='The specified email already exists']")
	private WebElement alreadyExist;

	public WebElement getAlreadyExist() {
		return alreadyExist;
	}

	public void setAlreadyExist(WebElement alreadyExist) {
		this.alreadyExist = alreadyExist;
	}

	public WebElement getRegesterClk() {
		return regesterClk;
	}

	public void setRegesterClk(WebElement regesterClk) {
		this.regesterClk = regesterClk;
	}

	public WebElement getGenderClk() {
		return genderClk;
	}

	public void setGenderClk(WebElement genderClk) {
		this.genderClk = genderClk;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public void setFirstName(WebElement firstName) {
		FirstName = firstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public void setLastName(WebElement lastName) {
		LastName = lastName;
	}

	public WebElement getEmail() {
		return Email;
	}

	public void setEmail(WebElement email) {
		Email = email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public void setPassword(WebElement password) {
		Password = password;
	}

	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}

	public void setConfirmPassword(WebElement confirmPassword) {
		ConfirmPassword = confirmPassword;
	}

	public WebElement getRegesbutton() {
		return regesbutton;
	}

	public void setRegesbutton(WebElement regesbutton) {
		this.regesbutton = regesbutton;
	}

	public WebElement getResultPrint() {
		return resultPrint;
	}

	public void setResultPrint(WebElement resultPrint) {
		this.resultPrint = resultPrint;
	}

	public WebElement getContinueBtnt() {
		return ContinueBtnt;
	}

	public void setContinueBtnt(WebElement continueBtnt) {
		ContinueBtnt = continueBtnt;
	}
	
	
  
	
	
	public void register() {
		RegistrationPage lg=new RegistrationPage();
		click(lg.getRegesterClk());
	}
	
	public void personalDetails() {
		RegistrationPage lg=new RegistrationPage();
		click(lg.getGenderClk());
		sendKeys(lg.getFirstName(), Utils.getProperty("firstname"));
		sendKeys(lg.getLastName(), Utils.getProperty("lastname"));
		sendKeys(lg.getEmail(), Utils.getProperty("newemail"));
		sendKeys(lg.getPassword(), Utils.getProperty("password"));
		sendKeys(lg.getConfirmPassword(), Utils.getProperty("conformpass"));
		
	}
	
	public void submitRegistration() {
		RegistrationPage lg=new RegistrationPage();
		click(lg.getRegesbutton());
	}
	
	public void successSubmit() {
		RegistrationPage lg=new RegistrationPage();
		System.out.println(lg.getResultPrint().getText());
		click(lg.getContinueBtnt());
		
	}
	
	public HomePage redirecttoHomePage() {
		 return new HomePage();
	}
	
	public void alreadyRegister() {
		RegistrationPage lg=new RegistrationPage();
		String exist = lg.getAlreadyExist().getText();
		Assert.assertEquals("The specified email already exists", exist);
	}


	
	
	
	
	
	
	
	
	
	
}
