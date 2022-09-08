package practikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderStepOne extends OrderPage{

    public OrderStepOne(WebDriver webDriver) {
        super(webDriver);
    }


    public void inputCustomerName(String name){
       webDriver.findElement(OrderPage.firstNameCustomer).sendKeys(name);
    }

    public void inputCustomerLastName(String lastName){
        webDriver.findElement(lastNameCustomer).sendKeys(lastName);
    }

    public void inputCustomerAdress(String adress){
        webDriver.findElement(adressCustomer).sendKeys(adress);
    }

    public void selectCustomerMetroStation(String metroStation){
        // Локатор для Поля "Станция метро"
        By metroStationCustomer = By.xpath("//input[@placeholder ='* Станция метро']");
        By station = By.xpath("//div[@class='select-search__select']//*[text()='"+metroStation+"']");
        webDriver.findElement(metroStationCustomer).click();
        webDriver.findElement(station).click();
    }

    public void inputCustomerPhone(String phone){
        webDriver.findElement(phoneCustomer).sendKeys(phone);
    }

    public void clickNextButton(){
        webDriver.findElement(nextButton).click();
    }


}
