package Step_Definition;

import Base.Testbase;
import Pages.Leave_Pages;
import com.gargoylesoftware.htmlunit.Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Leave_Apply extends Testbase {



    @When("^I click on Leave Menu$")
    public void iClickOnLeaveMenu() throws InterruptedException {
        Leave_Pages pages = PageFactory.initElements(driver, Leave_Pages.class);
        pages.clickleavemenubtn();
        Thread.sleep(2000);
    }

    @And("^I click the Apply feature$")
    public void iClickTheApplyFeature() throws InterruptedException {
        Leave_Pages pages = PageFactory.initElements(driver, Leave_Pages.class);
        pages.ClickApplyBtn();
        Thread.sleep(2000);
    }

    @Then("^I should see the Apply Leave page$")
    public void iShouldSeeTheApplyLeavePage() {
        Leave_Pages pages = PageFactory.initElements(driver, Leave_Pages.class);
        pages.AssertApplyLeavePage();


    }
}
