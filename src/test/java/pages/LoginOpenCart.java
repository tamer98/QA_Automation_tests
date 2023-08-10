package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.collections4.map.StaticBucketMap;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginOpenCart {

static int rowCount;
static Sheet guru99Sheet;
	WebDriver driver;

	//Constructor that will be automatically called as soon as the object of the class is created
	public  LoginOpenCart(WebDriver driver) {
		this.driver = driver;
	}

	//locator for my account dropdown
	@FindBy(css=".list-inline .dropdown-toggle") WebElement uDropDownMyAccount;
	
	//Locator for username field
	@FindBy(linkText="Login") WebElement uNewAccount;
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


	
	public void ChooseFromDrop() {
		uDropDownMyAccount.click();
	}
	
	
	// Method to Click new account
	public void ClickNewAccount() {
		uNewAccount.click();
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

}
