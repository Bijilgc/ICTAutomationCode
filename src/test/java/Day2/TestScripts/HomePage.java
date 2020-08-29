package Day2.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.reflect.Array;
import java.util.List;

public class HomePage {
    @FindBy(xpath = "//a[text()='Welcome Linda']")
    private WebElement txt_WelcomeMsg;
    public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public boolean isWelcomeMessagePresent()
    {
        try {
            return txt_WelcomeMsg.isDisplayed();
        }
        catch(Exception e)
        {
            return false;
        }
    }
}
