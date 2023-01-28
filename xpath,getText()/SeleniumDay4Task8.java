//QUESTION  8
//------------
//URL : http://adactinhotelapp.com/
//
//NOTE: Print the UserName and Password that you are entered.

package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay4Task8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\HARI\\New folder\\Selenium\\src\\drivers\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("http://adactinhotelapp.com/");
		WebElement login = wd.findElement(By.xpath("//input[@id='username']"));
		login.sendKeys("GreensTechnology");
		String text = login.getText();
		System.out.println(wd.findElement(By.id("username")).getText());
		WebElement pass = wd.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("GreensTech");
		String text2 = pass.getText();
		System.out.println(text2);
	}
}
