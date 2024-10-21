package com.automation.Pages;

import com.automation.Utils.RandomNameGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class AdminPage extends BasePage {

    @FindBy(xpath = "//li/a//span[text()='Admin']")
    WebElement AdminBtn;

    @FindBy(xpath = "//button[text()=' Add ']")
    WebElement AddBtn;

    @FindBy(xpath = "//div/label[text()='User Role']/../..//div/i")
    WebElement userRoleArrow;

    @FindBy(xpath = "//div[contains(@role,'listbox')]//div/span[text()='ESS']")
    WebElement EssRole;

    @FindBy(xpath = "//input[contains(@placeholder,\"Type for hints...\")]")
    WebElement employeeNameselect;

    @FindBy(xpath = "//div[contains(@role,'listbox')]//div/span")
    List<WebElement> clickJamesButlerName;


    @FindBy(xpath = "//label[contains(text(),'Status')]/../..//div/i")
    WebElement StatusSelectArrow;

    @FindBy(xpath = "//div/span[contains(text(),'Enabled')]")
    WebElement clickEnabled;

    @FindBy(xpath = "//label[text()=\"Username\"]/../..//div/input")
    WebElement username;

    @FindBy(xpath = "//div/label[text()='Password']/../..//input[contains(@type,'password')]")
    WebElement password;

    @FindBy(xpath = "//label[text()='Confirm Password']/../..//div/input")
    WebElement confirmPassword;

    @FindBy(xpath = "//button[contains(@type,'submit')]")
    WebElement saveBtn;

    @FindBy(xpath = "//p[text()='Successfully Saved']")
    WebElement successMsg;

    @FindBy(xpath = "//label[text()='Username']/../..//div/input")
    WebElement usenameBar;

    @FindBy(xpath = "//label[text()='User Role']/../..//div/i")
    WebElement RoleOptionArrow;

    @FindBy(xpath = "//div[contains(@role,'listbox')]//div/span[text()='ESS']")
    WebElement RoleEssSelect;

    @FindBy(xpath = "//input[contains(@placeholder,\"Type for hints...\")]")
    WebElement searchEmplyName;

    @FindBy(xpath = "//div[contains(@role,\"listbox\")]/div/span")
    List<WebElement> emplyNamesBox;

    @FindBy(xpath = "//label[text()='Status']/../..//div/i")
    WebElement statusArrow;

    @FindBy(xpath = "//div[contains(@role,'listbox')]//div/span[text()='Enabled']")
    WebElement statusEnabled;

    @FindBy(xpath = "//button[text()=' Search ']")
    WebElement searchBtn;

    @FindBy(xpath = "//div[@class=\"orangehrm-horizontal-padding orangehrm-vertical-padding\"]/span")
    WebElement VefSearchItemDisplay;

    @FindBy(xpath = "//i[@class=\"oxd-icon bi-trash\"]/..")
    WebElement deleteBtn;

    @FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin\"]")
    WebElement confirmYesToDelete;

    @FindBy(xpath = "//p[text()='Successfully Deleted']")
    WebElement deleteMsg;

    public void goToAdminPage(){
        AdminBtn.click();
    }

    public boolean VefUserInaAdminPage(){
        return AddBtn.isDisplayed();
    }

    public void AddBtnClick(){
        AddBtn.click();
    }

    public void setUserRole(){
        userRoleArrow.click();
        EssRole.click();
    }
    String Empname;
    public void selectEmployeeName(){
        employeeNameselect.sendKeys("g");
        Empname = clickJamesButlerName.getFirst().getText();
        clickJamesButlerName.getFirst().click();
    }

    public void setStatus(){
        StatusSelectArrow.click();
        clickEnabled.click();
    }
    String name;
    public void UsernameRandomly(){
        name = RandomNameGenerator.generateNameRandomly(5);
        username.sendKeys(name);

    }

    public void passwordAndConfirmRandomly(){
        String pass  = RandomNameGenerator.generateNameRandomly(8);
        password.sendKeys(pass+"6");
        confirmPassword.sendKeys(pass+"6");
    }

    public void setSaveBtn(){
        saveBtn.click();
    }

    public boolean VefSuccessMsg(){
        return successMsg.isDisplayed();
    }


    public void searchUsernameBar() throws InterruptedException {
        //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("oxd-form-loader")));
        Thread.sleep(10000);
        usenameBar.sendKeys(name);
    }


    public void searchRole(){
        RoleOptionArrow.click();
        RoleEssSelect.click();
        searchEmplyName.sendKeys(Empname);
        for(WebElement w : emplyNamesBox){
            String n = w.getText();
            if(n.equals(Empname)){
                w.click();
            }
        }
        statusArrow.click();
        statusEnabled.click();
        searchBtn.click();

    }

    public boolean VerifyUserDetailDisplayed(){
        String user = VefSearchItemDisplay.getText();
        return user.equals("(1) Record Found");
    }

    public void clickDeleteBtn(){
        deleteBtn.click();
        confirmYesToDelete.click();
    }

    public boolean vefDeleteMsgDisplayed() {
        return deleteMsg.isDisplayed();
    }


}
