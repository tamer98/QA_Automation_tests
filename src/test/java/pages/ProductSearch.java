package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductSearch {



	WebDriver driver;

	//Constructor that will be automatically called as soon as the object of the class is created
	public  ProductSearch(WebDriver driver) {
		this.driver = driver;
	}

	//locator for my account dropdown
	@FindBy(css=".list-inline .dropdown-toggle") WebElement uDropDownMyAccount;

	//Locator for username field
	@FindBy(linkText="Login") WebElement uLogAccount;
	//By uName = By.id("user-name");


	//Locator for username field
	@FindBy(id="input-email") WebElement uName;
	//By uName = By.id("user-name");

	//Locator for password field
	@FindBy(id="input-password") WebElement pswd;
	//By pswd = By.id("password");

	//Locator for login button
	@FindBy(css=".btn:nth-child(3)") WebElement loginBtn;
	//By loginBtn = By.id("login-button");

	//Locator for click search
	@FindBy(id="search") WebElement searchField ;

	//Locator for  search value
	@FindBy(css="#search > input") WebElement searchValue;

	//Locator for  search symbol
	@FindBy(css=".fa-search") WebElement clickSearchSymbol;

	//	driver.findElement(By.name("search")).click();
	//    // 9 | type | name=search | Iphone
	//    driver.findElement(By.name("search")).sendKeys("Iphone");
	//    // 10 | sendKeys | name=search | ${KEY_ENTER}
	//    driver.findElement(By.name("search")).sendKeys(Keys.ENTER);
	//    // 11 | click | css=.fa-search | 
	//    driver.findElement(By.cssSelector(".fa-search")).click();
	//    // 12 | click | css=.img-responsive | 
	//    driver.findElement(By.cssSelector(".img-responsive")).click();



	public void ChooseFromDrop() {
		uDropDownMyAccount.click();
	}

	// Method to Click new account
	public void ClickNewAccount() {
		uLogAccount.click();
	}

	//Method to enter username
	public void enterUsername(String user) {
		//	driver.findElement(uName).sendKeys(user);
		uName.sendKeys(user);
	}

	//Method to enter password
	public void enterPassword(String pass) {
		//driver.findElement(pswd).sendKeys(pass);
		pswd.sendKeys(pass);
	}

	//Method to click on Login button
	public void clickLogin() {
		//	driver.findElement(loginBtn).click();
		loginBtn.click();
	}

	// Method to Click new account
	public void ClickSearch() {
		searchField.click();
	}

	public void enterSearch(String value) {
		searchValue.sendKeys(value);
	}
	public void ClickSearchS() {
		clickSearchSymbol.click();
	}


}
