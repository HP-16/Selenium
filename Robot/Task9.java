//QUESTION 9
//------------
//URL : https://www.amazon.in/
//
//NOTE: Click login and type a  email in email textbox and select email and right click and click cut 

package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task9 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\HARI\\New folder\\Selenium\\src\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.amazon.in/");
		wd.manage().window().maximize();
		Actions a = new Actions(wd);
		WebElement findElement = wd.findElement(By.xpath("//div[@class='nav-line-1-container']"));
		a.moveToElement(findElement);
		WebElement findElement2 = wd.findElement(By.xpath("(//a[@class='nav-action-button'])[1]"));
		a.moveToElement(findElement2).click();
		WebElement findElement3 = wd.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']"));
		findElement3.sendKeys("email");
		a.doubleClick(findElement3).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}
}
