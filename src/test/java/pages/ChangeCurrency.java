package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangeCurrency {



	WebDriver driver;

	//Constructor that will be automatically called as soon as the object of the class is created
	public  ChangeCurrency(WebDriver driver) {
		this.driver = driver;
	}



	//Locator for home button
	@FindBy(css=".fa-home") WebElement clickHomeBtn;


	@FindBy(css=".product-layout:nth-child(2) button:nth-child(1)") WebElement addProductToCart;


	//Locator for password field
	@FindBy(css=".fa-caret-down") WebElement openCurrencyMenu;


	//Locator for checkbox
	@FindBy(name = "USD") WebElement clickCurrnecy;




	public void clickHome() {
		clickHomeBtn.click();
	}

	// Method to Click new account
	public void addToCart() {
		addProductToCart.click();
	}

	// Method to Click new account
	public void openMenu() {
		openCurrencyMenu.click();
	}

	// Method to Click new account
	public void chooseCurrnecy() {
		clickCurrnecy.click();
	}


}
