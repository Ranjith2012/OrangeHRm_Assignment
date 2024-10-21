package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath="//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]")
    WebElement clickArrow;

    @FindBy(xpath = "//a[text()=\"Logout\"]")
    WebElement logoutBtn;


    public void userLogout(){
        clickArrow.click();
        logoutBtn.click();
    }

}
