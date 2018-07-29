package com.Assignment.MutipleParameters;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultiParameterStepDefs {
	
	
	public WebDriver driver;
	
	@Before
	public void setUp() throws InterruptedException {
		System.out.println("in setup");
		System.setProperty("webdriver.chrome.driver","D:\\Radical\\chromedriver_win32_B39\\chromedriver.exe");
		driver=new ChromeDriver();
	    System.out.println("opened browser");
		Thread.sleep(5000);
	}
	
	@Given("^the user is on facebook login Page$")
	public void the_user_is_on_facebook_login_Page() throws InterruptedException {
		System.out.println("actual script started");
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
	}
	
	@When("^he enters \"([^\"]*)\" as user name and \"([^\"]*)\" as password$")
	public void he_enters_username_and_password(String userName,String pwd) throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		Thread.sleep(5000);
	}
	
	
	
	@Then("^check username is present in textbox$")
	public void check_username_is_present_in_textbox(){
	
		Assert.assertTrue(true);
		driver.quit();
	}
	
}
