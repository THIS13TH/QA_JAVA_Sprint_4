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
            mainPage.makeOrderOne();
            OrderStepOne orderStepOne = new OrderStepOne(webDriver);
            orderStepOne.inputCustomerName(name);
            orderStepOne.inputCustomerLastName(lastname);
            orderStepOne.inputCustomerAdress(adress);
            orderStepOne.selectCustomerMetroStation(metroaStation);
            orderStepOne.inputCustomerPhone(phone);
            orderStepOne.clickNextButton();

            OrderStepTwo orderStepTwo = new OrderStepTwo(webDriver);
            orderStepTwo.inputDateOrder(duration);
            orderStepTwo.inputOrderDuration(orderDuration);
            orderStepTwo.inputColorOrederGrey();
            orderStepTwo.inputComment(comment);
            orderStepTwo.clickOrderButton();
            orderStepTwo.clickConfirmOrder();
            assertTrue(orderStepTwo.OrderConfirm().contains("Заказ оформлен"));
        }


        @Test
        @UseDataProvider("getCredentials")
        public void checkRentTwoOrder(String name, String lastname, String adress, String metroaStation, String phone, String duration, String orderDuration, String comment, boolean result) {
            mainPage.open();
            mainPage.makeOrderTwo();
            OrderStepOne orderStepOne = new OrderStepOne(webDriver);
            orderStepOne.inputCustomerName(name);
            orderStepOne.inputCustomerLastName(lastname);
            orderStepOne.inputCustomerAdress(adress);
            orderStepOne.selectCustomerMetroStation(metroaStation);
            orderStepOne.inputCustomerPhone(phone);
            orderStepOne.clickNextButton();

            OrderStepTwo orderStepTwo = new OrderStepTwo(webDriver);
            orderStepTwo.inputDateOrder(duration);
            orderStepTwo.inputOrderDuration(orderDuration);
            orderStepTwo.inputColorOrederBlack();
            orderStepTwo.inputComment(comment);
            orderStepTwo.clickOrderButton();
            orderStepTwo.clickConfirmOrder();
            assertTrue(orderStepTwo.OrderConfirm().contains("Заказ оформлен"));
        }
    }

