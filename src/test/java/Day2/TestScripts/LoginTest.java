package Day2.TestScripts;

import Day2.Commons.Driver;
import Day2.DataProviders.Login_DP;
import Day2.PageObject.HomePage;
import Day2.PageObject.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends Driver {

    @Test(dataProvider = "LoginData",dataProviderClass = Login_DP.class)
    public void validateLogin(String username,String pwd)
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.enterUserNameAndPassword(username,pwd);
        HomePage homePage=new HomePage(driver);
        boolean loginFlag=homePage.isWelcomeMessagePresent();
        if(loginFlag==true){
            System.out.println("Sucessfull");
        }
        else if(loginFlag==false){
            System.out.println("Fail");
        }
    }

}
