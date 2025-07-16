package selenium.locators;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class AmazonAutomation {
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

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
// 		5. Check if "Continue Shopping" button is present
            wait.until(ExpectedConditions.or(
                ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(),'Continue shopping')]")),
                ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='twotabsearchtextbox']"))
            ));

            if (driver.findElements(By.xpath("//button[contains(text(),'Continue shopping')]")).size() > 0) {
                WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(),'Continue shopping')]"));
                continueButton.click();
            }

// 		6. Wait for search bar
            wait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));

// 		7. Change pincode
            WebElement pincode = driver.findElement(By.xpath("//span[@id='glow-ingress-line1' or @id='glow-ingress-line2']"));
            pincode.click();

            WebElement updatePincode = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("GLUXZipUpdateInput")));
            updatePincode.sendKeys("110045", Keys.ENTER);

// 		8. Wait for pincode to update
            Thread.sleep(2000); // better to use ExpectedConditions if possible

// 		9. Search for product
           WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
           searchBox.sendKeys("iPhone 16 Pro Max 256 GB", Keys.ENTER);

//    	10. Wait for seacrh result
    	    wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//a[contains(@href, 'iPhone-16-Pro-Max-256') and contains(., 'Desert Titanium')]"), 0));
    		
//      11. Click on Add to cart button
    	    WebElement addTocart = driver.findElement(By.xpath("//button[@id='a-autoid-3-announce']"));
    	    addTocart.click();
    		
//    	12. Click on Cart
    		Thread.sleep(2000);
    		WebElement cartButton = driver.findElement(By.xpath("//a[contains(text(),'Go to Cart')]"));
    		cartButton.click();
    		
    		
//    	13. Click on Proceed to Check Out
    		WebElement proceedToChekout = driver.findElement(By.xpath("//input[@value='Proceed to checkout']"));
    		proceedToChekout.click();
    		
//		14. Enter username    	
    		Thread.sleep(1000);
    		WebElement userName = driver.findElement(By.xpath("//input[@id='ap_email_login']"));
    		userName.sendKeys("akash.doe@gmail.com");
    		
//		15. Click on Continue Button
    		WebElement continueEmail = driver.findElement(By.xpath("//input[@class='a-button-input']"));
    		continueEmail.click();
    		
//    	16. Enter Password    
    		Thread.sleep(1000);
    		WebElement Password = driver.findElement(By.xpath("//input[@id='ap_password']"));
    		Password.sendKeys("Amazon@2024");
    		
//    	17. Click on Sign In Button
    		WebElement signIn = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
    		signIn.click();
    		
// 		18. Click on Delivery Address Button
    		WebElement deliveryAdd = driver.findElement(By.xpath("//span[@id='checkout-secondary-continue-button-id']"));
    		deliveryAdd.click();
    		
//     	19. Wait for Main Payment Section 
    		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//span[text()='Yes Bank Credit Card']"), 0));
    		
//      20. Click on Payment option Button    		
    		WebElement headingMessage1 = driver.findElement(By.xpath("//span[text()='CREDIT & DEBIT CARDS' and contains(@class,'a-size-medium a-text-bold')]"));
    		String actualMsg1 = headingMessage1.getText();
    		String expectedMsg1 = "CREDIT & DEBIT CARDSS";

//		21. Wait for Another Payment Section    		
    		WebElement headingMessage2 = driver.findElement(By.xpath("//span[normalize-space(text())='Another payment method' and contains(@class,'a-size-medium a-text-bold')]"));
    		String actualMsg2 = headingMessage2.getText();
    		String expectedMsg2 = "Another payment method";

//    	22. Use if-else to ensure only one block executes
    		if (actualMsg1.equals(expectedMsg1)) {
    		    selectCrDrPaymentMode("RBL Bank Credit Card");
    		} else if (actualMsg2.equals(expectedMsg2)) {
    		    selectAnotherPaymentMode("Net Banking");
    		} else {
    		    System.out.println("Neither payment method heading matched.");
    		}
    		
//		23. Click on Netbanking Payment Dropdown	    		
    		WebElement dropdown = driver.findElement(By.xpath("//span[contains(text(),'Net Banking')]//following::span[contains(text(),'Select your bank') or @class='a-dropdown-prompt']")); 
    		dropdown.click();

// 		24. Call NetBanking Method for choose Bank "Axis Bank"
    		selectNetBanking("Axis Bank");

//		25. Click on Use this payment method button    		
    		WebElement usePmtMethod = driver.findElement(By.xpath("//span[@id='checkout-secondary-continue-button-id-announce']"));
    		JavascriptExecutor js = (JavascriptExecutor) driver;
    		((JavascriptExecutor) driver).executeScript("arguments[0].click();", usePmtMethod);
   		
//		26. Close Pop-up   		
    		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//button[@class=' a-button-close a-declarative a-button-top-right']"), 0));
    		WebElement popUpClose = driver.findElement(By.xpath("//button[@class=' a-button-close a-declarative a-button-top-right']"));
    		popUpClose.click();
    		
    		
    		
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
            
            
        } finally {
          driver.quit(); 
        }
        
    }
    public static void selectCrDrPaymentMode(String option) {
		WebElement selectPmtMode = driver.findElement(By.xpath("//span[text()='"+option+"']"));
		selectPmtMode.click();
	}
    public static void selectAnotherPaymentMode(String option) {
		WebElement selectPmtMode = driver.findElement(By.xpath("//span[text()='"+option+"' and contains(@class,'a-text-bold')]"));
		selectPmtMode.click();
	}
    public static void selectNetBanking(String option) {
		WebElement NetBankingBank = driver.findElement(By.xpath("//a[text()='"+option+"']"));
		NetBankingBank.click();
	}
}
