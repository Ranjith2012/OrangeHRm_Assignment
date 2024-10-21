package com.automation.Pages;

import com.automation.Utils.ConfigManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//button[text()=' Login ']")
    WebElement loginBtn;

    @FindBy(xpath = "//input[@name=\"username\"]")
    WebElement user;

    @FindBy(xpath = "//input[@type=\"password\"]")
    WebElement pass;

    public void openWeb(){
        driver.get(ConfigManager.getConfigPro("app.url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

    public boolean VefLoginPage(){
        return loginBtn.isDisplayed();
    }

    public void loginUser(String username, String password){
        user.sendKeys(username);
        pass.sendKeys(password);
        loginBtn.click();
    }
}
