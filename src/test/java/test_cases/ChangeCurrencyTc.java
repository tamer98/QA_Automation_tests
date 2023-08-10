package test_cases;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.junit.Test;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.ChangeCurrency;
import pages.LoginOpenCart;
import pages.LoginOpenCart;

//import Page_factory_examples.Login_pom_pf_sauce_demo;
import org.openqa.selenium.Dimension;
import java.io.IOException;
//import pages.Login_pom_sauce_demo;


public class ChangeCurrencyTc {
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
		
		LoginOpenCart LoginPage = PageFactory.initElements(driver, LoginOpenCart.class);
		Thread.sleep(timedelay);
		LoginPage.ChooseFromDrop();
		Thread.sleep(timedelay);
		LoginPage.ClickNewAccount();
		Thread.sleep(timedelay);
		LoginPage.enterUsername("toto@gmail.com");
		LoginPage.enterPassword("toto");
		LoginPage.clickLogin();
		
		
		ChangeCurrency Currency = PageFactory.initElements(driver, ChangeCurrency.class);
		Currency.clickHome();
		Thread.sleep(timedelay);
		Currency.addToCart();
		Thread.sleep(timedelay);
		Currency.openMenu();
		Thread.sleep(timedelay);
		Currency.chooseCurrnecy();
			
	}

	public static void main(String args[]) {
		JUnitCore junit = new JUnitCore();
		junit.addListener(new TextListener(System.out));
		org.junit.runner.Result result = junit.run(ChangeCurrencyTc.class); // Replace "SampleTest" with the name of your class
		if (result.getFailureCount() > 0) {
			System.out.println("Test failed.");
			System.exit(1);
		} else {
			System.out.println("Test finished successfully.");
			System.exit(0);
		}
	}
}







