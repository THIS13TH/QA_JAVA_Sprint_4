package practikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public  class OrderPage extends BasePage {
    protected OrderPage(WebDriver webDriver) {
        super(webDriver);
    }

    // Локатор для Поля "Имя"
    protected static final By firstNameCustomer = By.xpath("//input[@placeholder ='* Имя']");

    // Локатор для Поля "Фамилия"
    protected static final By lastNameCustomer = By.xpath("//input[@placeholder ='* Фамилия']");

    // Локатор для Поле "Адрес"
    protected static final By adressCustomer = By.xpath("//input[@placeholder ='* Адрес: куда привезти заказ']");

    // Локатор для Поля "Телефон"
    protected static final By phoneCustomer = By.xpath("//input[@placeholder ='* Телефон: на него позвонит курьер']");

    // Локатор для Кнопка далее
    protected static final By nextButton = By.xpath("//button[text()= 'Далее']");



    //    Локатор поля даты
    protected static final By dateOrder = By.xpath("//*[contains(@placeholder, '* Когда привезти самокат')]");

    //   Локатор предыдущего месяца
    protected static final By previosMonth = By.xpath("//div[contains(@class, 'react-datepicker')]//button[contains(text(), 'Previous Month')]");

    //   Локатор следующего месяца
    protected static final By nextMonth = By.xpath("//div[contains(@class, 'react-datepicker')]//button[contains(text(), 'Next Month')]");

    //    Локатор срока аренды
    protected static final By periodDuration = By.xpath("//*[@class='Dropdown-placeholder']");

    //Локатор выбора черного цвета
    protected static final By blackColor = By.id("black");

    //Локатор выбора Серого цвета
    protected static final By greyColor = By.id("grey");

    //Локатор для комментарий для курьера
    protected static final By commentOrder = By.xpath("//input[@placeholder ='Комментарий для курьера']");

    //Локатор кнопки "Заказть"
    protected static final By orderButton = By.xpath("//div[contains(@class, 'Order_Buttons')]//button[contains(text(), 'Заказать')]");

    //Локатор кнопки "Да"
    protected static final By confirmButton = By.xpath("//div[contains(@class, 'Order_Buttons')]//button[contains(text(),'Да')]");

    //Локатор подтвержденного заказа
    protected static final By listOrder = By.xpath("//div[contains(@class, 'Order_ModalHeader')]");


}
