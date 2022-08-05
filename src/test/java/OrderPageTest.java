import com.codeborne.selenide.Configuration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.praktikum.HomePage;
import ru.yandex.praktikum.OrderPage;

import static com.codeborne.selenide.Selenide.*;

public class OrderPageTest {

    HomePage homePage;
    private final String urlHomePage = "https://qa-scooter.praktikum-services.ru/";

    @Before
    public void setUp() {

        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
    }

    @Test
    public void checkOrderPageFirstTest() {
        homePage = open(urlHomePage, HomePage.class);
        homePage.clickCookiesButton();
        homePage.clickOrderButton();
        OrderPage orderPage = new OrderPage();
        orderPage.fillFirstOrderPage("Ольга", "Иванова", "Ул. Ленина, 21-27", "89165552323");
        orderPage.fillSecondOrderPage("20.05.2022", "Нет");
        orderPage.clickYesButtonOrderForm();
        String TextPopUpActual = orderPage.getPopUpText();
        Assert.assertEquals("Заказ оформлен", TextPopUpActual);
    }

    @Test
    public void checkOrderPageSecondTest() {
        homePage = open(urlHomePage, HomePage.class);
        homePage.clickCookiesButton();
        homePage.clickOrderButton();
        OrderPage orderPage = new OrderPage();
        orderPage.fillFirstOrderPage("Василий", "Либерман", "улица Строителей, 12, кв. 71", "+37611242452");
        orderPage.fillSecondOrderPage("01.07.2022", "Пожалуйста, не звоните в домофон");
        orderPage.clickYesButtonOrderForm();
        String TextPopUpActual = orderPage.getPopUpText();
        Assert.assertEquals("Заказ оформлен", TextPopUpActual);
    }
}
