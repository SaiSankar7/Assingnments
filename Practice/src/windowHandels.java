import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandels {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\SaiShankar\\Downloads\\SE");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		Set<String> Windows= driver.getWindowHandles();
		Iterator<String> IT = Windows.iterator();
		String ParentID = IT.next();
		String CaildID = IT.next();
		
		driver.switchTo().window(CaildID);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String emailID = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(ParentID);
		driver.findElement(By.id("username")).sendKeys(emailID);
		driver.quit();
	
	}

}
