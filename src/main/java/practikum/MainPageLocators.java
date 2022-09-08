package practikum;

import org.openqa.selenium.By;

public final class MainPageLocators {
    //Тескст
    public static final By questionsImportant = By.xpath("//div[text() = 'Вопросы о важном']");
    //Кнопка "Заказть" которая находится вверху
    public static final By firstOrderButton = By.xpath("//button[text() = 'Заказать']");
    //Кнопка "Закать" которая находится внизу страницы
    public static final By secondOrderButton = By.xpath("//button[1][text() = 'Заказать']");


    //Первая кнопка из списка вопросов
   public static final By firstDropDownButtons  =
            By.xpath("//div[text() = 'Сколько это стоит? И как оплатить?']");
    //Вторая кнопка из списка вопросов
   public static final By secondDropDownButtons =
            By.xpath("//div[text() = 'Хочу сразу несколько самокатов! Так можно?']");
    //Третья кнопка из списка вопросов
   public static final By thirdDropDownButtons =
            By.xpath("//div[text() = 'Как рассчитывается время аренды?']");
    //Четвертая кнопка из списка вопросов
   public static final By fourthtDropDownButtons =
            By.xpath("//div[text() = 'Можно ли заказать самокат прямо на сегодня?']");
    //Пятая  кнопка из списка вопросов
   public static final By fifthtDropDownButtons =
            By.xpath("//div[text() = 'Можно ли продлить заказ или вернуть самокат раньше?']");
    //Шестая кнопка из списка впросов
   public static final By sixthDropDownButtons =
            By.xpath("//div[text() = 'Вы привозите зарядку вместе с самокатом?']");
    //Седьмая кнопка из списка вопросов
   public static final By seventhDropDownButtons =
            By.xpath("//div[text() = 'Можно ли отменить заказ?']");
    //Восьмая кнопка
   public static final By The8thDropDownButtons =
            By.xpath("//div[text() = 'Я жизу за МКАДом, привезёте?']");

}
