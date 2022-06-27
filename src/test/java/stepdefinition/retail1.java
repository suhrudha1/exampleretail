package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class retail1 {


WebDriver driver;

@Given("User is on homepage")
public void user_is_on_homepage() {
	System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
    driver = new ChromeDriver();
	driver.get("http://retailm1.upskills.in/admin ");
}

@When("user enter invalid Username {string} and password {string}")
public void user_enter_invalid_Username_and_password(String username, String password) throws InterruptedException {
	 driver.findElement(By.id("input-username")).sendKeys(username);
     Thread.sleep(2000);
	 driver.findElement(By.id("input-password")).sendKeys(password);
	 Thread.sleep(1000);
}

@When("user enter valid password")
public void user_enter_valid_password() {
	driver.findElement(By.id("password")).sendKeys("Admin@123");
	}

@Then("login button enabled")
public void login_button_enabled() throws InterruptedException {
	driver.findElement(By.tagName("button")).click();
	Thread.sleep(1000);

}



@Then("validation message appears")
public void validation_message_appears() throws InterruptedException {
	driver.findElement(By.tagName("button")).click();
	Thread.sleep(1000);

	
}


@Given("user click shop admin button")
public void user_click_shop_admin_button() throws InterruptedException {
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@id='button-menu']/i")).click();
	
	Thread.sleep(1000);
	WebElement sc=driver.findElement(By.xpath("//i[@class='fa fa-user fw']"));
	sc.click();
	Thread.sleep(1000);
	WebElement r=driver.findElement(By.xpath("//ul[@class='collapse in']/li/a[text()='Customers']"));
    r.click();
    Thread.sleep(1000);
}

@Then("user add the customers list")
public void user_add_the_customers_list() throws InterruptedException {
	driver.findElement(By.xpath("//i[@class='fa fa-plus']")).click();
	Thread.sleep(1000);
}


@When("add the customers FirstName{string} and LastName {string}")
public void add_the_customers_FirstName_and_LastName(String FirstName, String LastName) throws InterruptedException {
	 driver.findElement(By.id("input-firstname")).sendKeys(FirstName);
     Thread.sleep(1000);
	 driver.findElement(By.id("input-lastname")).sendKeys(LastName);
	 Thread.sleep(1000);   
}

@When("add the customers FirstName{string}")
public void add_the_customers_FirstName(String FirstName ) throws InterruptedException {
	 driver.findElement(By.id("input-firstname")).sendKeys(FirstName);
     Thread.sleep(1000);
}

@When("write your LastName {string}")
public void write_your_LastName(String LastName ) throws InterruptedException {
	 driver.findElement(By.id("input-lastname")).sendKeys(LastName);
	 Thread.sleep(1000);  
}

@When("write your E-Mail address{string}")
public void write_your_EMail_address(String EMail) throws InterruptedException {
	driver.findElement(By.id("input-email")).sendKeys(EMail);
    Thread.sleep(1000);
}
//
//@When("writecustomers Telephone number {string}")
//public void writecustomers_Telephone_number(String Telephone) throws InterruptedException {
//	driver.findElement(By.id("input-telephone")).sendKeys();
//    Thread.sleep(1000);
//}


@When("write customers Telephone number {string}")
public void write_customers_Telephone_number(String Telephone) throws InterruptedException {
	driver.findElement(By.id("input-telephone")).sendKeys(Telephone);
    Thread.sleep(1000);
}

@When("write your Password {string}")
public void write_your_Password(String Password) throws InterruptedException {
	driver.findElement(By.id("input-password")).sendKeys(Password);
    Thread.sleep(1000);
}
//@When("write your Password {string}")
//public void write_your_Password(String password) throws InterruptedException {
//	driver.findElement(By.id("input-password")).sendKeys();
//    Thread.sleep(1000);
//}

@When("Write your Confirm password {string}")
public void write_your_Confirm_password(String Confirm) throws InterruptedException {
	driver.findElement(By.id("input-confirm")).sendKeys(Confirm);
    Thread.sleep(1000);
}

