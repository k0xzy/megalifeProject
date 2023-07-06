package pages.a_mentalka;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Footer {
    Actions actions = new Actions(getWebDriver());
    JavascriptExecutor js = (JavascriptExecutor) getWebDriver();


    private final SelenideElement footerButtonMainLogo = $x("//a[@class=\"tn-atom t-bgimg loaded\"]");
    private final SelenideElement footerButtonAboutUsHistory = $x("//a[@class=\"tn-atom\" and text()=\"История центра\"]");
    private final SelenideElement footerButtonAboutUsTeachers = $x("//a[@class=\"tn-atom\" and text()=\"Преподаватели\"]");
    private final SelenideElement footerButtonAboutUsBlog = $x("//a[@class=\"tn-atom\" and text()=\"Блог\"]");
    private final SelenideElement footerButtonAboutUsPhoto = $x("//a[@class=\"tn-atom\" and text()=\"Галерея\"]");
    private final SelenideElement footerButtonAboutUs = $x("//a[@class=\"tn-atom\" and text()=\"Отзывы о нас\"]");
    private final SelenideElement footerButtonVacancies = $x("//a[@class=\"tn-atom\" and text()=\"Вакансии\"]");
    private final SelenideElement footerButtonInf = $x("//a[@class=\"tn-atom\" and text()=\"Правовая информация\"]");
    private final SelenideElement footerLK = $x("//a[@class=\"tn-atom\" and text()=\"Личный кабинет\"]");
    private final SelenideElement footerButtonSchedule = $x("//a[@class=\"tn-atom\" and text()=\"Расписание\"]");
    private final SelenideElement footerButtonProgram = $x("//a[@class=\"tn-atom\" and text()=\"Программы\"]");
    private final SelenideElement footerButtonCamp = $x("//a[@class=\"tn-atom\" and text()=\"Лагерь\"]");
    private final SelenideElement footerItem = $x("//a[@target=\"_blank\" and text()=\"Товары и пособия\"]");
    private final SelenideElement footerDelivery = $x("//a[@target=\"_blank\" and text()=\"Доставка и оплата\"]");
    private final SelenideElement footerFacebook = $x("//img[@imgfield=\"tn_img_1668603579046\"]");
    private final SelenideElement footerVK = $x("//img[@imgfield=\"tn_img_1668603579051\"]");
    private final SelenideElement footerInstagram = $x("//img[@imgfield=\"tn_img_1668603579055\"]");
    private final SelenideElement footerTelegram = $x("//img[@imgfield=\"tn_img_1668603579059\"]");
    private final SelenideElement footerViber = $x("//img[@imgfield=\"tn_img_1668603579062\"]");
    private final SelenideElement Window = $x("//div[@class=\"t-popup t-popup_show\"]");
    private final SelenideElement WindowClick = $x("//*[@id=\"rec591839086\"]/div/div/div[2]/button/svg/g/rect[2]");
    private final SelenideElement buttonX = $x("//div[@class=\"t651__btn-text t-name t-name_xs\"]");

    public void buttonMainLogo() {
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
//        js.executeScript("arguments[0].style.pointerEvents='none';", Window);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        footerButtonMainLogo.shouldBe(visible).click();
    }

    public void buttonAboutUsHistory() {
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
//        js.executeScript("arguments[0].style.pointerEvents='none';", Window);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        footerButtonAboutUsHistory.shouldBe(visible).click();
    }

    public void buttonAboutUsTeachers() {
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
//        js.executeScript("arguments[0].style.pointerEvents='none';", Window);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        footerButtonAboutUsTeachers.shouldBe(visible).click();
    }

    public void buttonAboutUsBlog() {
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
//        js.executeScript("arguments[0].style.pointerEvents='none';", Window);
        footerButtonAboutUsBlog.shouldBe(visible).click();
    }

    public void buttonAboutUsPhoto() {
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
//        js.executeScript("arguments[0].style.pointerEvents='none';", Window);
        footerButtonAboutUsPhoto.shouldBe(visible).click();
    }

    public void buttonAboutUs() {
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
//        js.executeScript("arguments[0].style.pointerEvents='none';", Window);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        footerButtonAboutUs.shouldBe(visible).click();
    }

    public void buttonVacancies() {
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
//        js.executeScript("arguments[0].style.pointerEvents='none';", Window);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        footerButtonVacancies.shouldBe(visible).click();
    }

    public void buttonInf() {
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
//        js.executeScript("arguments[0].style.pointerEvents='none';", Window);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        footerButtonInf.shouldBe(visible).click();
    }

    public void footerLK() {
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
//        js.executeScript("arguments[0].style.pointerEvents='none';", Window);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        footerLK.shouldBe(visible).click();
    }

    public void buttonSchedule() {
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
//        js.executeScript("arguments[0].style.pointerEvents='none';", Window);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        footerButtonSchedule.shouldBe(visible).click();
    }

    public void buttonProgram() {
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
//        js.executeScript("arguments[0].style.pointerEvents='none';", Window);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        footerButtonProgram.shouldBe(visible).click();
    }

    public void buttonCamp() {
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
//        js.executeScript("arguments[0].style.pointerEvents='none';", Window);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        footerButtonCamp.shouldBe(visible).click();
    }

    public void footerItem() {
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
//        js.executeScript("arguments[0].style.pointerEvents='none';", Window);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        footerItem.shouldBe(visible).click();
        switchTo().window(1, Duration.ofSeconds(30));
    }
    public void footerDelivery() {
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
//        js.executeScript("arguments[0].style.pointerEvents='none';", Window);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        footerDelivery.shouldBe(visible).click();
        switchTo().window(1, Duration.ofSeconds(30));
    }

    public void footerFacebook() {
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
//        js.executeScript("arguments[0].style.pointerEvents='none';", Window);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        footerFacebook.shouldBe(visible).click();
        switchTo().window(1, Duration.ofSeconds(30));
    }

    public void footerVK() {
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
//        js.executeScript("arguments[0].style.pointerEvents='none';", Window);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        footerVK.shouldBe(visible).click();
        switchTo().window(1, Duration.ofSeconds(30));
    }

    public void footerInstagram() {
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
//        js.executeScript("arguments[0].style.pointerEvents='none';", Window);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        footerInstagram.shouldBe(visible).click();
        switchTo().window(1, Duration.ofSeconds(30));
    }

    public void footerTelegram() {
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
//        js.executeScript("arguments[0].style.pointerEvents='none';", Window);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        footerTelegram.shouldBe(visible).click();
        switchTo().window(1, Duration.ofSeconds(30));
    }

    public void footerViber() {
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
//        js.executeScript("arguments[0].style.pointerEvents='none';", Window);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        footerViber.shouldBe(visible).click();
        switchTo().window(1, Duration.ofSeconds(30));
    }
}
