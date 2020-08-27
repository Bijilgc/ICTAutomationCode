package Day2.DataProviders;

import org.testng.annotations.DataProvider;

public class Login_DP {

    @DataProvider(name="LoginData")
    public static Object[][] dataProviderLogin(){
        return new Object[][]{
                {"Admin","admin123"},
                {"test","admin123"}
        };
    }
}
