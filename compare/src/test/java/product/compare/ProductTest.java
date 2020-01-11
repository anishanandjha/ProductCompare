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
//		//System.setProperties();
//		
//	}
	
	@Test
	public void productSearch() throws InterruptedException {
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		driver.findElement(By.xpath(ProductPO.AMZ_SEARCH_INPUT)).sendKeys("iPhone XR (64GB) - Yellow");
		Thread.sleep(3000);
		driver.findElement(By.xpath(ProductPO.AMZ_SEARCH_BUTTON)).click();
		Thread.sleep(5000);
				
	}

}
