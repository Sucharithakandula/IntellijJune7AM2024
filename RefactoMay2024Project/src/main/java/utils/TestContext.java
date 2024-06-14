package utils;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TestContext {
    // whenever we need to share knowledge from one class to various classes in cucumber
    // BDD we have a one file called TestContext.It is a heart of project

    public WebDriverManager webDriverManager;
    public PageObjectManager pageObjectManager;

    public TestContext() throws IOException {
         webDriverManager =new WebDriverManager();
         pageObjectManager = new PageObjectManager(webDriverManager.getDriverDetails());
    }


}
