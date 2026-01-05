package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utils.Utils;
import org.junit.Assert;

public class HomePage extends BaseClass {
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//li[@class='inactive']//a)[2]")
	private WebElement productClk;
	
	@FindBy(xpath="//img[@alt='Picture for category Notebooks']")
	private WebElement selectProduct;
	
	@FindBy(xpath="//h1[normalize-space(text())='Notebooks']")
	private WebElement validateProduct;
	
	@FindBy(xpath="//h2[@class='product-title']//a[1]")
	private WebElement addtoCatrBtn;
	
	@FindBy(xpath="//p[contains(.,'The product has been added to your shopping cart')]")
	private WebElement validateAddonCart;
	
	@FindBy(xpath="(//span[@class='cart-label']/following-sibling::span)[1]")
	private WebElement validateAddNumber;
	
	@FindBy(xpath="//h2[normalize-space(text())='Welcome to our store']")
	private WebElement validateHomepage;
	
	@FindBy(xpath="//input[@class='button-1 add-to-cart-button']")
	private WebElement clkAddToCart;

	public WebElement getClkAddToCart() {
		return clkAddToCart;
	}

	public void setClkAddToCart(WebElement clkAddToCart) {
		this.clkAddToCart = clkAddToCart;
	}

	public WebElement getValidateHomepage() {
		return validateHomepage;
	}

	public void setValidateHomepage(WebElement validateHomepage) {
		this.validateHomepage = validateHomepage;
	}

	public WebElement getProductClk() {
		return productClk;
	}

	public void setProductClk(WebElement productClk) {
		this.productClk = productClk;
	}

	public WebElement getSelectProduct() {
		return selectProduct;
	}

	public void setSelectProduct(WebElement selectProduct) {
		this.selectProduct = selectProduct;
	}

	public WebElement getValidateProduct() {
		return validateProduct;
	}

	public void setValidateProduct(WebElement validateProduct) {
		this.validateProduct = validateProduct;
	}

	public WebElement getAddtoCatrBtn() {
		return addtoCatrBtn;
	}

	public void setAddtoCatrBtn(WebElement addtoCatrBtn) {
		this.addtoCatrBtn = addtoCatrBtn;
	}

	public WebElement getValidateAddonCart() {
		return validateAddonCart;
	}

	public void setValidateAddonCart(WebElement validateAddonCart) {
		this.validateAddonCart = validateAddonCart;
	}

	public WebElement getValidateAddNumber() {
		return validateAddNumber;
	}

	public void setValidateAddNumber(WebElement validateAddNumber) {
		this.validateAddNumber = validateAddNumber;
	}
	
	public static void Serchproduct() {
		HomePage h=new HomePage();
		Utils.click(h.getProductClk());
		Utils.click(h.getSelectProduct());
		//Assert.assertEquals(h.getValidateProduct().getText(), "Notebooks");
		Assert.assertTrue(h.getValidateProduct().getText().contains("Notebooks"));
		

	}
	
	public static void productToCart() {
		HomePage h=new HomePage();
		Utils.sleep(9);
		Utils.click(h.getAddtoCatrBtn());
		Utils.click(h.getClkAddToCart());
		Assert.assertTrue(h.getValidateAddonCart().getText().contains("The product has been added to your shopping cart"));
		System.out.println(h.getValidateAddonCart().getText());
	}
	
	public static void validCartnumber() {
		HomePage h=new HomePage();
		//Assert.assertEquals(h.getValidateAddNumber().getText(), 1);
		System.out.println(h.getValidateAddNumber().getText());
	}

	public static void validateHome() {
		HomePage h=new HomePage();
		Assert.assertEquals(h.getValidateHomepage().getText(),"Welcome to our store");
		System.out.println(h.getValidateHomepage().getText());
		
		
	}
			
			
}
