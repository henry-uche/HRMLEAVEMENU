package Step_Definition;

import Base.Testbase;
import Pages.Leave_Pages;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class commonsteps1 extends Testbase {

    @Before
    public void setup()throws IOException{
        initialize();
    }

    @Given("^I am on the HRM application$")
    public void iAmOnTheHRMApplication() {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();
    }

    @And("^I login$")
    public void iLogin() throws InterruptedException {
        Leave_Pages pages = PageFactory.initElements(driver, Leave_Pages.class);
        pages.enterLoginUserName();
        pages.enterLoginPassword();
        pages.clickloginbutton();
        Thread.sleep(3000);
    }
}
