package com.automation.Steps;

import com.automation.Utils.ConfigManager;
import com.automation.Utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void SetUp(){
        DriverManager.createDriver();
        ConfigManager.initProperties();
        //RandomNameGenerator.generateNameRandomly(5);
    }

    @After
    public void down(){
        DriverManager.getDriver().quit();
    }
}
