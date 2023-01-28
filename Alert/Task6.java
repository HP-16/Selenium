//QUESTION 6
//----------
//URL : https://retail.onlinesbi.com/retail/login.htm
//
//NOTE: Click Continue To Login and click Login without enter the user id.

package org.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\HARI\\New folder\\Selenium\\src\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://retail.onlinesbi.com/retail/login.htm");
		WebElement findElement = wd.findElement(By.xpath("(//a[@class='login_button'])[1]"));
		findElement.click();
		WebElement findElement2 = wd.findElement(By.xpath("(//input[@class='btn btn-default'])[1]"));
		findElement2.click();
		Alert a = wd.switchTo().alert();
		a.accept();
	}
}
