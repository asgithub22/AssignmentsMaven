package selenium.locators;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Assignment21_AutomateWebsite {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
//		1. Launch browser window
		driver = new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all the cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the application (https://parabank.parasoft.com/parabank/index.htm)
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		5. Verify application title
		String actualTitle = driver.getTitle();
		String expectedTitle = "ParaBank | Welcome | Online Banking";
		Assert.assertEquals(actualTitle, expectedTitle);
		
//		6. Verify application logo
		WebElement logo = driver.findElement(By.xpath("//img[@class='logo']"));
		Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed");
		
//		7. Verify application caption
		WebElement caption = driver.findElement(By.xpath("//p[@class='caption']"));
		String actualCaption = caption.getText();
		String expectedCaption = "Experience the difference";
		Assert.assertEquals(actualCaption, expectedCaption);
		
//		8. Enter Invalid credentials in Username and Password textboxes
	/*	WebElement Username = driver.findElement(By.name("username"));
		// Clear the input box of Username 
		Username.clear();
		// Enter Invalid credentials in Username
		Username.sendKeys("admin@yopmail.com");
		WebElement Password = driver.findElement(By.name("password"));
		// Clear the input box of Password
		Password.clear();
		// Enter Invalid credentials in Password
		Password.sendKeys("admin#12345");
	*/
		WebElement usernameTxtb = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement passwordTxtb = driver.findElement(By.xpath("//input[@name='password']"));
		
//		Clear the Text Box
		usernameTxtb.clear();
		passwordTxtb.clear();
		
		usernameTxtb.sendKeys("Invalid User");
//		passwordTxtb.sendKeys("Invalid Password");
		
//		9. Click on Login Button
		/*driver.findElement(By.tagName("submit")).click();*/
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
		loginButton.click();
		
//		Wait For Error Message
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//p[@class='error']"), 0));
		 	
		
//		10. Verify error message is displayed (The username and password could not be verified.)
		WebElement errorMessage = driver.findElement(By.xpath("//p[@class='error']"));
		String actualError = errorMessage.getText() ;
		String expectedError = "Please enter a username and password.";
		Assert.assertEquals(actualError, expectedError);
		
//		11. Click on Adminpage link
		/*driver.findElement(By.cssSelector("ul[class='leftmenu'] > li > a[href='admin.htm']")).click();*/
		WebElement adminLink = driver.findElement(By.xpath("//a[text()='Admin Page']"));
		adminLink.click();
		
//		12. Wait for admin page
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//h1[contains(text(),'Administration')]"), 0));
		
		
//		13. Select Data access mode as ' SOAP'
		selectedAccessMode("soap");
		
//		14. Scrolldown till Loan provider
		WebElement loanProvider = driver.findElement(By.xpath("//select[@name='loanProvider']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", loanProvider);
		
//		15. Select Loanprovider as 'Web Service'
		Select s = new Select(loanProvider);
		s.selectByVisibleText("Web Service");
		
//		16. Click on Submit button
		WebElement submitButton = driver.findElement(By.xpath("//input[@value='Submit']"));
		submitButton.click();
		
//		17.wait for Successful submission message
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//b[text()='Settings saved successfully.']"), 0));
		
//		18.Click on Services Link
		WebElement serviceLink = driver.findElement(By.xpath("//ul[@class='leftmenu']//a[text()='Services']"));
		serviceLink.click();
		
//		19.Wait for Services page
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//span[text()='Bookstore services:']"), 0));
		
//		20.Scrolldown till Bookstore services
		WebElement bookStoreServices = driver.findElement(By.xpath("//span[text()='Bookstore services:']"));
		js.executeScript("arguments[0].scrollIntoView(true);", bookStoreServices);
		
//		21.Get total rows, columns in the bookstore service table
		List<WebElement> rows = driver.findElements(By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]//tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]//tr[1]//td"));
		
		int totalRows = rows.size();
		int totalColumns = columns.size();
		
//		22.Get Column headers of book store services table
//		23.Get all the data from book store service table
		
		for( int r=1;r<=totalRows;r++)
		{
			for(int c=1;c<=totalColumns;c++) {
				WebElement cell = driver.findElement(By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]//tr["+r+"]//td["+c+"]"));
				String cellValue = cell.getText();
				System.out.println("Row "+r+", Column "+c+" Value is : " +cellValue);
			}
		}
				
//		24.Close browser window
		driver.quit();
	}
		public static void selectedAccessMode(String option) {
			WebElement dbaMode = driver.findElement(By.xpath("//input[@value='"+option+"']"));
			dbaMode.click();
		}

	}




