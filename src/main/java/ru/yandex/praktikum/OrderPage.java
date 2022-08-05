package ru.yandex.praktikum;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class OrderPage {

    //локатор поля "Имя"
    private SelenideElement fieldName = $(byXpath(".//div[@class='Order_Form__17u6u']/div[1]/input"));
    //локатор поля "Фамилия"
    private SelenideElement fieldSurname = $(byXpath(".//div[@class='Order_Form__17u6u']/div[2]/input"));
    //локатор поля "Адрес"
    private SelenideElement fieldAdrress = $(byXpath(".//div[@class='Order_Form__17u6u']/div[3]/input"));
    //локатор поля "Метро"
    private SelenideElement fieldMetro = $(byCssSelector(".select-search__input"));
    //локатор поля "Телефон"
    private SelenideElement fieldPhoneNumber = $(byXpath(".//div[@class='Order_Form__17u6u']/div[5]/input"));
    //локатор кнопки "Далее"
    private SelenideElement buttonNext = $(byXpath(".//button[text()='Далее']"));

    //локатор поля "Когда привезти самокат"
    private SelenideElement fieldDate = $(byXpath(".//div[@class='react-datepicker__input-container']/input"));
    //локатор поля "Срок аренды"
    private SelenideElement fieldRentalPeriod = $(byXpath(".//div[@class='Dropdown-placeholder']"));
    //локатор поля "Цвет самоката"
    private SelenideElement fieldColorScooter = $(byCssSelector(".Order_Checkboxes__3lWSI"));
    //локатор чекбокса "черный жемчуг"
    private SelenideElement blackColorScooter = $(byCssSelector("input#black"));
    //локатор поля "Комментарий для курьера"
    private SelenideElement fieldComment = $(byXpath("//input[contains(@placeholder, 'Комментарий для курьера')]"));
    //локатор кнопки "Заказать" после формы оформления заказа
    private SelenideElement buttonFinalOrder = $(byCssSelector(".Button_Middle__1CSJM:nth-of-type(2)"));
    //локатор кнопки "Да" на поп-апе
    private SelenideElement buttonYes = $(byXpath(".//button[text()='Да']"));
    //локатор для текстового элемента на поп-апе
    private SelenideElement textPopUp = $(".Order_ModalHeader__3FDaJ");

    //метод для клика кнопки "Далее"
    public void clickNextButton() {
        buttonNext.scrollTo().click();
    }

    //метод для клика кнопки "Заказать" для финального оформления заказа
    public void clickFinalOrderButton() {
        buttonFinalOrder.click();
    }

    //метод для ввода имени в поле "Имя"
    public void setNameForOrderForm(String name) {
        fieldName.setValue(name);
    }

    //метод для ввода фамилии в поле "Фамилия"
    public void setSurnameForOrderForm(String surname) {
        fieldSurname.setValue(surname);
    }

    //метод для ввода адреса в поле "Адрес"
    public void setAdressForOrderForm(String address) {
        fieldAdrress.setValue(address);
    }

    //метод для выбора станции метро в поле "Метро"
    public void setMetroForOrderForm() {
        fieldMetro.click();
        $("button[value='1']>.Order_Text__2broi").shouldBe(visible);
        $("button[value='1']>.Order_Text__2broi").click();
    }

    //метод для ввода телефона в поле "Телефон"
    public void setPhoneNumberForOrderForm(String phoneNumber) {
        fieldPhoneNumber.setValue(phoneNumber);
    }

    //метод для заполнения первой части формы заказа
    public OrderPage fillFirstOrderPage(String name, String surname, String address, String phoneNumber) {
        setNameForOrderForm(name);
        setSurnameForOrderForm(surname);
        setAdressForOrderForm(address);
        setMetroForOrderForm();
        setPhoneNumberForOrderForm(phoneNumber);
        clickNextButton();
        OrderPage orderPage = page(OrderPage.class);
        return orderPage;
    }

    //метод для ввода имени в поле "Когда привезти самокат"
    public void setDateForOrderForm(String date) {
        fieldDate.setValue(date).pressEnter();
    }

    //метод для выбора срока аренды
    public void setRentalPeriodForOrderForm() {
        fieldRentalPeriod.scrollTo().click();
        $(byXpath(".//div[@class = 'Dropdown-option']")).click();
    }

    //метод для выбора черного самоката
    public void setBlackColorScooter() {
        blackColorScooter.click();
    }

    //метод для ввода комментария в поле "Комментарий для курьера"
    public void setCommentForOrderForm(String comment) {
        fieldComment.setValue(comment);
    }

    //метод для клика на "Да" на поп-апе
    public void clickYesButtonOrderForm() {
        buttonYes.click();
    }

    //метод для заполнения второй части формы заказа
    public void fillSecondOrderPage(String date, String comment) {
        setDateForOrderForm(date);
        setRentalPeriodForOrderForm();
        setBlackColorScooter();
        setCommentForOrderForm(comment);
        clickFinalOrderButton();
    }

    //метод для получения текста на поп-апе
    public String getPopUpText() {
        return textPopUp.getText().trim();
    }

}

