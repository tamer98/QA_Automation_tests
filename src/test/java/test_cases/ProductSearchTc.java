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
import pages.ProductSearch;

//import Page_factory_examples.Login_pom_pf_sauce_demo;
import org.openqa.selenium.Dimension;
import java.io.IOException;
//import pages.Login_pom_sauce_demo;


public class ProductSearchTc {
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
		
		ProductSearch ProductSearch = PageFactory.initElements(driver, ProductSearch.class);
		Thread.sleep(timedelay);
		ProductSearch.ChooseFromDrop();
		Thread.sleep(timedelay);
		ProductSearch.ClickNewAccount();
		Thread.sleep(timedelay);
		ProductSearch.enterUsername("toto@gmail.com");
		ProductSearch.enterPassword("toto");
		ProductSearch.clickLogin();
		Thread.sleep(timedelay);
		ProductSearch.ClickSearch();
		Thread.sleep(timedelay);
		ProductSearch.enterSearch("Iphone");
		Thread.sleep(500);
		ProductSearch.ClickSearchS();
		
	}

	public static void main(String args[]) {
		JUnitCore junit = new JUnitCore();
		junit.addListener(new TextListener(System.out));
		org.junit.runner.Result result = junit.run(ProductSearchTc.class); // Replace "SampleTest" with the name of your class
		if (result.getFailureCount() > 0) {
			System.out.println("Test failed.");
			System.exit(1);
		} else {
			System.out.println("Test finished successfully.");
			System.exit(0);
		}
	}
}







