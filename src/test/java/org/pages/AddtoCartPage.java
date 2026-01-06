package org.pages;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utils.Utils;

public class AddtoCartPage extends BaseClass {
	
	public AddtoCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText ="Computers")
	private WebElement clickProduct;
	
	@FindBy(xpath="(//h2[@class='title']//a)[2]")
	private WebElement clickNoteBook;
	
	@FindBy(xpath="//h2[@class='product-title']//a[1]")
	private WebElement clickAddToCartBtn;
	
	@FindBy(xpath="(//div[@class='add-to-cart-panel']//input)[2]")
	private WebElement clickCart;
	
	@FindBy(xpath="(//span[@class='cart-label']/following-sibling::span)[1]")
	private WebElement cartCount;
	
	public WebElement getClickCart() {
		return clickCart;
	}

	public void setClickCart(WebElement clickCart) {
		this.clickCart = clickCart;
	}

	
	public WebElement getCartCount() {
		return cartCount;
	}

	public void setCartCount(WebElement cartCount) {
		this.cartCount = cartCount;
	}

	@FindBy(xpath="//span[normalize-space(text())='Shopping cart']")
	private static WebElement cartBtn;
	
	
	@FindBy(xpath="//td[@class='remove-from-cart']//input[1]")
	private static WebElement checkBox;
	
	@FindBy(xpath="//div[@class='terms-of-service']//input[1]")
	private WebElement termBox;
	
	@FindBy(xpath="(//span[@class='td-title']/following-sibling::span)[1]")
	private WebElement productOrginalPrice;
	
	@FindBy(xpath="//input[@class='qty-input']")
	private WebElement productQuandity;
	
	@FindBy(xpath="//span[@class='product-price order-total']//strong[1]")
	private WebElement productTotalPrice;
	
	@FindBy(id="checkout")
	private static WebElement checkoutBtn;
	
	@FindBy(xpath="(//span[normalize-space(text())='Qty.:']/following::input)[1]")
	private WebElement qtyBox;
	
	@FindBy(xpath="//div[@class='common-buttons']//input[1]")
	private WebElement updateQtyBox;
	
	
	
	

	public WebElement getQtyBox() {
		return qtyBox;
	}

	public void setQtyBox(WebElement qtyBox) {
		this.qtyBox = qtyBox;
	}

	public WebElement getUpdateQtyBox() {
		return updateQtyBox;
	}

	public void setUpdateQtyBox(WebElement updateQtyBox) {
		this.updateQtyBox = updateQtyBox;
	}

	public WebElement getClickProduct() {
		return clickProduct;
	}

	public void setClickProduct(WebElement clickProduct) {
		this.clickProduct = clickProduct;
	}

	public WebElement getClickNoteBook() {
		return clickNoteBook;
	}

	public void setClickNoteBook(WebElement clickNoteBook) {
		this.clickNoteBook = clickNoteBook;
	}

	public WebElement getClickAddToCartBtn() {
		return clickAddToCartBtn;
	}

	public void setClickAddToCartBtn(WebElement clickAddToCartBtn) {
		this.clickAddToCartBtn = clickAddToCartBtn;
	}

	public static WebElement getCartBtn() {
		return cartBtn;
	}

	public void setCartBtn(WebElement cartBtn) {
		this.cartBtn = cartBtn;
	}

	public static WebElement getCheckBox() {
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

	public WebElement getProductOrginalPrice() {
		return productOrginalPrice;
	}

	public void setProductOrginalPrice(WebElement productOrginalPrice) {
		this.productOrginalPrice = productOrginalPrice;
	}

	public WebElement getProductQuandity() {
		return productQuandity;
	}

	public void setProductQuandity(WebElement productQuandity) {
		this.productQuandity = productQuandity;
	}

	public WebElement getProductTotalPrice() {
		return productTotalPrice;
	}

	public void setProductTotalPrice(WebElement productTotalPrice) {
		this.productTotalPrice = productTotalPrice;
	}

	public static WebElement getCheckoutBtn() {
		return checkoutBtn;
	}

	public void setCheckoutBtn(WebElement checkoutBtn) {
		this.checkoutBtn = checkoutBtn;
	}
	
	public void productDetail() {
		AddtoCartPage ag=new AddtoCartPage();
		Utils.click(ag.getClickProduct());
		Utils.click(ag.getClickNoteBook());
	}
	
	public  void addtoCart() {
		AddtoCartPage ag=new AddtoCartPage();
		Utils.click(ag.getClickAddToCartBtn());
		Utils.click(ag.getClickCart());
		Utils.click(getCartBtn());
		Utils.click(getCheckBox());
		Utils.click(ag.getTermBox());
		Utils.click(AddtoCartPage.getCheckoutBtn());
	}
	
	public  void productaddedtoCart() {
		
		
		loginPom.enterLogin("email", "password");
		loginPom.LoginBtn();
	}
	
	public  void increaseCartCount() {
		AddtoCartPage ag=new AddtoCartPage();
		String qt = ag.getProductQuandity().getText();
		Assert.assertNotEquals("0", qt);
		Utils.click(getCheckoutBtn());
	}
	
	public  void userInCartPage() {
		AddtoCartPage ag=new AddtoCartPage();
		loginPom.clikcLoginlink();
		loginPom.enterLogin("email", "password");
		loginPom.LoginBtn();
		Utils.click(getCartBtn());
		Utils.click(getCheckBox());
		Utils.click(ag.getTermBox());
	}
	public void userRemoveProduct() {
		AddtoCartPage ag=new AddtoCartPage();
	
		Utils.sendKeys(ag.getQtyBox(), "4");
		Utils.click(ag.getUpdateQtyBox());
	}
	public void apperanceCartPage() {
		AddtoCartPage ag=new AddtoCartPage();
	  System.out.println( ag.getCartCount().getText());
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
