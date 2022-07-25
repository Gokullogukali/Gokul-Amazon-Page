
package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Set up the Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gokul L\\eclipse-workspace\\Gokul Amazon Page\\driver\\chromedriver.exe");
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//go to the url
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement btnSign = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		btnSign.click();
		
		WebElement textPhone = driver.findElement(By.xpath("//input[@id='ap_email']"));
		textPhone.sendKeys("9360085565");
		
		WebElement btnContinue = driver.findElement(By.xpath("//input[@id='continue']"));
		btnContinue.click();
		
		WebElement textPassword = driver.findElement(By.xpath("//input[@id='ap_password']"));
		textPassword.sendKeys("kali@9033");
		
		WebElement btnSubmit = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		btnSubmit.click();
		
		Thread.sleep(5000);
		
		WebElement textNew = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		textNew.sendKeys("iphone");
		
		Thread.sleep(5000);
		
		WebElement btnSearch = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		btnSearch.click();
		
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		
		WebElement textResults = driver.findElement(By.xpath("//span[text()='RESULTS']"));
		jk.executeScript("arguments[0].scrollIntoView('true')", textResults);
		
		Thread.sleep(5000);
		
		WebElement textImg = driver.findElement(By.xpath("//img[@data-image-index='1']"));
		textImg.click(); 
		
		
	}

}
