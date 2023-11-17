package stepDefintions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;
public class multipleUsers {

	WebDriver driver;

	@Given("the user is on the Saucedemo login page")
	public void the_user_is_on_the_saucedemo_login_page() {
		// Write code here that turns the phrase above into concrete actions

		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Desktop//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

	}

	@When("the user enters {string} and {string}")
	public void the_user_enters_and(String username, String password) {
		WebElement usernameInput = driver.findElement(By.id("user-name"));
		WebElement passwordInput = driver.findElement(By.id("password"));

		usernameInput.sendKeys(username);
		passwordInput.sendKeys(password);
	}

	@When("clicks on the Login button")
	public void clicks_on_the_login_button() {
	    WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
	}

	@Then("the user should be {string}")
	public void the_user_should_be(String loginStatus) {
		 if (loginStatus.equals("successful")) {
	            // Assuming successful login redirects to a page with the header "Products"
	            WebElement productsHeader = driver.findElement(By.cssSelector(".product_label"));
	            assertEquals("Products", productsHeader.getText());
	        } else {
	            // Assuming unsuccessful login shows an error message
	            WebElement errorElement = driver.findElement(By.cssSelector("[data-test='error']"));
	            assertEquals("Epic sadface: Username and password do not match any user in this service",
	                    errorElement.getText());
	        }

	        // Close the browser after each scenario
	        driver.quit();
	}

}
