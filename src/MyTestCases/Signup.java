package MyTestCases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Signup extends parmetars {

	WebDriver driver = new ChromeDriver();
	String TheURL = "https://magento.softwaretestingboard.com/";

	@BeforeTest
	public void mySetup() {

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	}

	@Test()
	public void myFirstTest() {

		driver.get(TheURL);

		driver.findElement(By.linkText("Create an Account")).click();

		// find the Element
		WebElement FirstName = driver.findElement(By.id("firstname"));
		WebElement LastName = driver.findElement(By.id("lastname"));
		WebElement Email = driver.findElement(By.id("email_address"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement ConfirmPassword = driver.findElement(By.id("password-confirmation"));

		WebElement CreateAccountButton = driver.findElement(By.cssSelector("button[title='Create an Account'] span"));

		FirstName.sendKeys(firstNames[randomIndex]);
		LastName.sendKeys(lastNames[randomIndex]);
		Email.sendKeys(emailId);
		Password.sendKeys(commonPassword);
		ConfirmPassword.sendKeys(commonPassword);

		CreateAccountButton.click();

		String WelcomeMsg = driver.findElement(By.className("message-success")).getText();

		assertEquals(WelcomeMsg,"Thank you for registering with Main Website Store.");
	}
}
