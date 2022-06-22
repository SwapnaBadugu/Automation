package testNG;

//https://www.youtube.com/watch?v=qxZdhiW4U40&t=1821s&ab_channel=AutomationTestingInsider
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgexecution {
	WebDriver driver;

	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("BeforeSuitis Executede");

	}

	@BeforeTest
	public void LaunchBrowser() {
		System.out.println("BeforeTest is Executed");

	}

	@BeforeClass
	public void BeforeClass() {
		System.out.println("BeforeClass is Exceuted");

	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("BeforeMethod is Exceuted");

	}

	@Test
	public void Testmethod1() {
		System.out.println("Test2 is Exceuted");

	}

	@Test
	public void Testmethod2() {
		System.out.println("Test2 is Exceuted");

	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod is Exceuted");

	}

	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass is Exceuted");

	}

	@AfterTest
	public void CloseBrowser() {
		System.out.println("AfterTest is Ececuted");

	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("AfterSuite is Executed");

	}

}
