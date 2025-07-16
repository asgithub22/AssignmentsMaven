
/***********NOT IN USE***********/

package selenium.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AmazonWebsite {
	
	static WebDriver driver;
	static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public static void main(String[] args) {
		
		
//		1. Launch browser window (Chrome)    
		driver = new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all the cookies        
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the application (https://www.amazon.in/)   
		driver.get("https://www.amazon.in/");
		
		
//		8. Click on Continue To Shooping button
		//WebElement continueToShooping = driver.findElement(By.xpath("//button[@alt='Continue shopping']"));
		//continueToShooping.click();
	
//		6. Click for change the Pincode
		WebElement pincode = driver.findElement(By.xpath("//span[@id='glow-ingress-line2']"));
		pincode.click();
		
//		7. Enter Update Pincode
		WebElement updatePincode = driver.findElement(By.xpath("//input[@id='GLUXZipUpdateInput']"));
		updatePincode.sendKeys("110045");
		
		WebElement apply = driver.findElement(By.xpath("//span[@id='GLUXZipUpdate-announce']"));
		apply.click();

		
//		5. Locate Search Bar
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
//		6. Search Product (Apple iPhone)
		WebElement searchPhone = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchPhone.sendKeys("iPhone 16pro max", Keys.ENTER);
		
//		7. Wait for seacrh result
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//h2[@aria-label='iPhone 16 Pro Max 256 GB: 5G Mobile Phone with Camera Control, 4K 120 fps Dolby Vision and a Huge Leap in Battery Life. Works with AirPods; Desert Titanium']"), 0));
		
//		8. Click on Add to cart button
		WebElement addTocart = driver.findElement(By.xpath("//button[@id='a-autoid-3-announce']"));
		addTocart.click();
		
//		9. Click on Cart
		WebElement cartButton = driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']"));
		cartButton.click();
		
//		10. Click on Proceed to Check Out
		WebElement proceedToChekout = driver.findElement(By.xpath("//input[@value='Proceed to checkout']"));
		proceedToChekout.click();
		
		
		
	}

}
