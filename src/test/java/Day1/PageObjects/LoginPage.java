package Day1.PageObjects;

import Day1.Commons.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends Driver {
    @FindBy(id = "txtUsername")
    private WebElement txtUserName;
    @FindBy(name = "txtPassword")
    private WebElement txtPassword;
    @FindBy(id = "btnLogin")
    private WebElement btnLogin;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    // private By txtUserName=By.id("txtUsername"); //identified by id and storing in txtusername using By
    //private By txtPassword=By.name("txtPassword");
    //private By btnLogin=By.id("btnLogin");

    public void Login(String userName,String password)  {

        txtUserName.sendKeys(userName);//locating element by using By reference and sending data
        txtPassword.sendKeys(password);
        WebDriverWait wait=new WebDriverWait(driver,10);
        btnLogin.click();
    }
}
