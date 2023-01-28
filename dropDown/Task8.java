//QUESTION 8
//------------
//URL : http://adactinhotelapp.com/
//
//NOTE: Book room and print order no.


package org.day9;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
	public static void main(String[] args) throws AWTException, InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\HARI\\New folder\\Selenium\\src\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		Robot r = new Robot();
		wd.get("http://adactinhotelapp.com/");
		WebElement username = wd.findElement(By.id("username"));
		username.sendKeys("hariprasath123456789");
		WebElement pass = wd.findElement(By.id("password"));
		pass.sendKeys("hariprasath");
		WebElement login = wd.findElement(By.id("login"));
		login.click();
		WebElement location = wd.findElement(By.id("location"));
		location.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		location.click();
		WebElement hotels = wd.findElement(By.id("hotels"));
		hotels.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		hotels.click();
		WebElement r_type = wd.findElement(By.id("room_type"));
		r_type.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r_type.click();
		WebElement r_nos = wd.findElement(By.id("room_nos"));
		r_nos.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r_nos.click();
		WebElement a_room = wd.findElement(By.id("adult_room"));
		a_room.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		a_room.click();
		WebElement c_room = wd.findElement(By.id("child_room"));
		a_room.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		a_room.click();
		WebElement submit = wd.findElement(By.id("Submit"));
		submit.click();
		Thread.sleep(3000);
		WebElement rbtn = wd.findElement(By.id("radiobutton_0"));
		rbtn.click();
		WebElement cont = wd.findElement(By.id("continue"));
		cont.click();
		Thread.sleep(3000);
		WebElement fname = wd.findElement(By.id("first_name"));
		fname.sendKeys("ABCD");
		WebElement lname = wd.findElement(By.id("last_name"));
		lname.sendKeys("EFGH");
		WebElement add = wd.findElement(By.id("address"));
		add.sendKeys("Medavakkam");
		WebElement c_num = wd.findElement(By.id("cc_num"));
		c_num.sendKeys("12345678910111213");
		WebElement c_type = wd.findElement(By.id("cc_type"));
		c_type.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		c_type.click();
		WebElement cmonth = wd.findElement(By.id("cc_exp_month"));
		cmonth.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		cmonth.click();
		WebElement cyear = wd.findElement(By.id("cc_exp_year"));
		cyear.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		cyear.click();
		WebElement cvv = wd.findElement(By.id("cc_cvv"));
		cvv.sendKeys("123");
		WebElement booknow = wd.findElement(By.id("book_now"));
		booknow.click();
		Thread.sleep(8000);
		WebElement id = wd.findElement(By.name("order_no"));
		System.out.println("ORDER ID: "+id.getAttribute("value"));
	}
}
