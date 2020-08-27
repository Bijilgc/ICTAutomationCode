package Day2.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(id="txtUsername")
    private WebElement txt_userName;
    @FindBy(name="txtPassword")
    private WebElement txt_pwd;
    @FindBy(id="btnLogin")
    private WebElement btn_login;

    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public void enterUserNameAndPassword(String userName,String pwd)
    {
        txt_userName.sendKeys(userName);
        txt_pwd.sendKeys(pwd);
        btn_login.click();
    }
}
