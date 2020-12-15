package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    //In the page class, we need the fields that represents the elements on the page and methods to interact with the elements
    private WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }
    //Using By as a locator for elements
    private By username = By.xpath("//*[@id=\"txtUsername\"]");

    public void enterUsername(String uName)
    {
        //find the username element and enter the username
        driver.findElement(username).sendKeys(uName);
    }
    public void enterUserPassword(String pwd)
    {
        WebElement passwordField = driver.findElement(By.id("txtPassword"));
        passwordField.sendKeys(pwd);
    }
    public DashboardPage clickLoginBtn()
    {
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
        return new DashboardPage (driver);

    }

}
