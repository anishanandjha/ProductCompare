package product.compare;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProductTest extends ProductPO{
	
	
	WebDriver driver = new ChromeDriver();
//	@BeforeClass
//	public void setup() {
//		//System.setProperties(WebDriver.Chrome.driver("chromedriver"));
//		
//	}
	
	@Test (priority=1)
	public void productSearchAmazon() throws InterruptedException {
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		driver.findElement(By.xpath(ProductPO.AMZ_SEARCH_INPUT)).sendKeys("iPhone XR (64GB) - Yellow");
		Thread.sleep(3000);
		driver.findElement(By.xpath(ProductPO.AMZ_SEARCH_BUTTON)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(ProductPO.AMZ_SELECT_PRODUCT)).click();
		Thread.sleep(5000);
		String price1 = driver.findElement(By.xpath(ProductPO.AMZ_PRODUCT_PRICE)).getText();
				
		Thread.sleep(10000);
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath(ProductPO.FLK_SEARCH_INPUT)).sendKeys("iPhone XR (64GB) - Yellow");
		Thread.sleep(3000);
		driver.findElement(By.xpath(ProductPO.FLK_SEARCH_BUTTON)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(ProductPO.FLK_SELECT_PRODUCT)).click();
		Thread.sleep(5000);
		String price2 = driver.findElement(By.xpath(ProductPO.FLK_PRODUCT_PRICE)).getText();
		
		//if((int)price1> (int)price2) {
			
		//}
				
	}

}
