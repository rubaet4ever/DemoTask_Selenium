package com.teton.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginTest {

	public static void createLoginTest(WebDriver driver) {
		// TODO Auto-generated method stub
		try {

			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(@href, 'https://shop.tetonelectronics.com/about-us')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(@href, 'https://shop.tetonelectronics.com/shop')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(@href, 'https://shop.tetonelectronics.com/faq')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(@href, 'https://shop.tetonelectronics.com/contact')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[contains(@href, 'https://shop.tetonelectronics.com')])[4]")).click();
			Thread.sleep(2000);


			driver.findElement(By.xpath("//img[@alt='30W Fast Charger']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span/img")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='addToCart']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[contains(@href, 'https://shop.tetonelectronics.com')])[4]")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//img[@alt='Track Extension Pack']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span/img")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='addToCart']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[contains(@href, 'https://shop.tetonelectronics.com')])[4]")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//img[@alt='65W GaN Fast Charger']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//form/div/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//form/div/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='addToCart']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[contains(@href, 'https://shop.tetonelectronics.com')])[4]")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//img[@alt='Teton Smart Scale (Wi-Fi + Bluetooth)']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//form/div/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//form/div/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[2]/img")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[2]/img")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='addToCart']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[contains(@href, 'https://shop.tetonelectronics.com')])[4]")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//img[@alt='Teton Smart Scale (Bluetooth)']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label/div/div/div")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span/img")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='addToCart']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[contains(@href, 'https://shop.tetonelectronics.com')])[4]")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//div[@id='sticky-header']/div/div/div/div[2]/nav/div[2]/div[3]/ul/li[2]/a/i")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//form/button")).click();
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//tr[5]/td[6]/a/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//tr[3]/td[6]/a/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//tr[1]/td[6]/a/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//tr[2]/td[6]/a/i")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//tr[4]/td[6]/a/i")).click();
			//Thread.sleep(2000);
			//driver.findElement(By.xpath("//div[@id='sticky-header']/div/div/div/div[2]/nav/div[2]/div[3]/ul/li[2]/a/span")).click();
			//Thread.sleep(2000);
			//driver.findElement(By.xpath("//form/button")).click();
			//Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[contains(@href, 'https://shop.tetonelectronics.com')])[4]")).click();
			Thread.sleep(2000);


		}catch(Exception e) {
			e.printStackTrace();
			driver.quit();

		}

	}
	
	


}
