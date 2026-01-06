package org.pages;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utils.Utils;

public class PaymentPage extends BaseClass {
	
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//input[@value='Add to cart'])[3]")
	private WebElement selectProduct;
	@FindBy(xpath="//input[@class='button-1 add-to-cart-button']")
	private WebElement addtoCartBtn;
	@FindBy(xpath="//span[normalize-space(text())='Shopping cart']")
	private WebElement clickShopingCaet;
	@FindBy(xpath="(//span[@class='td-title']/following-sibling::input)[1]")
	private WebElement checkBox;
	@FindBy(xpath="(//label[normalize-space(text())='Zip / postal code:']/following::input)[3]")
	private WebElement termBox;
	@FindBy(css ="button[type='submit']")
	private WebElement checkoutBtn;
	@FindBy(xpath="//input[@class='button-1 checkout-as-guest-button']")
	private WebElement guestBtn;
	@FindBy(id="BillingNewAddress_FirstName")
	private WebElement firstName;
	@FindBy(id="BillingNewAddress_LastName")
	private WebElement lastName;
	@FindBy(id="BillingNewAddress_Email")
	private WebElement email;
	@FindBy(id="BillingNewAddress_CountryId")
	private WebElement country;
	@FindBy(id="BillingNewAddress_City")
	private WebElement city;
	@FindBy(id="BillingNewAddress_Address1")
	private WebElement address;
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	private WebElement postalCode;
	@FindBy(id="BillingNewAddress_PhoneNumber")
	private WebElement phoneNum;
	@FindBy(xpath="(//input[@class='button-1 new-address-next-step-button'])[1]")
	private WebElement continueBtn1;
	@FindBy(id="PickUpInStore")
	private WebElement pickUpBtn;
	@FindBy(xpath="(//input[@class='button-1 new-address-next-step-button'])[2]")
	private WebElement contineBtn2;
	@FindBy(xpath="//input[@class='button-1 payment-method-next-step-button']")
	private WebElement continueBtn3;
	@FindBy(xpath="//input[@class='button-1 payment-info-next-step-button']")
	private WebElement continueBtn4;
	@FindBy(xpath="//input[@class='button-1 confirm-order-next-step-button']")
	private WebElement continueBtn5;
	@FindBy(xpath="//h2[normalize-space(text())='Confirm order']")
	private WebElement conformMsg;
	
	@FindBy(id="paymentmethod_2")
	private WebElement cardBtn;
	@FindBy(id="CardholderName")
	private WebElement cardName;
	@FindBy(id="CardNumber")
	private WebElement cardNumber;
	@FindBy(xpath="//input[@class='button-1 payment-info-next-step-button']")
	private WebElement cardContinueBtnr;
	@FindBy(xpath="//li[normalize-space(text())='Wrong card number']")
	private WebElement invalidMsg;
	
	@FindBy(xpath="//span[@class='close']/following-sibling::p[1]")
	private WebElement intruptedClickMsg;
	
	
	
