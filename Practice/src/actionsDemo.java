import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.driver","C:\\Users\\SaiShankar\\Downloads\\SE");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().sendKeys("Officebags").build().perform();
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("officebags").build().perform();
		driver.close();
		
		

	}

}
