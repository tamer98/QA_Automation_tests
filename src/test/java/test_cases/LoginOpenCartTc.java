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

import pages.LoginOpenCart;
import pages.ProductSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import test_cases.base_test_class;
//import pages.Register_page;
//import pages.login_page;
//import pages.main_page;
//import pages.add_to_cart;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;

public class LoginOpenCartTc {
	private static final int timedelay=1500;
	private WebDriver driver;


	@After
	public void tearDown() {
		//  driver.quit();
	}


	@Before
	public void setUp() throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/TamerAltaji/Desktop/QA/chromedriver");
		driver = new ChromeDriver();
	}


	@Test
	public void simple() throws InterruptedException {

		driver.get("http://www.tutorialsninja.com/demo/");
		driver.manage().window().setSize(new Dimension(1204, 724));
		
		LoginOpenCart loginOpenCart = PageFactory.initElements(driver, LoginOpenCart.class);
		Thread.sleep(timedelay);
		loginOpenCart.ChooseFromDrop();
		Thread.sleep(timedelay);
		loginOpenCart.ClickNewAccount();
		Thread.sleep(timedelay);
		loginOpenCart.enterUsername("toto@gmail.com");
		loginOpenCart.enterPassword("toto");
		loginOpenCart.clickLogin();
		
		
	
		
		
		
//		int rowCount = base_test_class.getRowcount();
//		Sheet thsSheet = base_test_class.getsheet();
//		for (int i = 1; i < rowCount + 1; i++) {
//			Row row = thsSheet.getRow(i);
//			LoginPage.enterUsername(row.getCell(0).getStringCellValue());
//			Thread.sleep(timedelay);
//			LoginPage.enterPassword(row.getCell(1).getStringCellValue());
//			Thread.sleep(timedelay);
//			LoginPage.clickLogin();
//
//			
//		}
//	
		
	}

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







