package org.pages;

import java.awt.Desktop.Action;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utils.Utils;

public class ProductPage extends BaseClass {
	
	public ProductPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='search-box-text ui-autocomplete-input']")
	private WebElement searchBar;
	
	@FindBy(xpath="//input[@class='button-1 search-box-button']")
	private WebElement searchBtn;
	
	@FindBy(xpath="//a[normalize-space(text())='14.1-inch Laptop']")
	private WebElement correctProductDisplay;
	
	@FindBy(partialLinkText="Electronics")
	private WebElement electronicBtn;
	
	@FindBy(xpath="//h1[normalize-space(text())='Electronics']")
	private WebElement valaditeElectronicProduct;
	
	@FindBy(xpath="(//div[@class='picture']//img)[1]")
	private WebElement clicktheProduct;
	
	@FindBy(id="products-orderby")
	private WebElement filterOption;
	
	@FindBy(xpath="(//span[@class='price actual-price'])")
	private WebElement priceList;
	
	@FindBy(xpath="//h2[normalize-space(text())='Welcome to our store']")
	private WebElement homePage;

	public WebElement getHomePage() {
		return homePage;
	}

	public void setHomePage(WebElement homePage) {
		this.homePage = homePage;
	}

	public WebElement getSearchBar() {
		return searchBar;
	}

	public void setSearchBar(WebElement searchBar) {
		this.searchBar = searchBar;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public void setSearchBtn(WebElement searchBtn) {
		this.searchBtn = searchBtn;
	}

	public WebElement getCorrectProductDisplay() {
		return correctProductDisplay;
	}

	public void setCorrectProductDisplay(WebElement correctProductDisplay) {
		this.correctProductDisplay = correctProductDisplay;
	}

	public WebElement getElectronicBtn() {
		return electronicBtn;
	}

	public void setElectronicBtn(WebElement electronicBtn) {
		this.electronicBtn = electronicBtn;
	}

	public WebElement getValaditeElectronicProduct() {
		return valaditeElectronicProduct;
	}

	public void setValaditeElectronicProduct(WebElement valaditeElectronicProduct) {
		this.valaditeElectronicProduct = valaditeElectronicProduct;
	}

	public WebElement getClicktheProduct() {
		return clicktheProduct;
	}

	public void setClicktheProduct(WebElement clicktheProduct) {
		this.clicktheProduct = clicktheProduct;
	}

	public WebElement getFilterOption() {
		return filterOption;
	}

	public void setFilterOption(WebElement filterOption) {
		this.filterOption = filterOption;
	}

	public WebElement getPriceList() {
		return priceList;
	}

	public void setPriceList(WebElement priceList) {
		this.priceList = priceList;
	}
	
	
	public static void searchProduct() {
		ProductPage p=new ProductPage();
		click(p.getSearchBar());
		sendKeys(p.searchBar, "Laptop");
		click(p.getSearchBtn());
	}
	
	public static void homePage() {
		ProductPage p=new ProductPage();
		String actual = p.getHomePage().getText();
		String expected="Welcome to our store";
		Assert.assertEquals(expected, actual);
	}
	
	public static void releventProduct() {
		ProductPage p=new ProductPage();
		String actual = p.getCorrectProductDisplay().getText();
		String expected="14.1-inch Laptop";
		Assert.assertEquals(expected, actual);
	}
	
	public static void electronicPage() {
		ProductPage p=new ProductPage();
		click(p.getElectronicBtn());
	}
	
	public static void valaditElectronicProduct() {
		ProductPage p=new ProductPage();
		String actual = p.getValaditeElectronicProduct().getText();
		String expected="Electronics";
		Assert.assertEquals(expected, actual);
	}
	
	public static void applyFilter() {
		ProductPage p=new ProductPage();
		click(p.getFilterOption());
		Utils.downKey(3);
	}
	
	public static void asscending() {
		ProductPage p=new ProductPage();
		String actual = p.getPriceList().getText();
		System.out.println(actual);
	}


	
	
	
	
	
	
	

	
	

}
