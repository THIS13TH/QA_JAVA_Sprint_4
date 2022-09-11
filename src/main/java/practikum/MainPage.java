package practikum;

import org.openqa.selenium.WebDriver;


public class MainPage extends BasePage{

    public void open(){
        webDriver.get(urlDestination);
    }

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }




}
