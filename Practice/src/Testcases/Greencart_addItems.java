package Testcases;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greencart_addItems {

	public static void main(String[] args) {
		System.setProperty("Webdriver", "C:\\Users\\SaiShankar\\Downloads\\SE");
		WebDriver driver = new ChromeDriver();
		String[] itemsList = { "Cucumber", "Brcolli", "Carrot", "Beans" };
		addItems(driver,itemsList );
	}

public static void addItems(WebDriver driver, String[] itemsList) {
	int i = 0;
	int j = 0;

	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	driver.manage().window().maximize();
	List<WebElement> Items = driver.findElements(By.cssSelector("h4.product-name"));

	for (i = 0; i < Items.size(); i++) {
		String[] name = Items.get(i).getText().split("-");
		String OriginalName = name[0].trim();
		List itemsNeededList = Arrays.asList(itemsList);

		
		j++;

		if (itemsNeededList.contains(OriginalName)) {

			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			
			if(j==itemsList.length) {
				
				break;
			}
		}

	}
}}
