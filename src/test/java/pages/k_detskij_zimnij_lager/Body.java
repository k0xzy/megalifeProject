package pages.k_detskij_zimnij_lager;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Body {

    Actions actions = new Actions(getWebDriver());
    JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
    private final SelenideElement Window = $x("//div[@class=\"t-popup t-popup_show\"]");
    private final SelenideElement learnMore1 = $x("//div[20]/div/a");
    private final SelenideElement learnMore2 = $x("//*[@id=\"rec546815531\"]/div/div/div[12]/div/a");
    private final SelenideElement buy650 = $x("//div[2]/div/div[1]/div/a/div");
    private final SelenideElement buy850 = $x("//div[2]/div/a/div");
    private final SelenideElement buy1050 = $x("//div[3]/div/a/div");
    private final SelenideElement bank = $x("//span[@class=\"amount__major\"]");
    private final SelenideElement sendUser = $x("//*[@id=\"rec518780476\"]/div/div/div[7]/a");
    private final SelenideElement sendUser2 = $x("//*[@id=\"rec518781428\"]/div/div/div[3]/a");
    private final SelenideElement sendUser3 = $x("//*[@id=\"rec518782875\"]/div/div/div[3]/a");
    private final SelenideElement sendUser4 = $x("//div[6]/a");
    private final SelenideElement sendUser5 = $x("//div[4]/a");
    private final SelenideElement sendUser6 = $x("//*[@id=\"rec518784830\"]/div/div/div[5]/a");
    private final SelenideElement sendUser7 = $x("//*[@id=\"rec518787727\"]/div/div/div[5]/a");
    private final SelenideElement review = $x("//*[@id=\"rec518786966\"]/div/div/div[3]/a");
    private final SelenideElement placeText = $x("//*[@id=\"rec518785580\"]/div/div[1]/div/div");
    private final SelenideElement placeText2 = $x("//*[@id=\"rec518794568\"]/div/div/div[1]/div/div[1]/div/div");

//    private final SelenideElement enrollATrial = $x("//a[@href=\"#rec577554922\"]");
//    private final SelenideElement nameInput = $x("//input[@placeholder=\"Ваше имя\"] [@autocomplete=\"name\"]");
//    private final SelenideElement namePhone = $x("//div[5]//input[@placeholder=\"Номер телефона\" and @name=\"phone\"]");
//    private final SelenideElement sendForm = $x("//a[@href=\"#sendmyform1\"]");
//    public void enrollATrial() {
//        enrollATrial.scrollTo().shouldBe(Condition.visible).click();
//        nameInput.setValue("Test Test");
//        namePhone.setValue("0000000000");
//        sendForm.click();
//    }
    public void buy650() {
        buy650.scrollTo().shouldBe(Condition.visible);
//        try {
//            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
//        } catch (Throwable e) {
//            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
//        }
        buy650.click();
        switchTo().window(1, Duration.ofSeconds(30));
        String searchText = "650";
        bank.should(Condition.text(searchText));
    }

    public void buy850() {
        buy850.scrollTo().shouldBe(Condition.visible);
//        try {
//            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
//        } catch (Throwable e) {
//            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
//        }
        buy850.click();
        switchTo().window(1, Duration.ofSeconds(30));
        String searchText = "850";
        bank.should(Condition.text(searchText));
    }

    public void buy1050() {
        buy1050.scrollTo().shouldBe(Condition.visible);
//        try {
//            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
//        } catch (Throwable e) {
//            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
//        }
        buy1050.click();
        switchTo().window(1, Duration.ofSeconds(30));
        String searchText = "1 050";
        bank.should(Condition.text(searchText));
    }

    public void sendUser() {
        sendUser.scrollTo().shouldBe(Condition.visible);
//        try {
//            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
//        } catch (Throwable e) {
//            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
//        }
        sendUser.click();
        String searchText = "Тарифы";
        placeText.shouldBe(visible).shouldHave(text(searchText));
    }

    public void sendUser2() {
        sendUser2.scrollTo().shouldBe(Condition.visible);
//        try {
//            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
//        } catch (Throwable e) {
//            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
//        }
        sendUser2.click();
        String searchText = "Оставьте свой номер и укажите удобное время для звонка, чтобы мы могли ответить на все ваши вопросы";
        placeText2.shouldBe(visible).shouldHave(text(searchText));
    }
    public void sendUser3() {
        sendUser3.scrollTo().shouldBe(Condition.visible);
//        try {
//            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
//        } catch (Throwable e) {
//            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
//        }
        sendUser3.click();
        String searchText = "Оставьте свой номер и укажите удобное время для звонка, чтобы мы могли ответить на все ваши вопросы";
        placeText2.shouldBe(visible).shouldHave(text(searchText));
    }
    public void sendUser4() {
        sendUser4.scrollTo().shouldBe(Condition.visible);
//        try {
//            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
//        } catch (Throwable e) {
//            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
//        }
        sendUser4.click();
        String searchText = "Оставьте свой номер и укажите удобное время для звонка, чтобы мы могли ответить на все ваши вопросы";
        placeText2.shouldBe(visible).shouldHave(text(searchText));
    }
    public void sendUser5() {
        sendUser5.scrollTo().shouldBe(Condition.visible);
//        try {
//            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
//        } catch (Throwable e) {
//            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
//        }
        sendUser5.click();
        String searchText = "Оставьте свой номер и укажите удобное время для звонка, чтобы мы могли ответить на все ваши вопросы";
        placeText2.shouldBe(visible).shouldHave(text(searchText));
    }
    public void sendUser6() {
        sendUser6.scrollTo().shouldBe(Condition.visible);
//        try {
//            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
//        } catch (Throwable e) {
//            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
//        }
        sendUser6.click();
        String searchText = "Тарифы";
        placeText.shouldBe(visible).shouldHave(text(searchText));
    }
    public void sendUser7() {
        sendUser7.scrollTo().shouldBe(Condition.visible);
//        try {
//            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
//        } catch (Throwable e) {
//            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
//        }
        sendUser7.click();
        String searchText = "Оставьте свой номер и укажите удобное время для звонка, чтобы мы могли ответить на все ваши вопросы";
        placeText2.shouldBe(visible).shouldHave(text(searchText));
    }
    public void learnMore1() {
        learnMore1.scrollTo().shouldBe(Condition.visible).click();
    }


    public void learnMore2() {
        learnMore2.scrollTo().shouldBe(Condition.visible).click();
    }
}