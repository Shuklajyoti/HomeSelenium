package practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateTextFileAndSaveText {
	static File file;

	    public static void main(String[] args)
	    {
	        System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
	        
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.google.com");
			WebElement var = driver.findElement(By.xpath("//input[@title='Search']"));
			var.sendKeys("selenium-java");
			String a = var.getAttribute("value");
			System.out.println(a);
			CreateNewFile("SearchResult.txt");
	
			try {
				FileWriter	fr = new FileWriter(file);
				fr.write(a);
				fr.close();
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	    }	

	//Create a new file
	    public static void CreateNewFile(String filename) {
	        //get current project path
	        String filePath = "D://Automation//HomeSelenium//data";
	        //create a new file
	      file =   new File(filePath + "\\" + filename);

	        try {
	            if (!file.exists()) {
	                file.createNewFile();
	                System.out.println("File is created");
	                
	    			}
	             else {
	                System.out.println("File already exist");
	            }
	        }
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    }	
	
	
	