	public WebElement getIntruptedClickMsg() {
		return intruptedClickMsg;
	}
	public void setIntruptedClickMsg(WebElement intruptedClickMsg) {
		this.intruptedClickMsg = intruptedClickMsg;
	}
	public WebElement getCardBtn() {
		return cardBtn;
	}
	public void setCardBtn(WebElement cardBtn) {
		this.cardBtn = cardBtn;
	}
	public WebElement getCardName() {
		return cardName;
	}
	public void setCardName(WebElement cardName) {
		this.cardName = cardName;
	}
	public WebElement getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(WebElement cardNumber) {
		this.cardNumber = cardNumber;
	}
	public WebElement getCardContinueBtnr() {
		return cardContinueBtnr;
	}
	public void setCardContinueBtnr(WebElement cardContinueBtnr) {
		this.cardContinueBtnr = cardContinueBtnr;
	}
	public WebElement getInvalidMsg() {
		return invalidMsg;
	}
	public void setInvalidMsg(WebElement invalidMsg) {
		this.invalidMsg = invalidMsg;
	}
	public WebElement getSelectProduct() {
		return selectProduct;
	}
	public void setSelectProduct(WebElement selectProduct) {
		this.selectProduct = selectProduct;
	}
	public WebElement getAddtoCartBtn() {
		return addtoCartBtn;
	}
	public void setAddtoCartBtn(WebElement addtoCartBtn) {
		this.addtoCartBtn = addtoCartBtn;
	}
	public WebElement getClickShopingCaet() {
		return clickShopingCaet;
	}
	public void setClickShopingCaet(WebElement clickShopingCaet) {
		this.clickShopingCaet = clickShopingCaet;
	}
	public WebElement getCheckBox() {
		return checkBox;
	}
	public void setCheckBox(WebElement checkBox) {
		this.checkBox = checkBox;
	}
	public WebElement getTermBox() {
		return termBox;
	}
	public void setTermBox(WebElement termBox) {
		this.termBox = termBox;
	}
	public WebElement getCheckoutBtn() {
		return checkoutBtn;
	}
	public void setCheckoutBtn(WebElement checkoutBtn) {
		this.checkoutBtn = checkoutBtn;
	}
	public WebElement getGuestBtn() {
		return guestBtn;
	}
	public void setGuestBtn(WebElement guestBtn) {
		this.guestBtn = guestBtn;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	public WebElement getCountry() {
		return country;
	}
	public void setCountry(WebElement country) {
		this.country = country;
	}
	public WebElement getCity() {
		return city;
	}
	public void setCity(WebElement city) {
		this.city = city;
	}
	public WebElement getAddress() {
		return address;
	}
	public void setAddress(WebElement address) {
		this.address = address;
	}
	public WebElement getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(WebElement postalCode) {
		this.postalCode = postalCode;
	}
	public WebElement getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(WebElement phoneNum) {
		this.phoneNum = phoneNum;
	}
	public WebElement getContinueBtn1() {
		return continueBtn1;
	}
	public void setContinueBtn1(WebElement continueBtn1) {
		this.continueBtn1 = continueBtn1;
	}
	public WebElement getPickUpBtn() {
		return pickUpBtn;
	}
	public void setPickUpBtn(WebElement pickUpBtn) {
		this.pickUpBtn = pickUpBtn;
	}
	public WebElement getContineBtn2() {
		return contineBtn2;
	}
	public void setContineBtn2(WebElement contineBtn2) {
		this.contineBtn2 = contineBtn2;
	}
	public WebElement getContinueBtn3() {
		return continueBtn3;
	}
	public void setContinueBtn3(WebElement continueBtn3) {
		this.continueBtn3 = continueBtn3;
	}
	public WebElement getContinueBtn4() {
		return continueBtn4;
	}
	public void setContinueBtn4(WebElement continueBtn4) {
		this.continueBtn4 = continueBtn4;
	}
	public WebElement getContinueBtn5() {
		return continueBtn5;
	}
	public void setContinueBtn5(WebElement continueBtn5) {
		this.continueBtn5 = continueBtn5;
	}
	public WebElement getConformMsg() {
		return conformMsg;
	}
	public void setConformMsg(WebElement conformMsg) {
		this.conformMsg = conformMsg;
	}
	
	public void cartPage() {
		PaymentPage p=new PaymentPage();
		Utils.click(p.getSelectProduct());
		Utils.click(p.getAddtoCartBtn());
		Utils.safeClick(p.getClickShopingCaet(),p.getIntruptedClickMsg().getText());	
	}
	public void checkout() {
		PaymentPage p=new PaymentPage();
		Utils.click(p.getCheckBox());
		Utils.click(p.getTermBox());
		Utils.click(p.getCheckoutBtn());
		Utils.click(p.getGuestBtn());
		
		
	}
	public void enterDetails() {
		PaymentPage p=new PaymentPage();
		Utils.sendKeys(p.getFirstName(), Utils.getProperty("firstname"));
		Utils.sendKeys(p.getLastName(), Utils.getProperty("lastname"));
		Utils.sendKeys(p.getEmail(), Utils.getProperty("email"));
		Utils.sendKeys(p.getCity(), Utils.getProperty("city"));
		Utils.sendKeys(p.getAddress(), Utils.getProperty("address"));
		Utils.sendKeys(p.getPhoneNum(), Utils.getProperty("phnum"));
		Utils.sendKeys(p.getPostalCode(), Utils.getProperty("code"));
		Utils.click(p.getCountry());
		Utils.downKey(3);
		Utils.click(p.getContinueBtn1());
		Utils.click(p.getPickUpBtn());
		Utils.click(p.getContineBtn2());
		 
	}
	public void conformOrder() {
		PaymentPage p=new PaymentPage();
		Utils.click(p.getContinueBtn3());
		Utils.click(p.getContinueBtn4());
		Utils.click(p.getContinueBtn5());
		Assert.assertEquals("Confirm Order", p.getConformMsg().getText());
	}
	
	
	public void invalidCard() {
		PaymentPage p=new PaymentPage();
		Utils.click(p.getCheckBox());
		Utils.click(p.getTermBox());
		Utils.click(p.getCheckoutBtn());
		Utils.click(p.getGuestBtn());
		p.enterDetails();
		Utils.click(p.getCardBtn());
		Utils.click(p.getContinueBtn3());
		Utils.sendKeys(p.getCardName(),Utils.getProperty("cardname"));
		Utils.sendKeys(p.getCardNumber(), Utils.getProperty("cardnum"));
		Utils.click(p.getCardContinueBtnr());
		Assert.assertEquals("Wrong card number", p.getInvalidMsg().getText());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
