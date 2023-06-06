package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



//Declare your locators here
public class Leave_Pages {
    @FindBy(how =How.NAME,using = "username")
    public static WebElement UserNameLoginField;


    @FindBy(how =How.NAME,using = "password")
    public static WebElement passwordLoginField;


    @FindBy(how =How.XPATH,using = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    public static WebElement LoginButton;


    @FindBy(how =How.XPATH,using = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a")
    public static WebElement LeaveMenuBtn;


    @FindBy(how =How.LINK_TEXT,using = "Apply")
    public static WebElement ApplyLeaveBtn;


    @FindBy(how =How.XPATH,using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/h6")
    public static WebElement ApplyLeavePage;



    //Declare your Methods
    public void enterLoginUserName() {
        UserNameLoginField.sendKeys("Admin");
    }

    public void enterLoginPassword() {
        passwordLoginField.sendKeys("admin123");
    }

    public void clickloginbutton() {
        LoginButton.click();
    }

    public void clickleavemenubtn() {
       LeaveMenuBtn.click();
    }

    public void ClickApplyBtn() {
        ApplyLeaveBtn.click();
    }

    public void AssertApplyLeavePage() {
        String ExpectedApplyLeavePage = "Apply Leave";
        String ActualApplyLeavePage = ApplyLeavePage.getText();
        Assert.assertEquals(ExpectedApplyLeavePage, ActualApplyLeavePage);
        System.out.println(ActualApplyLeavePage);
    }
}


