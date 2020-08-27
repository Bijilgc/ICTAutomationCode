package Day1Class;

import org.testng.annotations.*;

public class TestNG{
    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("beforeSuite");
    }
    @AfterSuite
    public void afterSuite()
    {
        System.out.println("afterSuite");
    }
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("beforeTest");
    }
    @AfterTest
    public void afterTest()
    {
        System.out.println("AfterTest");
    }
    @BeforeClass
    public void beforeClass()
    {
        System.out.println("BeforeClass");
    }
    @AfterClass
    public void afterClass()
    {
        System.out.println("AfterClass");
    }
    @BeforeMethod(groups = "Regression")
    public void beforeMethod()
    {
        System.out.println("BeforeMethod");
    }
    @AfterMethod(groups = "Regression")
    public void afterMethod()
    {
        System.out.println("AfterMethod");
    }
    @Test(groups = {"smoke"})
    public static void loginTest()
    {
        System.out.println("Login to the system");
    }
    @Test(groups = {"Regression"})
    public static void signupTest()
    {
        System.out.println("Signup");
    }
}
