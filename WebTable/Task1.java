//QUESTION 1
//----------
//URL : http://demo.guru99.com/test/write-xpath-table.html
//
//NOTE: Print all the content in the dynamic webtable.

package org.day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\HARI\\New folder\\Selenium\\src\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("http://demo.guru99.com/test/write-xpath-table.html");
		List<WebElement> findElements = wd.findElements(By.tagName("table"));
		WebElement table = findElements.get(0);
		List<WebElement> tr = table.findElements(By.tagName("tr"));
		for(int i=0;i<tr.size();i++) {
			WebElement row = tr.get(i);
			List<WebElement> data = row.findElements(By.tagName("td"));
			for(int j=0;j<data.size();j++) {
				WebElement printdata = data.get(j);
				String text = printdata.getText();
				System.out.println(text);
			}
			
		}
	}
}
