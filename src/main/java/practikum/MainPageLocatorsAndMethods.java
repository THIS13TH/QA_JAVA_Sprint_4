package practikum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public final class MainPageLocatorsAndMethods {
    private final WebDriver webDriver;
    private final int index;

    public MainPageLocatorsAndMethods(WebDriver webDriver, int index) {
        this.webDriver = webDriver;
        this.index = index;
    }

    //Тескст
    private By questionsImportant = By.xpath("//div[text() = 'Вопросы о важном']");
    //Кнопка "Заказть" которая находится вверху
    private By firstOrderButton = By.xpath("//button[text() = 'Заказать']");
    //Кнопка "Закать" которая находится внизу страницы
    private By secondOrderButton = By.xpath("//button[1][text() = 'Заказать']");


    //Первая кнопка из списка вопросов
    private By firstDropDownButtons =
            By.xpath("//div[text() = 'Сколько это стоит? И как оплатить?']");
    //Вторая кнопка из списка вопросов
    private By secondDropDownButtons =
            By.xpath("//div[text() = 'Хочу сразу несколько самокатов! Так можно?']");
    //Третья кнопка из списка вопросов
    private By thirdDropDownButtons =
            By.xpath("//div[text() = 'Как рассчитывается время аренды?']");
    //Четвертая кнопка из списка вопросов
    private By fourthtDropDownButtons =
            By.xpath("//div[text() = 'Можно ли заказать самокат прямо на сегодня?']");
    //Пятая  кнопка из списка вопросов
    private By fifthtDropDownButtons =
            By.xpath("//div[text() = 'Можно ли продлить заказ или вернуть самокат раньше?']");
    //Шестая кнопка из списка впросов
    private By sixthDropDownButtons =
            By.xpath("//div[text() = 'Вы привозите зарядку вместе с самокатом?']");
    //Седьмая кнопка из списка вопросов
    private By seventhDropDownButtons =
            By.xpath("//div[text() = 'Можно ли отменить заказ?']");
    //Восьмая кнопка
    private By The8thDropDownButtons =
            By.xpath("//div[text() = 'Я жизу за МКАДом, привезёте?']");


    public void makeOrderOne() {
        webDriver.findElement(firstOrderButton).click();
    }

    public void makeOrderTwo() {
        webDriver.findElement(secondOrderButton).click();
    }


    public void clickButton() {
        scrollToMe();
        webDriver.findElements(By.cssSelector("div[role=button]")).get(index).click();
    }

    //получить ответ
    public String getAnswer() {
        return webDriver.findElements(By.cssSelector("div[role=region]")).get(index).getText();
    }

    //метод скрола до элемента
    public void scrollToMe() {
        WebElement element = webDriver.findElements(By.cssSelector("div[role=button]")).get(index);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
    }

}
