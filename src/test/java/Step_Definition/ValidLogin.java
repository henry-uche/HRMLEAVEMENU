package Step_Definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLogin {
    public WebDriver driver;
    @Given("^I am on the landing page$")
    public void i_am_on_the_landing_page() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);

    }

    @When("^I enter a valid username in the username field$")
    public void i_enter_a_valid_username_in_the_username_field() throws Throwable {
        driver.findElement(By.name("username")).sendKeys("Admin");

    }

    @When("^I enter a valid password in the password field$")
    public void i_enter_a_valid_password_in_the_password_field() throws Throwable {
        driver.findElement(By.name("password")).sendKeys("admin123");

    }

    @When("^I click on the login button$")
    public void i_click_on_the_login_button() throws Throwable {
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        Thread.sleep(2000);

    }

    @Then("^I should be successfully logged in$")
    public void i_should_be_successfully_logged_in() throws Throwable {
        String ExpectedLoggedInUser = "Paul Collings";
        String ActualLoggedInUser = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).getText();
        Assert.assertEquals(ExpectedLoggedInUser, ActualLoggedInUser);
        System.out.println(ActualLoggedInUser);

    }
}
