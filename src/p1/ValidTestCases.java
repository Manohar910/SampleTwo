package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ValidTestCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver bo = new FirefoxDriver();
		bo.get("https://www.facebook.com/");
		bo.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("Manohar");

		bo.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys("Naguru");

		bo.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys("9885353910");

		bo.findElement(By.xpath("//input[@id='u_0_w']")).sendKeys("Virat910");

		WebElement sel1=bo.findElement(By.xpath("//select[@id='day']"));
		Select s1 = new Select(sel1);
		s1.selectByIndex(31);

		Select sel2 = new Select(bo.findElement(By.xpath("//select[@id='month']")));
		sel2.selectByIndex(7);

		Select sel3 = new Select(bo.findElement(By.xpath("//select[@id='year']")));
		sel3.selectByValue("1996");

		bo.findElement(By.xpath("//button[@id='u_0_13']")).click();

		bo.findElement(By.xpath("//a[@class='_8esh']")).click();

		bo.navigate().back();

	}

}
