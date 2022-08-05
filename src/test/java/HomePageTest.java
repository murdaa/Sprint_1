import com.codeborne.selenide.Configuration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.praktikum.HomePage;

import static com.codeborne.selenide.Selenide.*;

public class HomePageTest {

    HomePage homePage;
    private final String urlHomePage = "https://qa-scooter.praktikum-services.ru/";

    @Before
    public void setUp() {
        Configuration.browser = "chrome";
        //для запуска Яндекс.браузера установила сам браузер и прописывала путь до актуального яндекс драйвера:
        //System.setProperty("webdriver.chrome.driver", "C:\\yandexdriver\\yandexdriver.exe");
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
        }

    @Test
    public void checkAnswerToQuestionOne() {
        homePage = open(urlHomePage, HomePage.class);
        String answerActual = homePage.checkFAQSection(String.valueOf(0));
        String answerExpected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        Assert.assertEquals(answerExpected, answerActual);
        System.out.println(answerActual);
    }


    @Test
    public void checkAnswerToQuestionTwo() {
        homePage = open(urlHomePage, HomePage.class);
        String answerActual = homePage.checkFAQSection(String.valueOf(1));
        String answerExpected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        Assert.assertEquals(answerExpected, answerActual);
        System.out.println(answerActual);
    }

    @Test
    public void checkAnswerToQuestionThree() {
        homePage = open(urlHomePage, HomePage.class);
        String answerActual = homePage.checkFAQSection(String.valueOf(2));
        String answerExpected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        Assert.assertEquals(answerExpected, answerActual);
        System.out.println(answerActual);
    }

    @Test
    public void checkAnswerToQuestionFour() {
        homePage = open(urlHomePage, HomePage.class);
        String answerActual = homePage.checkFAQSection(String.valueOf(3));
        String answerExpected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        Assert.assertEquals(answerExpected, answerActual);
        System.out.println(answerActual);
    }

    @Test
    public void checkAnswerToQuestionFive() {
        homePage = open(urlHomePage, HomePage.class);
        String answerActual = homePage.checkFAQSection(String.valueOf(4));
        String answerExpected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        Assert.assertEquals(answerExpected, answerActual);
        System.out.println(answerActual);
    }

    @Test
    public void checkAnswerToQuestionSix() {
        homePage = open(urlHomePage, HomePage.class);
        String answerActual = homePage.checkFAQSection(String.valueOf(5));
        String answerExpected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        Assert.assertEquals(answerExpected, answerActual);
        System.out.println(answerActual);
    }

    @Test
    public void checkAnswerToQuestionSeven() {
        homePage = open(urlHomePage, HomePage.class);
        String answerActual = homePage.checkFAQSection(String.valueOf(6));
        String answerExpected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        Assert.assertEquals(answerExpected, answerActual);
        System.out.println(answerActual);
    }

    @Test
    public void checkAnswerToQuestionEight() {
        homePage = open(urlHomePage, HomePage.class);
        String answerActual = homePage.checkFAQSection(String.valueOf(7));
        String answerExpected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        Assert.assertEquals(answerExpected, answerActual);
        System.out.println(answerActual);
    }

}
