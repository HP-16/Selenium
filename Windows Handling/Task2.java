//URL : https://www.snapdeal.com/ 
//
//NOTE: Search iphones 7 and click 1st phone 
//      add it to cart.
//      print the you pay cost displayed.

package org.day10;

import java.awt.AWTException;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\HARI\\New folder\\Selenium\\src\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.snapdeal.com/");
		WebElement s = wd.findElement(By.id("inputValEnter"));
		s.sendKeys("Iphone 7");
		WebElement c = wd.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		c.click();
		WebElement iphone = wd.findElement(By.xpath("//img[@title='Apple iPhone 7 3D Back Covers By Tweakymod']"));
		Thread.sleep(2000);
		Actions a = new Actions(wd);
		a.click(iphone).perform();
		Set<String> windowHandles = wd.getWindowHandles();
		List<String> l = new Vector();
		l.addAll(windowHandles);
		wd.switchTo().window(l.get(1));
		WebElement cart = wd.findElement(By.xpath("//span[text()='add to cart']"));
		cart.click();
		WebElement pay = wd.findElement(By.className("you-pay"));
		String p = pay.getText();
		System.out.println(p);
	}
}
