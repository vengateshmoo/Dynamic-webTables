package com.org.naveenautomationlab_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTablesHandle {

	public static void main(String[] args) throws InterruptedException {

		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[2]/td[2]

		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch browser
		driver.manage().window().maximize();//maximize windows
		driver.manage().deleteAllCookies();//delete all cookies


		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://ui.freecrm.com/");//launch browser

		driver.findElement(By.name("email")).sendKeys("ervengatesh1@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Moorthi@1001");

		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();


		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[3]/a")).click();

		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[1]/td[2]/a
		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[2]/td[2]/a
		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[3]/td[2]/a
		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[4]/td[2]/a



		//method:1 String
		String  beforeXpath="//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr[";
		String afterXpath="]/td[2]/a";

		for (int i=1;i<=4;i++) { String
			name=driver.findElement(By.xpath(beforeXpath+i+afterXpath)).getText();
		System.out.println(name); if (name.contains("mohan s")) { Thread.sleep(2000);

		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[2]/td[1]
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr["+i+"]/td[1]")).
		click();


		} }

		//Method:2
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Ranjith k')]//parent::td//preceding-sibling::td")).click();
		driver.findElement(By.xpath("//a[contains(text(),'naveen v')]//parent::td//preceding-sibling::td")).click();
		driver.findElement(By.xpath("//a[contains(text(),'prakash ag')]//parent::td//preceding-sibling::td")).click();




	}

}
