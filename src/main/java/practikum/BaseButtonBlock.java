package practikum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseButtonBlock {
    private final WebDriver webDriver;
    private final int index;

    public BaseButtonBlock(int index, WebDriver webDriver) {
        this.index = index;
        this.webDriver = webDriver;

    }
    //клик по Кнопке с вопросом
    public void clickButton(){
        scrollToMe();
        webDriver.findElements(By.cssSelector("div[role=button]")).get(index).click();
    }
    //получить ответ
    public String getAnswer(){
        return webDriver.findElements(By.cssSelector("div[role=region]")).get(index).getText();
    }
    //метод скрола до элемента
    private void scrollToMe() {
        WebElement element = webDriver.findElements(By.cssSelector("div[role=button]")).get(index);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
    }


}
