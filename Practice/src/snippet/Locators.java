package snippet;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\SaiShankar\\Downloads\\SE");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.screener.in/register/?next=/dash/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@class='button account']")).click();
		driver.findElement(By.id("id_username")).sendKeys("saishankar039@gmail.com");
		driver.findElement(By.id("id_password")).sendKeys("Legacy@2024");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(driver.findElement(By.className("account")).getText());
		
		}

}
