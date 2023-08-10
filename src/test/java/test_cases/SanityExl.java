package test_cases;

import org.junit.Test;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import test_cases.base_test_class;
import pages.LoginOpenCart;
import pages.Register;
import pages.ChangeCurrency;
import pages.ProductSearch;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;

public class SanityExl {
	//	private static final Logger logger = LogManager.getLogger(sanity_check.class);
	private WebDriver driver;
	public static int countRegSuccess = 0;
	public static int countLogInSuccess = 0;
	public static int countAddSuccess = 0;
	private static final int timedelay=1500;


	public base_test_class readObeject = new base_test_class();

	@After
	public void tearDown() {
		//driver.quit();
	}

	@Before
	public void setUp() throws IOException {
		driver = base_test_class.initializeDriver();

	}
	
	
	
	//*********** there is 3 sanity test run in this page that read from excel file you can check one of them each run *************
	
	
		@Test
		public void register() throws InterruptedException, IOException {
			readObeject.readExcel("/Users/TamerAltaji/Desktop/Java-Workplace/qaHw3/files","readExl.xls","registerExl");
			
			Register register = new Register(driver);
			Thread.sleep(timedelay);
			register.ChooseFromDrop();
			Thread.sleep(timedelay);
			register.ClickNewAccount();
			Thread.sleep(timedelay);
			
			
			int rowCount = base_test_class.getRowcount();
			Sheet thsSheet = base_test_class.getsheet();
			
			for (int i = 1; i < rowCount + 1; i++) {
				Row row = thsSheet.getRow(i);
				register.enterFirstName(row.getCell(0).getStringCellValue());
				Thread.sleep(timedelay);
				register.enterLastName(row.getCell(1).getStringCellValue());
				Thread.sleep(timedelay);
				register.enterMail(row.getCell(2).getStringCellValue());
				Thread.sleep(timedelay);
				register.enterPhone(row.getCell(3).getStringCellValue());
				Thread.sleep(timedelay);
				register.enterPass(row.getCell(4).getStringCellValue());
				Thread.sleep(timedelay);
				register.enterPassConfirm(row.getCell(5).getStringCellValue());
				Thread.sleep(timedelay);
				register.setCheckBox();
				Thread.sleep(timedelay);
				register.clickContinue();

				if (driver.getCurrentUrl()
						.compareToIgnoreCase("http://tutorialsninja.com/demo/index.php?route=account/account") == 0) {
					countLogInSuccess++;
				}
			}
		}



//	@Test
//	public void login() throws InterruptedException, IOException {
//
//		readObeject.readExcel("/Users/TamerAltaji/Desktop/Java-Workplace/qaHw3/files","readExl.xls","readExl");
//		LoginOpenCart loginOpenCart = new LoginOpenCart(driver);
//		Thread.sleep(timedelay);
//		loginOpenCart.ChooseFromDrop();
//		Thread.sleep(timedelay);
//		loginOpenCart.ClickNewAccount();
//		Thread.sleep(timedelay);
//		int rowCount = base_test_class.getRowcount();
//		Sheet thsSheet = base_test_class.getsheet();
//		for (int i = 1; i < rowCount + 1; i++) {
//			Row row = thsSheet.getRow(i);
//			loginOpenCart.enterUsername(row.getCell(0).getStringCellValue());
//			Thread.sleep(timedelay);
//			loginOpenCart.enterPassword(row.getCell(1).getStringCellValue());
//			Thread.sleep(timedelay);
//			loginOpenCart.clickLogin();	
//			if (driver.getCurrentUrl()
//					.compareToIgnoreCase("http://tutorialsninja.com/demo/index.php?route=account/account") == 0) {
//				countLogInSuccess++;
//			}
//		}
//	}
//
//	
//	@Test
//	public void changeCurrency() throws InterruptedException, IOException {
//
//		readObeject.readExcel("/Users/TamerAltaji/Desktop/Java-Workplace/qaHw3/files","readExl.xls","readExl");
//		LoginOpenCart loginOpenCart = new LoginOpenCart(driver);
//		Thread.sleep(timedelay);
//		loginOpenCart.ChooseFromDrop();
//		Thread.sleep(timedelay);
//		loginOpenCart.ClickNewAccount();
//		Thread.sleep(timedelay);
//		int rowCount = base_test_class.getRowcount();
//		Sheet thsSheet = base_test_class.getsheet();
//		for (int i = 1; i < rowCount + 1; i++) {
//			Row row = thsSheet.getRow(i);
//			loginOpenCart.enterUsername(row.getCell(0).getStringCellValue());
//			Thread.sleep(timedelay);
//			loginOpenCart.enterPassword(row.getCell(1).getStringCellValue());
//			Thread.sleep(timedelay);
//			loginOpenCart.clickLogin();	
//			
//			
//			ChangeCurrency Currency = PageFactory.initElements(driver, ChangeCurrency.class);
//			Currency.clickHome();
//			Thread.sleep(timedelay);
//			Currency.addToCart();
//			Thread.sleep(timedelay);
//			Currency.openMenu();
//			Thread.sleep(timedelay);
//			Currency.chooseCurrnecy();
//			
//			
//			if (driver.getCurrentUrl()
//					.compareToIgnoreCase("http://tutorialsninja.com/demo/index.php?route=account/account") == 0) {
//				countLogInSuccess++;
//			}
//		}
//	}
	
	public static void main(String args[]) {
		JUnitCore junit = new JUnitCore();
		junit.addListener(new TextListener(System.out));
		org.junit.runner.Result result = junit.run(LoginOpenCart.class); // Replace "SampleTest" with the name of your class
		if (result.getFailureCount() > 0) {
			System.out.println("Test failed.");
			System.exit(1);
		} else {
			System.out.println("Test finished successfully.");
			System.exit(0);
		}
	}
}
