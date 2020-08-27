package Day2.Commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Driver {

    public static WebDriver driver=null;
    @BeforeMethod
    public static WebDriver openBrowser(){
        String browser="chrome";
        String url="https://opensource-demo.orangehrmlive.com/index.php/auth/login";
        switch (browser.toLowerCase()){
            case "chrome":
                System.setProperty("webdriver.chrome.driver","src//main//resources//chromedriver.exe");
                //disabled popup
                ChromeOptions options=new ChromeOptions();
                options.setExperimentalOption("useAutomationExtension",false);
                driver=new ChromeDriver(options);//launch browser
                break;
            case "firefox":
                driver=new FirefoxDriver();
                break;
            case "ie":
                driver=new InternetExplorerDriver();
                break;
        }
        driver.manage().window().maximize();//maximize window
        driver.navigate().to(url);//navigate to url
        return driver;
    }
    @AfterMethod
    public static void closeBrowser(){
        driver.close();
    }
}
