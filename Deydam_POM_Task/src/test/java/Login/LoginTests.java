package Login;


import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import SetUp.SetUpTests;

public class LoginTests extends SetUpTests {
    //TestNG annotation
    @Test
    public void testLogin() throws InterruptedException{
        String username = "Muhammad_44";
        loginPage.enterUsername(username);
        loginPage.enterUserPassword("Ishola92#");

        DashboardPage dashboardPage = loginPage.clickLoginBtn();
        dashboardPage.clickWelcomeAdmin();
        loginPage = dashboardPage.clickLogout();
    }

}


