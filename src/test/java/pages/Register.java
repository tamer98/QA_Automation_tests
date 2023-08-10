package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register {



	WebDriver driver;

	//Constructor that will be automatically called as soon as the object of the class is created
	public  Register(WebDriver driver) {
		this.driver = driver;
	}


	//locator for my account dropdown
	@FindBy(css=".list-inline .dropdown-toggle") WebElement uDropDownMyAccount;


	//Locator for username field
	@FindBy(linkText="Register") WebElement uNewAccount;
	//By uName = By.id("user-name");


	//Locator for firstName field
	@FindBy(id="input-firstname") WebElement uFirstName;
	//By uName = By.id("user-name");


	//Locator for firstName field
	@FindBy(id="input-lastname") WebElement uLastName;


	//Locator for username field
	@FindBy(id="input-email") WebElement uMail;
	//By uName = By.id("user-name");


	//Locator for password field
	@FindBy(id="input-telephone") WebElement uPhoneNum;


	//Locator for password field
	@FindBy(id="input-password") WebElement pswd;


	//Locator for password field
	@FindBy(id="input-confirm") WebElement pswdConfirm;

	//*[@id="content"]/form/div/div/input[1]
	//Locator for checkbox
	@FindBy(name = "agree") WebElement agreeCheckBox;


	//Locator for continue button
	@FindBy(css=".btn-primary") WebElement continueBtn;


	//
	//	// 4 | click | id=input-firstname | 
	//    driver.findElement(By.id("input-firstname")).click();
	//    // 5 | type | id=input-firstname | arin
	//    driver.findElement(By.id("input-firstname")).sendKeys("arin");
	//    // 6 | click | id=input-lastname | 
	//    driver.findElement(By.id("input-lastname")).click();
	//    // 7 | type | id=input-lastname | popo
	//    driver.findElement(By.id("input-lastname")).sendKeys("popo");
	//    // 8 | click | id=input-email | 
	//    driver.findElement(By.id("input-email")).click();
	//    // 9 | type | id=input-email | popo@gmail.com
	//    driver.findElement(By.id("input-email")).sendKeys("popo@gmail.com");
	//    // 10 | click | id=input-telephone | 
	//    driver.findElement(By.id("input-telephone")).click();
	//    // 11 | type | id=input-telephone | 209
	//    driver.findElement(By.id("input-telephone")).sendKeys("209");
	//    // 12 | click | id=input-password | 
	//    driver.findElement(By.id("input-password")).click();
	//    // 13 | type | id=input-password | popo
	//    driver.findElement(By.id("input-password")).sendKeys("popo");
	//    // 14 | click | id=input-confirm | 
	//    driver.findElement(By.id("input-confirm")).click();
	//    // 15 | type | id=input-confirm | popo
	//    driver.findElement(By.id("input-confirm")).sendKeys("popo");
	//    // 16 | click | name=agree | 
	//    driver.findElement(By.name("agree")).click();
	//    // 17 | click | css=.btn-primary | 
	//    driver.findElement(By.cssSelector(".btn-primary")).click();


	public void ChooseFromDrop() {
		uDropDownMyAccount.click();
	}

	// Method to Click new account
	public void ClickNewAccount() {
		uNewAccount.click();
	}

	//Method to enter first-name
	public void enterFirstName(String input) {
		uFirstName.sendKeys(input);
	}


	public void enterLastName(String input) {
		uLastName.sendKeys(input);
	}


	public void enterMail(String input) {
		uMail.sendKeys(input);
	}


	public void enterPhone(String input) {
		uPhoneNum.sendKeys(input);
	}


	public void enterPass(String input) {
		pswd.sendKeys(input);
	}


	public void enterPassConfirm(String input) {
		pswdConfirm.sendKeys(input);
	}


	public void setCheckBox() {
		if(!agreeCheckBox.isSelected()) { agreeCheckBox.click();}
		
	}


	public void clickContinue() {
		continueBtn.click();
	}
}
