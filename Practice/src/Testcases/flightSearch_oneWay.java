package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flightSearch_oneWay {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver", "C:\\Users\\SaiShankar\\Downloads\\SE");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa']")).click();
		driver.findElement(By.xpath("//div[@class='r-1862ga2 r-1loqt21 r-1enofrn r-tceitz r-u8s1d css-76zvg2']")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-19yat4t r-1rt2jqs'] [@class='css-1dbjc4n r-19yat4t r-1rt2jqs']")).click();
		List<WebElement> Aitports = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-1srvcxg']"));
		for (WebElement airportName:Aitports) {
			
			if(airportName.getText().equalsIgnoreCase("Chennai International Airport")) {
				airportName.click();
				break;
			}
			
		}
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click();
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		Thread.sleep(3000);
		int i =1;
		for(i=1;i<2;i++) {
			driver.findElement(By.cssSelector("div[data-testid='Adult-testID-plus-one-cta']")).click();
		}
		driver.findElement(By.cssSelector("div[data-testid='Children-testID-plus-one-cta']")).click();
		driver.findElement(By.cssSelector("div[data-testid='Infant-testID-plus-one-cta']")).click();
	List<WebElement> curr =driver.findElements(By.xpath("//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e']"));
		for(WebElement currency: curr) {
			if(currency.getText().equalsIgnoreCase("Currency")) {
				currency.click();
				break;
				}
		}
	List<WebElement> c=	driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1habvwh r-1loqt21 r-1777fci r-1mi0q7o r-1yt7n81 r-m611by r-1otgn73']"));
		for(WebElement I:c) {
			
			if(I.getText().equalsIgnoreCase("INR")) {
				I.click();
				break;
			}
		}
	driver.findElement(By.cssSelector("div[data-testid='home-page-flight-cta']")).click();
	driver.close();	
	}	
}
