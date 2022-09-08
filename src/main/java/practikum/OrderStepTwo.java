package practikum;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OrderStepTwo extends OrderPage{

    public OrderStepTwo(WebDriver webDriver) {
        super(webDriver);
    }

    public void inputDateOrder(String dateTime){
        webDriver.findElement(dateOrder).click();
        webDriver.findElement(dateOrder).sendKeys(dateTime);
        webDriver.findElement(dateOrder).sendKeys(Keys.ENTER);
    }

    public void choosePreviosMonth(){
        webDriver.findElement(previosMonth).click();
    }

    public void chooseNextMonth(){
        webDriver.findElement(nextMonth).click();
    }

    public void inputOrderDuration(String Duration){
        webDriver.findElement(periodDuration).click();
        webDriver.findElement(By.xpath("//*[text()='"+Duration+"']")).click();
    }

    public void inputColorOrederBlack() {
        webDriver.findElement(blackColor).click();
    }

    public void inputColorOrederGrey() {
        webDriver.findElement(greyColor).click();
    }

    public void inputComment(String comment){
        webDriver.findElement(commentOrder).sendKeys(comment);
    }

    public void clickOrderButton(){
        webDriver.findElement(orderButton).click();
    }

    public void clickConfirmOrder(){
        webDriver.findElement(confirmButton).click();
    }

    public String OrderConfirm(){
        return webDriver.findElement(listOrder).getText();
    }
}
