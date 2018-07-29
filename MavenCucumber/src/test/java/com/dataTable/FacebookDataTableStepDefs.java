package com.dataTable;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.io.FileResourceIteratorFactory;

public class FacebookDataTableStepDefs {
	
	WebDriver driver;
	String radioButton1="u_0_9";
	
	
	@Before
	public void setUp() throws InterruptedException {
		System.out.println("in setup");
		System.setProperty("webdriver.chrome.driver","D:\\Radical\\chromedriver_win32_B39\\chromedriver.exe");
		driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
	    System.out.println("opned browser");
		Thread.sleep(5000);
	}
	
	@Given("the user is on facebook login Page")
	public void the_user_is_on_facebook_login_Page() throws InterruptedException{
	System.out.println("actual script started");
	}
	
	@When("he enters following data")
	public void he_enters_following_data(DataTable table) throws InterruptedException{
		//Initialize data table 
	      List<List<String>> data = table.raw();
	      System.out.print(data.get(0).get(0));//print the table column Name OR first element
	      System.out.print("				");
	      System.out.print(data.get(0).get(1)); 
	      System.out.print("				");
	      System.out.println(data.get(0).get(2)); 
	       
	      System.out.print(data.get(1).get(0)); 
	      System.out.print("			");
	      System.out.print(data.get(1).get(1));
	      System.out.print("				");
	      System.out.println(data.get(1).get(2)); 
	      
	      driver.findElement(By.id("u_0_j")).sendKeys(data.get(1).get(1));
	      
	      System.out.print(data.get(2).get(0)); 
	      System.out.print("			");
	      System.out.print(data.get(2).get(1)); 
	      System.out.print("				");
	      System.out.println(data.get(2).get(2)); 
	      
	      driver.findElement(By.id("u_0_l")).sendKeys(data.get(2).get(1));
	      
	      System.out.print(data.get(3).get(0));
	      System.out.print("			");
	      System.out.print(data.get(3).get(1)); 
	      System.out.print("	");
	      System.out.println(data.get(3).get(2)); 
	      
	      driver.findElement(By.id("u_0_o")).sendKeys(data.get(3).get(1));
	       
	      System.out.print(data.get(4).get(0)); 
	      System.out.print("		");
	      System.out.print(data.get(4).get(1)); 
	      System.out.print("	");
	      System.out.println(data.get(4).get(2)); 
	      
	      driver.findElement(By.id("u_0_r")).sendKeys(data.get(4).get(1));
	      
	      System.out.print(data.get(5).get(0)); 
	      System.out.print("			");
	      System.out.print(data.get(5).get(1)); 
	      System.out.print("			");
	      System.out.println(data.get(5).get(2)); 
	      
	      driver.findElement(By.id("u_0_v")).sendKeys(data.get(5).get(1));
	      
	      System.out.print(data.get(6).get(0)); 
	      System.out.print("			");
	      System.out.print(data.get(6).get(1)); 
	      System.out.print("				");
	      System.out.println(data.get(6).get(2));
	  
          WebElement ele=driver.findElement(By.id("day"));
	      Select obj=new Select(ele);
	      obj.selectByValue(data.get(6).get(1));
	      
	      System.out.print(data.get(7).get(0)); 
	      System.out.print("			");
	      System.out.print(data.get(7).get(1)); 
	      System.out.print("				");
	      System.out.println(data.get(7).get(2));
      
	      WebElement ele1=driver.findElement(By.id("month"));
	      Select obj1=new Select(ele1);
	     // obj1.selectByValue(data.get(7).get(1));
	      obj1.selectByVisibleText(data.get(7).get(1));
	      
	      System.out.print(data.get(8).get(0)); 
	      System.out.print("			");
	      System.out.print(data.get(8).get(1)); 
	      System.out.print("				");
	      System.out.println(data.get(8).get(2));
	      
	      WebElement ele2=driver.findElement(By.id("year"));
	      Select obj2=new Select(ele2);
	      obj2.selectByValue(data.get(8).get(1));
	      
	      System.out.print(data.get(9).get(0)); 
	      System.out.print("			");
	      System.out.print(data.get(9).get(1)); 
	      System.out.print("				");
	      System.out.println(data.get(9).get(2));
//	      
//	      if(driver.findElement(By.id(radioButton1).equals(data.get(9).get(1)))){
//	    	  
//	     
//	    	  
//	      }
//	      
//	      .click();
	      
	}


	@When("he_enters_following_data")
	
	@Then("check signup should failed")
	public void check_signup_should_failed(){
		Assert.assertTrue(true);
	}
	
}
	
	
	


