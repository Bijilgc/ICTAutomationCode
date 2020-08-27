package Day2.PageObject;

import org.openqa.selenium.WebElement;

public class PageObjectBase {

    public void click(WebElement element){
        element.click();
    }
    public void write(WebElement element,String text){
        element.sendKeys(text);
    }
}
