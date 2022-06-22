package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAssertions {
	WebDriver driver;

	@BeforeTest
	public void BeforeTest() {
		System.out.println("BeforeTest is Exceuted");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("@AfterTest is Exceuted");
	}

	@BeforeSuite(groups = {"Sanity"})
	public void OrangeHRMTestSetUp () {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkatbadugu\\Downloads\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}

	@Test(priority = 1, description = "LaunchBrowser",groups = {"Sanity"})
	public void LaunchBrowser() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		boolean img = driver.findElement(By.xpath("//div[@id='divLogin']/div/img")).isDisplayed();
		Assert.assertTrue(img);
	}

	@Test(priority = 2, description = "LoginTest",groups = {"Sanity"})
	public void LoginTest() {

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		boolean img1 = driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com/']/img")).isDisplayed();
		Assert.assertTrue(img1);
	}

	@Test(priority = 3, description = "CurrURLTest",groups = {"Regression"})
	public void CurrURLTest() {
		String actualurl = driver.getCurrentUrl();
		String Expectedurl = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		Assert.assertEquals(actualurl, Expectedurl);
	}

	@Test(priority = 4, description = "TitleTest",groups = {"Regression"})
	public void TitleTest() {
		String actualtitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		Assert.assertEquals(actualtitle, expectedTitle);
	}

	@Test(priority = 5, description = "logout",groups = {"Sanity"})
	public void logout() throws InterruptedException {
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		String currenturl = driver.getCurrentUrl();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		Assert.assertEquals(currenturl, expectedUrl);
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
