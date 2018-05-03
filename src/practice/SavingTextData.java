package practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SavingTextData {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
        
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		WebElement var = driver.findElement(By.xpath("//input[@title='Search']"));
		var.sendKeys("selenium-java");
		String a = var.getAttribute("value");
		System.out.println(a);
		File file=new File("./data/hell.txt");
		FileWriter fr=new FileWriter(file);
		fr.write(a);
		fr.close();
		}
		}


