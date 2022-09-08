package practikum;

import org.openqa.selenium.WebDriver;

import static practikum.MainPageLocators.firstOrderButton;
import static practikum.MainPageLocators.secondOrderButton;

public class MainPage extends BasePage{

    public void open(){
        webDriver.get("https://qa-scooter.praktikum-services.ru/");
    }

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void makeOrderOne(){
        webDriver.findElement(firstOrderButton).click();
    }

    public void makeOrderTwo(){
        webDriver.findElement(secondOrderButton).click();
    }


}
