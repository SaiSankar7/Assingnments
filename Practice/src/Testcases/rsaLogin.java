package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rsaLogin {

		public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver", "C:\\Users\\SaiShankar\\Downloads\\SE");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("Sai");
		driver.findElement(By.name("inputPassword")).sendKeys("Mangipudi");
		driver.findElement(By.className("submit")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Sai");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("saishankargmail.com");
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("1234567890");
		driver.findElement(By.className("reset-pwd-btn")).click();
		driver.findElement(By.className("go-to-login-btn")).click();
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Sai");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("chkboxOne")).click();
		driver.findElement(By.className("submit")).click();
		}

}
