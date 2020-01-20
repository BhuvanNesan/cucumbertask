package com.stepdefinition;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomer {
	static WebDriver driver;
	@Given("user launches telecom homepage")
	public void user_launches_telecom_homepage() {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Welcome\\Desktop\\cucumber\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://demo.guru99.com/telecom/index.html");
	   
	}

	@Given("user click on add customer button")
	public void use_click_on_add_customer_button() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();	    
	}

	@When("user enters all the field")
	public void user_enters_all_the_field() {
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.name("fname")).sendKeys("bhuvan");
		driver.findElement(By.name("lname")).sendKeys("nesan");
		driver.findElement(By.name("emailid")).sendKeys("bhuvan@gmail.com");
		driver.findElement(By.id("message")).sendKeys("bollinihills");
		driver.findElement(By.name("telephoneno")).sendKeys("124578963");
	    
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		driver.findElement(By.name("submit")).click();
	   
	}

	@Then("user should displayed customer id")
	public void user_should_displayed_customer_id() {
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	    
	}



}
