package selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentParaBankWebsiteLocators {

	public static void main(String[] args) {
		
//		Launch the Chrome Browser
		WebDriver driver = new ChromeDriver();
		
//		Maximize the Browser Window
		driver.manage().window().maximize();
		
//		Enter URL and launch the application (Parabank)		
		driver.get("https://para.testar.org/parabank/about.htm");
		
//		1. Locate 'Square Image Box' using css Selector
		driver.findElement(By.cssSelector("img[src='images/clear.gif']"));
		
//		2. Locate 'Solution' using class locator
		driver.findElement(By.className("Solutions"));
	   
//		3. Locate 'Solution' using advance css Selector
		driver.findElement(By.cssSelector("ul[class='leftmenu'] > li > a[href='about.htm']"));
		
//		4. Locate 'Services' using advance css Selectorr
		driver.findElement(By.cssSelector("ul[class='leftmenu'] > li > a[href='services.htm']"));
		
//		5. Locate 'Products' using advance css Selector
		driver.findElement(By.cssSelector("ul[class='leftmenu'] > li > a[href='http://www.parasoft.com/jsp/products.jsp']"));
		
//		6. Locate 'Location' using advance css Selector
		driver.findElement(By.cssSelector("ul[class='leftmenu'] > li > a[href='http://www.parasoft.com/jsp/pr/contacts.jsp']"));
		
//		7. Locate 'Location' using advance css Selector
		driver.findElement(By.cssSelector("ul[class='leftmenu'] > li > a[href='admin.htm']"));
		
//		8. Locate 'Customer Login' using tagName
		driver.findElement(By.tagName([text()="Customer Login"));
		
//		9. Locate 'Username' using tagName
		driver.findElement(By.b[text()="Username"]);
		
//		10. Locate 'Input Box of Username' using tagName
		driver.findElement(By.name("username"));
		
//		11. Locate 'Password' using tagName
		driver.findElement(By.tagName(text()="Password");
		
//		12. Locate 'Input Box of Password' using tagName
		driver.findElement(By.name("password"));
		
//		13. Locate 'Submit Button' using tagName
		driver.findElement(By.tagName("submit"));
		
//		14. Locate 'Forgot Message' using tagName
		driver.findElement(By.tagName(a[text()="Forgot login info?"]));
		
//		15. Locate 'Logo' using tagName
		driver.findElement(By.cssSelector("img[src='images/logo.gif;JSESSIONID_8111=119839D32944CFF0972B78B54EA310D4']"));
		
//		16. Locate 'ParaSoft Demo Website' using tagName
		driver.findElement(By.tagName("h1[text()="ParaSoft Demo Website"]");
		
//		17. unable to locate Paragraph text
		
//		18. Locate 'Parabank key bookstore' using className
		driver.findElement(By.className("custom_pfx"));
		
//		19. Locate 'soatest.pfx' using link text
		driver.findElement(By.linkText("soatest.pfx");
		
//		20. Locate 'Home Icon' using advance css Selectorr
		driver.findElement(By.cssSelector("ul[class='button'] > li > a[href='index.htm']"));
		
//		21. Locate 'About Icon' using advance css Selectorr
		driver.findElement(By.cssSelector("ul[class='button'] > li > a[href='about.htm']"));
		
//		22. Locate 'Contact Icon' using advance css Selectorr
		driver.findElement(By.cssSelector("ul[class='button'] > li > a[href='contact.htm']"));
		
//		23. Locate 'Footer Home' using advance css Selectorr
		driver.findElement(By.cssSelector("div[id='footerPanel'] > ul > li > a[href='index.htm']"));
		
//		24. Locate 'Footer About Us' using advance css Selectorr
		driver.findElement(By.cssSelector("div[id='footerPanel'] > ul > li > a[href='about.htm']"));
		
//		25. Locate 'Footer Services' using advance css Selectorr
		driver.findElement(By.cssSelector("div[id='footerPanel'] > ul > li > a[href='services.htm']"));
		
//		26. Locate 'Footer Products' using advance css Selectorr
		driver.findElement(By.cssSelector("div[id='footerPanel'] > ul > li > a[href='http://www.parasoft.com/jsp/products.jsp']"));
		
//		27. Locate 'Footer Locations' using advance css Selectorr
		driver.findElement(By.cssSelector("div[id='footerPanel'] > ul > li > a[href='http://www.parasoft.com/jsp/pr/contacts.jsp']"));
		
//		28. Locate 'Footer Forum' using advance css Selectorr
		driver.findElement(By.cssSelector("div[id='footerPanel'] > ul > li > a[href='http://forums.parasoft.com/']"));
		
//		29. Locate 'Footer Site Map' using advance css Selectorr
		driver.findElement(By.cssSelector("div[id='footerPanel'] > ul > li > a[href='sitemap.htm']"));
		
//		30. Locate 'Footer Contact Us' using advance css Selectorr
		driver.findElement(By.cssSelector("div[id='footerPanel'] > ul > li > a[href='contact.htm']"));
		
//		31. Locate 'Copyright' using advance css Selectorr
		driver.findElement(By.className("[class='copyright']"));	
		
//		32. Locate 'Visit' using advance css Selectorr
		driver.findElement(By.className("[class='visit']"));	
				
		
		
		
		
	}

}
