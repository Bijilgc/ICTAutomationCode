package Day1.Tests;

import Day1.Commons.Driver;
import Day1.PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class LoginTest {
    @Test
    public void validLogin(){
        WebDriver driver= Driver.openBrowser("chrome","https://opensource-demo.orangehrmlive.com/");
        LoginPage loginPage=new LoginPage(driver);
        loginPage.Login("admin","admin123");
        Driver.closeBrowser();
    }
}