@Then("Click the save button, It should navigate to the customer list page")
public void click_the_save_button_It_should_navigate_to_the_customer_list_page() throws InterruptedException {
	driver.findElement(By.xpath("//i[@class='fa fa-save']")).click();
	Thread.sleep(5000);
}








//@When("add the customers detail {string}")
//public void add_the_customers_detail(String username) throws InterruptedException {
//	driver.findElement(By.id("input-username")).sendKeys(minnu);
//    Thread.sleep(2000);
//}
//
//@When("write last name")
//public void write_last_name() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
//}
//
//@When("write your email address")
//public void write_your_email_address() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
//}
//
//@When("write telephone number has consist of {int} digit")
//public void write_telephone_number_has_consist_of_digit(Integer int1) {
//    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
//}
//
//@When("write your password")
//public void write_your_password() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
//}
//
//@When("Write your confirm password")
//public void write_your_confirm_password() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
//}
//
//@Then("Click the save button, It should navigate to the customer list page")
//public void click_the_save_button_It_should_navigate_to_the_customer_list_page() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
//}



@Then("user check the customers list")
public void user_check_the_customers_list() {
////	WebElement r=driver.findElement(By.linkText("Customers"));
//    r.click();
}



@Then("Click the back button ,it should navigate to the customers list page")
public void click_the_back_button_it_should_navigate_to_the_customers_list_page() throws InterruptedException {
	driver.findElement(By.xpath("//i[@class='fa fa-sign-out fa-lg']")).click();
	Thread.sleep(1000);
	
}

//
//@When("edit the customers FirstName{string}")
//public void edit_the_customers_FirstName(String FirstName ) throws InterruptedException {
//	driver.findElement(By.id("input-firstname")).sendKeys(FirstName);
//    Thread.sleep(1000); 
//}
//
//@When("edit customers LastName {string}")
//public void edit_customers_LastName(String LastName) throws InterruptedException {
//	driver.findElement(By.id("input-lastname")).sendKeys(LastName);
//    Thread.sleep(1000);
//}

}

/*@Given("User is on homepage")
public void user_is_on_homepage() {
	System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
    driver = new ChromeDriver();
	driver.get("http://retailm1.upskills.in/admin ");
  
}*/


	
////	@When("user enter invalid Username {string} and password {string}")
////	public void user_enter_invalid_Username_and_password(String username, String password) {
////		  driver.findElement(By.id("input-username")).sendKeys(username);
////		  driver.findElement(By.id("input-password")).sendKeys(password);
////		  
////	}
//	
//
//   @When("user enter valid Username {string} and password {string}")
//    public void user_enter_valid_Username_and_password(String username, String password) {
//	driver.findElement(By.id("input-username")).sendKeys(username);
//	  driver.findElement(By.id("input-password")).sendKeys(password);
//	 
//}
//   @When("User enter value in user name field")
//   public void user_enter_value_in_user_name_field() {
//       // Write code here that turns the phrase above into concrete actions
//       throw new cucumber.api.PendingException();
//   }
//
//   @When("user enter value in password field")
//   public void user_enter_value_in_password_field() {
//       // Write code here that turns the phrase above into concrete actions
//       throw new cucumber.api.PendingException();
//   }
//
//   @Then("Login button enabled")
//   public void login_button_enabled_user_click_on_submit_button() {
//	   driver.findElement(By.name("login")).click();    
//   }
//
//
// 
//   
//   @When("user click on submit button")
//	public void user_click_on_submit_button() {
//		driver.findElement(By.name("login")).click();    
//	} 
//   
//	@Then("validation message appears")
//	public void validation_message_appears() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
//
//}
//@Given("User is on homepage")
//public void user_is_on_homepage() {
//	System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
//    driver = new ChromeDriver();
//	driver.get("http://retailm1.upskills.in/admin ");
//}
