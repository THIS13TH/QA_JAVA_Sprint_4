package practikum;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

@RunWith(DataProviderRunner.class)
public class OrderingScooter extends BaseUITest {
    MainPage mainPage = new MainPage(webDriver);
    OrderPage orderPage = new OrderPage(webDriver);
    MainPageLocatorsAndMethods mainPageLocatorsAndMethods = new MainPageLocatorsAndMethods(webDriver,0);

    @DataProvider
    public static Object[][] getCredentials() {
        return new Object[][]{
                {"Борис", "Фамилия", "г.Москва, Ленина 3, кв 121", "Сокольники", "88005553535", "03.09.2020", "трое суток", "хороша погода", true},
                {"Кирилл", "Борисов", "г.Калуга, Маркса 5, кв 223", "Лубянка", "88003333535", "21.06.2021", "четверо суток", "плохая погода", true},
                {"Саша", "Александров", "г.Киров, Осминина 7, кв 213", "Университет", "83380033535", "22.04.2022", "семеро суток", "плохая погода", true},
        };
    }

        @Test
        @UseDataProvider("getCredentials")
        public void checkRentOneOrder(String name, String lastname, String adress, String metroaStation, String phone, String duration, String orderDuration, String comment, boolean result){

            mainPage.open();
            mainPageLocatorsAndMethods.makeOrderOne();
            orderPage.inputCustomerName(name);
            orderPage.inputCustomerLastName(lastname);
            orderPage.inputCustomerAdress(adress);
            orderPage.selectCustomerMetroStation(metroaStation);
            orderPage.inputCustomerPhone(phone);
            orderPage.clickNextButton();

            orderPage.inputDateOrder(duration);
            orderPage.inputOrderDuration(orderDuration);
            orderPage.inputColorOrederGrey();
            orderPage.inputComment(comment);
            orderPage.clickOrderButton();
            orderPage.clickConfirmOrder();
            assertTrue(orderPage.OrderConfirm().contains("Заказ оформлен"));
        }


        @Test
        @UseDataProvider("getCredentials")
        public void checkRentTwoOrder(String name, String lastname, String adress, String metroaStation, String phone, String duration, String orderDuration, String comment, boolean result) {
            mainPage.open();
            mainPageLocatorsAndMethods.makeOrderTwo();
            orderPage.inputCustomerName(name);
            orderPage.inputCustomerLastName(lastname);
            orderPage.inputCustomerAdress(adress);
            orderPage.selectCustomerMetroStation(metroaStation);
            orderPage.inputCustomerPhone(phone);
            orderPage.clickNextButton();
            
            orderPage.inputDateOrder(duration);
            orderPage.inputOrderDuration(orderDuration);
            orderPage.inputColorOrederBlack();
            orderPage.inputComment(comment);
            orderPage.clickOrderButton();
            orderPage.clickConfirmOrder();
            assertTrue(orderPage.OrderConfirm().contains("Заказ оформлен"));
        }
    }

