package Login;

import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import setup.SetUpTests;

public class LoginTests extends SetUpTests {
    //TestNg annotation
    @Test
    public void testLogin() throws InterruptedException
    {
     String username = "Admin";
     loginPage.enterUsername(username);
     loginPage.enterUserPassword("admin123");

     //Handler for DashboardPage
        DashboardPage dashboardPage = loginPage.clickLoginBtn();
        dashboardPage.clickWelcomeAdmin();
        loginPage = dashboardPage.clickLogout();

    }

}
