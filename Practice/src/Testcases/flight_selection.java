package Testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flight_selection {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver", "C:\\Users\\SaiShankar\\Downloads\\SE");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.spicejet.com/search?from=AMD&to=MAA&tripType=1&departure=2024-05-10&adult=1&child=0&srCitizen=0&infant=0&currency=INR&redirectTo=/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-1sgu7fw r-1ljd8xs r-1phboty r-1777fci r-e9bn0q'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@data-testid='continue-search-page-cta']")).click();
		driver.findElement(By.xpath("//div[@data-testid='title-contact-detail-card']")).click();
		List<WebElement> T =driver.findElements(By.xpath("//div[@class='css-76zvg2 r-homxoj r-poiln3 r-ubezar']"));
		for(WebElement Title:T) {
			if(Title.getText().equalsIgnoreCase("Miss"));
			Title.click();
			break;
			}
		driver.findElement(By.xpath("//input[@data-testid='first-inputbox-contact-details']")).sendKeys("Mangipudi");
		driver.findElement(By.xpath("//input[@data-testid='last-inputbox-contact-details']")).sendKeys("Sai Sindhuja");
		driver.findElement(By.cssSelector("input[data-testid='contact-number-input-box']")).sendKeys("9494195672");
		driver.findElement(By.cssSelector("input[data-testid='emailAddress-inputbox-contact-details']")).sendKeys("saisindhuja@gmail.com");
		driver.findElement(By.cssSelector("input[data-testid='city-inputbox-contact-details']")).sendKeys("Neelangaram");
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-qsz3a2 r-poiln3 r-1b43r93 r-16dba41']) [1]")).click();
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-qsz3a2 r-poiln3 r-1b43r93 r-16dba41']) [2]")).click();
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-qsz3a2 r-poiln3 r-1b43r93 r-16dba41']) [5]")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[data-testid='traveller-0-first-traveller-info-input-box']")).sendKeys("Mangipudi");
		driver.findElement(By.cssSelector("input[data-testid='traveller-0-last-traveller-info-input-box']")).sendKeys("Sai Sindhuja");
		driver.findElement(By.cssSelector("input[data-testid='sc-member-mobile-number-input-box']")).sendKeys("9494195672");
		System.out.println(driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep r-1mdbw0j r-oyd9sg']")));
		driver.findElement(By.xpath("//div[@data-testid='traveller-info-continue-cta']")).click();	
		
	
	
	}
	
}


