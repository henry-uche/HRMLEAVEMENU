package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HRMLV_myleavepage {
    //Declare your locators
    @FindBy(how = How.NAME,using = "username")
    public static WebElement UserNamesLoginField;

    @FindBy(how = How.NAME,using = "password")
    public static WebElement passwordLoginField;

    @FindBy(how =How.XPATH,using = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    public static WebElement LoginButton;

    @FindBy(how =How.XPATH,using = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a")
    public static WebElement LeaveMenuBtn;

    @FindBy(how = How.LINK_TEXT,using = "My Leave")
    public static WebElement MyLeaveBtn;

    @FindBy(how = How.XPATH,using = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[1]/h5")
    public static WebElement AssertsystemMyLeaveListPage;

    @FindBy(how = How.XPATH,using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")
    public static WebElement FromDateField;

    //@FindBy(how = How.XPATH,using = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/i")
    //public static WebElement AssertSystemCalendarMenu;

    @FindBy(how = How.XPATH,using = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/input")
    public static WebElement ToDateField;

    @FindBy(how = How.XPATH,using = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[1]/div[1]")
    public static WebElement ShowLeaveWithStatusField;

    @FindBy(how = How.XPATH,using = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div")
    public static WebElement LeaveTypeField;

    @FindBy(how = How.XPATH,using = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div")
    public static WebElement LeaveTypeFieldAgain;

    @FindBy(how = How.XPATH,using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")
    public static WebElement SearchButton;

    @FindBy(how = How.XPATH,using = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/span")
    public static WebElement AssertSystemSearchResult;

    @FindBy(how = How.XPATH,using = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[1]")
    public static WebElement ResetButton;

    @FindBy(how = How.XPATH,using = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")
    public static WebElement AssertSystemDefaultPage;


    //Declare your Methods
    public void enterloginusername() {
        UserNamesLoginField.sendKeys("Admin");
    }

    public void EnterLoginPassword() {
        passwordLoginField.sendKeys("admin123");
    }

    public void Clickloginbtn() {
        LoginButton.click();

    }

    public void clickleavemenubtn() {
        LeaveMenuBtn.click();

    }
    public void ClickMyLeaveBtn() {
        MyLeaveBtn.click();

    }

    public void AssertSystemMyLeaveListPage() {
        AssertsystemMyLeaveListPage.isDisplayed();

    }

    public void ClickFromDateField() {
        FromDateField.click();
    }

    //public void AssertCalendardropdownMenu()

    public void ClickToDatefield() {
        ToDateField.click();
    }

    public void ClickShowLeaveWithStatus() {
        ShowLeaveWithStatusField.click();
    }

    public void ClickLeaveType() {
        LeaveTypeField.click();
    }

    public void ClickLeaveTypeAgain() {
        LeaveTypeFieldAgain.click();
    }

    public void ClickSearchBtn() {
        SearchButton.click();
    }

    public void AssertSystemSearchResult() {
        AssertSystemSearchResult.isDisplayed();
    }


    public void ClickReset() {
        ResetButton.click();
    }


    public void AssertSystemDefaultPage() {
        AssertSystemDefaultPage.getText();
    }

}




