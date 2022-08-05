package ru.yandex.praktikum;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class HomePage {

    //локатор кнопки согласия на сбор куки ("да все привыкли")
    private SelenideElement cookieButton = $(byClassName("App_CookieButton__3cvqF"));
    //локатор лого яндекса (ссылка, ведущая на яндекс страницу)
    private SelenideElement logoYandex = $(byClassName("Header_LogoYandex__3TSOI"));
    //локатор лого самокат
    private SelenideElement logoScooter = $(byClassName("Header_LogoScooter__3lsAR"));
    //локатор текста в хэдере
    private SelenideElement headerText = $(byClassName("Header_Disclaimer__3VEni"));
    //локатор кнопки "Заказать" в хэдере
    private SelenideElement orderButton = $(byClassName("Button_Button__ra12g"));
    //локатор кнопки "Заказать" в середине страницы
    private SelenideElement orderMiddleButton = $(byCssSelector(".Button_Button__ra12g.Button_Middle__1CSJM"));
    //локатор кнопки "Статус"
    private SelenideElement statusOrderButton = $(byClassName("Header_Link__1TAG7"));

    //header, subheader and table
    //локатор для заголовка "Самокат на пару дней"
    private SelenideElement mainText = $(byClassName("Home_Header__iJKdX"));
    //локатор для подзаголовка "Привезем к вашей двери..."
    private SelenideElement subheaderText1 = $(byXpath(".//div[@class='Home_Header__iJKdX']/div[1]"));
    //локатор для второго подзаголовка "Он легкий..."
    private SelenideElement subheaderText2 = $(byXpath(".//div[@class='Home_Header__iJKdX']/div[2]"));
    //локатор для таблицы с характеристиками
    private SelenideElement tableFeatures = $(byClassName("Home_Table__2kPxP"));
    //локатор для первой колонки таблицы
    private SelenideElement tableFirstColumn = $(byXpath(".//div[1]/div[@class='Home_Column__xlKDK']"));
    //локатор для первой строки таблицы
    private SelenideElement tableFirstRaw = $(byClassName("Home_Row__jdQW2.Home_FirstRow__1pAl9"));
    //локатор для второй строки таблицы
    private SelenideElement tableSecondRaw = $(byXpath(".//div[@class='Home_Table__2kPxP']/div[4]"));
    //локатор для третьей строки таблицы
    private SelenideElement tableThirdRaw = $(byXpath(".//div[@class='Home_Table__2kPxP']/div[5]"));

    //Road map section
    //локатор для строки "Как это работает"
    private SelenideElement howItWorksRaw = $(byXpath(".//div[@class='Home_ThirdPart__LSTEE']/div[1]"));
    //локатор для блупринта самоката
    private SelenideElement blueprintScooter = $(byClassName("Home_BluePrint__TGX2n"));
    //локатор для изображения самоката
    private SelenideElement imageScooter = $(byClassName("Home_Scooter__3YdJy"));
    //локатор для иконки пункт 1
    private SelenideElement iconPointOne = $(byXpath(".//div[1]/div[@class='Home_StatusCircle__3_aTp']"));
    //локатор для иконки пункт 2
    private SelenideElement iconPointTwo = $(byXpath(".//div[2]/div[@class='Home_StatusCircle__3_aTp']"));
    //локатор для иконки пункт 3
    private SelenideElement iconPointThree = $(byXpath(".//div[3]/div[@class='Home_StatusCircle__3_aTp']"));
    //локатор для иконки пункт 4
    private SelenideElement iconPointFour = $(byCssSelector(".Home_Lineless__2-Rxp.Home_StatusCircle__3_aTp"));

    //локатор для пункта 1
    private SelenideElement textPointOne = $(byCssSelector("div.Home_RoadMap__2tal_>div:nth-child(1)>div.Home_StatusInfo__HrjoZ"));
    //локатор для пункта 2
    private SelenideElement textPointTwo = $(byCssSelector("div.Home_RoadMap__2tal_>div:nth-child(2)>div.Home_StatusInfo__HrjoZ"));
    //локатор для пункта 3
    private SelenideElement textPointThree = $(byCssSelector("div.Home_RoadMap__2tal_>div:nth-child(3)>div.Home_StatusInfo__HrjoZ"));
    //локатор для пункта 4
    private SelenideElement textPointFour = $(byCssSelector("div.Home_RoadMap__2tal_>div:nth-child(4)>div.Home_StatusInfo__HrjoZ"));

    //FAQ section
    private SelenideElement faqSubheader = $(byXpath(".//div[@class='Home_FourPart__1uthg']/div[@class='Home_SubHeader__zwi_E']")); //локатор для строки "Вопросы о важном"
    private SelenideElement questionOne = $(byId("accordion__heading-0")); //вопрос 1
    private SelenideElement answerOne = $(byId("accordion__panel-0")); //ответ 1
    private SelenideElement questionTwo = $(byId("accordion__heading-1")); //вопрос 2
    private SelenideElement answerTwo = $(byId("accordion__panel-1")); //ответ 2
    private SelenideElement questionThree = $(byId("accordion__heading-2")); //вопрос 3
    private SelenideElement answerThree = $(byId("accordion__panel-2")); //ответ 3
    private SelenideElement questionFour = $(byId("accordion__heading-3")); //вопрос 4
    private SelenideElement answerFour = $(byId("accordion__panel-3")); //ответ 4
    private SelenideElement questionFive = $(byId("accordion__heading-4")); //вопрос 5
    private SelenideElement answerFive = $(byId("accordion__panel-4")); //ответ 5
    private SelenideElement questionSix = $(byId("accordion__heading-5")); //вопрос 6
    private SelenideElement answerSix = $(byId("accordion__panel-5")); //ответ 6
    private SelenideElement questionSeven = $(byId("accordion__heading-6")); //вопрос 7
    private SelenideElement answerSeven = $(byId("accordion__panel-6")); //ответ 7
    private SelenideElement questionEight = $(byId("accordion__heading-7")); //вопрос 8
    private SelenideElement answerEight = $(byId("accordion__panel-7")); //ответ 8

    //метод для клика кнопку куки
    public void clickCookiesButton() {
        if (cookieButton.isDisplayed()) cookieButton.scrollTo().click();
    }

    //метод для клика на кнопку "Заказать"
    public OrderPage clickOrderButton() {
        orderButton.click();
        OrderPage orderPage = page(OrderPage.class);
        return orderPage;
    }

    //метод для проверки секции FAQ (клик на вопрос и получение текста ответа)
    public String checkFAQSection(String index) {
        clickCookiesButton();
        $(byId(String.format("accordion__heading-%s", index))).scrollTo().click();
        return $(byId(String.format("accordion__panel-%s", index))).getText();

    }

}