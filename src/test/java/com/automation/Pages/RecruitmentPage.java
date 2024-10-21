package com.automation.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RecruitmentPage extends BasePage {
    AdminPage add = new AdminPage();

    @FindBy(xpath = "//li/a//span[text()='Recruitment']")
    WebElement recruireBtn;

    @FindBy(xpath = "//input[contains(@name,'firstName')]")
    WebElement firstname;

    @FindBy(xpath = "//input[contains(@name,'middleName')]")
    WebElement middlename;

    @FindBy(xpath = "//input[contains(@name,'lastName')]")
    WebElement lastname;

    @FindBy(xpath = "//div[contains(text(),'-- Select --')]/..//div/i")
    WebElement vacancyArrow;

    @FindBy(xpath = "//div[contains(@role,'listbox')]//div/span[text()='Junior Account Assistant']")
    WebElement vacancyName;

    @FindBy(xpath = "//label[contains(text(),'Email')]/../../div/input")
    WebElement Email;

    @FindBy(xpath = "//input[@type='file']")
    WebElement Browse;



    public void clickRecruirement(){
        recruireBtn.click();
    }
    String fname = "pravenn";
    String lname ="m";

    public void filluserDetails(){
        firstname.sendKeys(fname);
        lastname.sendKeys(lname);
        vacancyArrow.click();
        vacancyName.click();
        Email.sendKeys("pravenn@example.com");
        System.out.println(System.getProperty("user.dir"));
        Browse.sendKeys(System.getProperty("user.dir")+"\\src\\test\\resources\\Data\\msme.docx");
    }

    public void searchByname(){
        recruireBtn.click();
        add.searchEmplyName.sendKeys(fname);
        add.emplyNamesBox.getFirst().click();
        add.searchBtn.click();
    }

    public void VefNewlyCreatedUser(){
        add.VerifyUserDetailDisplayed();
    }
}
