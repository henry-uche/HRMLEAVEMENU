package Step_Definition;

import Base.Testbase;
import Pages.HRMLV_myleavepage;
import Pages.Leave_Pages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class HRMLV_myleave extends Testbase {



    @When("^I click on the Leave Menu$")
    public void iClickOnTheLeaveMenu() throws InterruptedException {
        Leave_Pages pages = PageFactory.initElements(driver, Leave_Pages.class);
        pages.clickleavemenubtn();
        Thread.sleep(3000);

    }

    @And("^I click on MY-LEAVE button$")
    public void iClickOnMYLEAVEButton() throws InterruptedException {
        HRMLV_myleavepage page = PageFactory.initElements(driver, HRMLV_myleavepage.class);
        page.ClickMyLeaveBtn();
        Thread.sleep(3000);

    }

    @Then("^I should see the required my-leave-list page$")
    public void iShouldSeeTheRequiredMyLeaveListPage() {
        HRMLV_myleavepage page = PageFactory.initElements(driver, HRMLV_myleavepage.class);
        page.AssertSystemMyLeaveListPage();

    }

    @When("^I click on the from-date field$")
    public void iClickOnTheFromDateField() {
        HRMLV_myleavepage page = PageFactory.initElements(driver, HRMLV_myleavepage.class);
       page.ClickFromDateField();
    }

    //@Then("^I should see a calendar drop_down menu$")
    //public void iShouldSeeACalendarDrop_downMenu() {
       // HRMLV_myleave  pages = PageFactory.initElements(driver, HRMLV_myleave.class);
       // pages.iShouldSeeACalendarDrop_downMenu();
  //  }



    @When("^I repeat the above steps on To-date field$")
    public void iRepeatTheAboveStepsOnToDateField() {
        HRMLV_myleavepage page = PageFactory.initElements(driver, HRMLV_myleavepage.class);
        page.ClickToDatefield();

    }

   // @Then("^I should see the expected results$")
    //public void iShouldSeeTheExpectedResults() {
     //  HRMLV_myleave  pages = PageFactory.initElements(driver, HRMLV_myleave.class);
     //   pages.iShouldSeeTheExpectedResults();
    //}

    @When("^I click on the Show Leave with Status drop-down Arrow$")
    public void iClickOnTheShowLeaveWithStatusDropDownArrow() {
        HRMLV_myleavepage page = PageFactory.initElements(driver, HRMLV_myleavepage.class);
        page.ClickShowLeaveWithStatus();

    }

    @And("^I click on the Leave-Type drop-down Arrow$")
    public void iClickOnTheLeaveTypeDropDownArrow() {
        HRMLV_myleavepage page = PageFactory.initElements(driver, HRMLV_myleavepage.class);
        page.ClickLeaveType();

    }

    @And("^I click on the Leave-Type drop-down Arrow again$")
    public void iClickOnTheLeaveTypeDropDownArrowAgain() {
        HRMLV_myleavepage page = PageFactory.initElements(driver, HRMLV_myleavepage.class);
        page.ClickLeaveTypeAgain();
    }

    //@Then("^I should see the required options$")
   //public void iShouldSeeTheRequiredOptions() {


    //}

    @When("^I click on the SEARCH button$")
    public void iClickOnTheSEARCHButton() throws InterruptedException {
        HRMLV_myleavepage page = PageFactory.initElements(driver, HRMLV_myleavepage.class);
        page.ClickSearchBtn();
        Thread.sleep(3000);
    }

    @Then("^I should see a search results below search page$")
    public void iShouldSeeASearchResultsBelowSearchPage() {
        HRMLV_myleavepage page = PageFactory.initElements(driver, HRMLV_myleavepage.class);
        page.AssertSystemSearchResult();
    }

    @When("^I click on RESET button$")
    public void iClickOnRESETButton() throws InterruptedException {
        HRMLV_myleavepage page = PageFactory.initElements(driver, HRMLV_myleavepage.class);
        page.ClickReset();
        Thread.sleep(3000);
    }

    @Then("^it should reset search page to default$")
    public void itShouldResetSearchPageToDefault() {
        HRMLV_myleavepage page = PageFactory.initElements(driver, HRMLV_myleavepage.class);
        page.AssertSystemDefaultPage();
    }


}
