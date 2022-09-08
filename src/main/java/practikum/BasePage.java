package practikum;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
   public final WebDriver webDriver;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
        

}
