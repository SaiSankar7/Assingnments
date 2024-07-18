package Testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver", "C:\\Users\\SaiShankar\\Downloads\\SE");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
////		List<WebElement> T=	driver.findElements(By.xpath("//a[@href='http://demo.guru99.com/']"));
////		for(WebElement Company:T) {
////			if((Company.getText().equalsIgnoreCase("Shriram Trans.Fi")));
////			Company.click();
//			
		        
	        //No.of Columns Group A
	        List <WebElement> col = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	        System.out.println("No of cols are : " +col.size()); 
	        //No.of rows 
	        List <WebElement> rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
	        System.out.println("No of rows are : " + rows.size());
	        driver.close();
	       // Get specific row value and column value 
//	        WebElement  TableList = 
//	        	System.out.println(driver.findElement(By.xpath("//th[normalize-space()='Company']")));
//	        WebElement tablerow =  TableList.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
//	        String rowtext = tablerow.getText();
//			 System.out.println("Third row of table : "+rowtext);
	    }

	
			
	}



