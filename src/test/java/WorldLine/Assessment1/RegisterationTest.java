package WorldLine.Assessment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterationTest {

	WebDriver driver;
	// Test to open the Chrome Browser
	@Test(priority=0)
	public void openWebsite() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        WebElement regLink = driver.findElement(By.xpath("//a[@title='My Account']"));
        regLink.click();
        Thread.sleep(1000);
	}
	
	// Test to register user on the turtuleninja website
	@Test(priority=1)
	public void registerUser() {
		WebElement reg=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		reg.click();
		
		WebElement username=driver.findElement(By.id("input-firstname"));
		WebElement userlastname=driver.findElement(By.id("input-lastname"));
		WebElement email=driver.findElement(By.id("input-email"));
		WebElement tel=driver.findElement(By.id("input-telephone"));
		WebElement pass=driver.findElement(By.id("input-password"));
		WebElement confirmpass=driver.findElement(By.id("input-confirm"));
		WebElement subBtn=driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		username.sendKeys("Jyoti");
		userlastname.sendKeys("Singh");
		email.sendKeys("jyotisingh1@gmail.com");
		tel.sendKeys("7894561230");
		pass.sendKeys("asdfg456");
		confirmpass.sendKeys("asdfg456");
		
		subBtn.click();
		
		WebElement regBtn=driver.findElement(By.xpath("//input[@value='Continue']"));
		regBtn.click();
		driver.quit();
	}
	
	//Test to login using valid credentials
	@Test(priority=2)
	public void loginCheck() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
		WebElement regLink = driver.findElement(By.xpath("//a[@title='My Account']"));
		regLink.click();
		WebElement loginLink =driver.findElement(By.xpath("//body//nav[@id='top']//li//li[2]//a[1]"));
		loginLink.click();
		Thread.sleep(1000);
		System.out.println("clicked successfully!");
	
		WebElement useremail=driver.findElement(By.id("input-email"));
		WebElement pass=driver.findElement(By.id("input-password"));
		WebElement logbtn=driver.findElement(By.xpath("//input[@value='Login']"));
		
		useremail.sendKeys("singhroshni7456@gmail.com");
		pass.sendKeys("asdfg456");
		logbtn.click();
		
		System.out.println("Login successfully");
	}
	
	// Test to search item io the search box
	@Test(priority=3)
	public void searchItem() throws InterruptedException {
		WebElement serBox=driver.findElement(By.name("search"));
		serBox.sendKeys("touch");
		
		
		WebElement ser=driver.findElement(By.xpath("//div[@id='search']//button[@type='button']"));
		ser.click();
		
		Thread.sleep(1000);
		WebElement sercheck=driver.findElement(By.name("description"));
		sercheck.click();
		
		Thread.sleep(2000);
	
		WebElement search=driver.findElement(By.id("button-search"));
		search.click();
		Thread.sleep(2000);
	}
	
	// Test to select serached item
	@Test(priority=4)
	public void selectItem() throws InterruptedException {
		
		WebElement item=driver.findElement(By.xpath("//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[1]"));
		item.click();
		Thread.sleep(1000);
	}
	
	//Test to Add item to the cart and view it
	@Test(priority=5)
	public void addtoCartandViewCart() throws InterruptedException {
		WebElement cart=driver.findElement(By.xpath("//button[@data-loading-text='Loading...']"));
		cart.click();
		Thread.sleep(1000);
		
		
		WebElement cartClose=driver.findElement(By.xpath("//button[@title='Remove']"));
		cartClose.click();
		Thread.sleep(1000);
	
		
	}
	// Test to logout out of website
	@Test(priority=6)
	public void logOut() throws InterruptedException {

		WebElement link=driver.findElement(By.xpath("//a[@title='My Account']"));
		link.click();
		Thread.sleep(1000);
		System.out.println("account selected successfully");
		
		
		WebElement logout=driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
		logout.click();
	}
	// Quiting chrome driver
	@Test(priority=7)
	public void terminatedriver() {
		driver.quit();
	}
	
	
}
