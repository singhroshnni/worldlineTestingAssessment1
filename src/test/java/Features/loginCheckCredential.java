package Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class loginCheckCredential {
	WebDriver driver;
	
	@Given("Broswer is open")
	public void openBrower() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        System.out.println("Browser opened successfully");
		
	}
	
	@Given("Web-App is open and is on login page")
	public void web_app_is_open_and_is_on_login_page() throws InterruptedException {
		driver.manage().window().maximize();
		WebElement regLink = driver.findElement(By.xpath("//a[@title='My Account']"));
		regLink.click();
		WebElement loginLink =driver.findElement(By.xpath("//body//nav[@id='top']//li//li[2]//a[1]"));
		loginLink.click();
		Thread.sleep(10000);
	}

	@When("Enter valid email and password")
	public void enter_valid_email_and_password() {
		WebElement useremail=driver.findElement(By.id("input-email"));
		WebElement pass=driver.findElement(By.id("input-password"));
		
		
		useremail.sendKeys("singhroshni7456@gmail.com");
		pass.sendKeys("asdfg456");
	}

	@When("click on submit")
	public void click_on_submit() {
		WebElement logbtn=driver.findElement(By.xpath("//input[@value='Login']"));
		logbtn.click();

	}

	@Then("My account page is displayed")
	public void my_account_page_is_displayed() {
		String expect="https://tutorialsninja.com/demo/index.php?route=account/account";
		String actual=driver.getCurrentUrl();
		
		Assert.assertEquals(expect, actual);
		System.out.println("Login successfully");
	}

	@When("Enter invalid {string} and {string} combinations")
	public void enter_invalid_and_combinations(String string, String string2) {
		WebElement useremail=driver.findElement(By.id("input-email"));
		WebElement pass=driver.findElement(By.id("input-password"));
		
		
		useremail.sendKeys("string");
		pass.sendKeys("string2");
		WebElement logbtn=driver.findElement(By.xpath("//input[@value='Login']"));
		logbtn.click();
	}

	@Then("an error is displayed")
	public void an_error_is_displayed() {
		String expect="https://tutorialsninja.com/demo/index.php?route=account/account";
		String actual=driver.getCurrentUrl();
		
		Assert.assertEquals(expect, actual);
		System.out.println("Login unsuccessfully");

	}



}
