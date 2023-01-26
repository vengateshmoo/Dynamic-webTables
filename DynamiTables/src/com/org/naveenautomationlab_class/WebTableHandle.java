package com.org.naveenautomationlab_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTableHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]

		String beforeXpath="//*[@id=\'customers\']/tbody/tr[";
		String afterXpath="]/td[1]";

		for(int i=2; i<=7;i++) {
			String actualXpath=beforeXpath+i+afterXpath;
			WebElement element=driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			if(element.getText().equals("Ernst Handel")) {
				System.out.println("Company Name:"+element.getText()+"Is found"+"at position:"+(i-1));
				break;
			}
		}

		System.out.println("==============================================");
		//*[@id="customers"]/tbody/tr[2]/td[2]

		String afterXpathContact="]/td[2]";
		for(int i=2;i<=7;i++) {
			String actualXpath=beforeXpath+i+afterXpathContact;
			WebElement element=driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			if(element.getText().equals("Giovanni Rovelli")) {
				System.out.println("content names are:"+element.getText()+"is found"+"at the position is:"+(i-1));
				break;
			}
		}

		System.out.println("**************************************************");

		//*[@id="customers"]/tbody/tr[2]/td[3]

		String afterXpathContans="]/td[3]";
		for (int i=2;i<=7;i++) {
			String actualXpath=beforeXpath+i+afterXpathContans;
			WebElement element =driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			if(element.getText().equals("Canada")) {
				System.out.println("contains the country:"+element.getText()+"is found"+"at the positions is:"+(i-1));
				break;
			}

		}

	}

}
