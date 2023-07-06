package pages.h_metodichki;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Body {

    Actions actions = new Actions(getWebDriver());
    JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
    private final SelenideElement Window = $x("//div[@class=\"t-popup t-popup_show\"]");
    private final SelenideElement learnMore1 = $x("//div[20]/div/a");
    private final SelenideElement learnMore2 = $x("//*[@id=\"rec546815531\"]/div/div/div[12]/div/a");
    private final SelenideElement learnMore3 = $x("//*[@id=\"rec546815531\"]/div/div/div[4]/div/a");
    private final SelenideElement img1 = $x("//*[@id=\"rec546815531\"]/div/div/div[10]/a");
    private final SelenideElement img2 = $x("//*[@id=\"rec546815531\"]/div/div/div[18]/a");
    private final SelenideElement img3 = $x("//*[@id=\"rec546815531\"]/div/div/div[26]/a");
    private final SelenideElement learnMoreText1 = $x("//div[6]/div/a/strong");

    private final SelenideElement learnMoreText2 = $x("//div[14]/div/a/strong");

    private final SelenideElement learnMoreText3 = $x("//div[22]/div/a/strong");
    private final SelenideElement buy100 = $x("//*[@id=\"rec529763848\"]/div/div/div[3]/a");
    private final SelenideElement buy30 = $x("//*[@id=\"rec529763848\"]/div/div/div[12]/a");
    private final SelenideElement buy50 = $x("//*[@id=\"rec529763848\"]/div/div/div[21]/a");
    private final SelenideElement bank = $x("//span[@class=\"amount__major\"]");
    private final SelenideElement sendUser = $x("//*[@id=\"rec529720846\"]/div/div/div[4]/a");
    private final SelenideElement sendUser2 = $x("//div[5]/a");
    private final SelenideElement sendUser3 = $x("//*[@id=\"rec529728229\"]/div/div/div[12]/a");
    private final SelenideElement placeText = $x("//*[@id=\"rec578195172\"]/div/div/div[1]/div/div[1]/div[1]");
    private final SelenideElement placeText2 = $x("//*[@id=\"rec529771986\"]");

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
    public void buy100() {
        buy100.scrollTo().shouldBe(Condition.visible);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        buy100.click();
        String searchText = "100";
        bank.should(Condition.text(searchText));
    }

    public void buy30() {
        buy30.scrollTo().shouldBe(Condition.visible);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        buy30.click();
        String searchText = "30";
        bank.should(Condition.text(searchText));
    }

    public void buy50() {
        buy50.scrollTo().shouldBe(Condition.visible);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        buy50.click();
        String searchText = "50";
        bank.should(Condition.text(searchText));
    }

    public void sendUser() {
        sendUser.scrollTo().shouldBe(Condition.visible);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        sendUser.click();
        String searchText = "Запишитесь на бесплатное занятие";
        placeText.shouldBe(visible).shouldHave(text(searchText));
    }

    public void sendUser2() {
        sendUser2.scrollTo().shouldBe(Condition.visible);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        sendUser2.click();
        String searchText = "Запишитесь на бесплатное занятие";
        placeText.shouldBe(visible).shouldHave(text(searchText));
    }
    public void sendUser3() {
        sendUser3.scrollTo().shouldBe(Condition.visible);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        sendUser3.click();
        String searchText = "Часто задаваемые вопросы";
        placeText2.shouldBe(visible).shouldHave(text(searchText));
    }
    public void learnMore1() {
        learnMore1.scrollTo().shouldBe(Condition.visible).click();
    }

    public void img1() {
        img1.scrollTo().shouldBe(Condition.visible).click();
    }

    public void learnMoreText1() {
        learnMoreText1.scrollTo().shouldBe(Condition.visible).click();
    }

    public void learnMore2() {
        learnMore2.scrollTo().shouldBe(Condition.visible).click();
    }

    public void img2() {
        img2.scrollTo().shouldBe(Condition.visible).click();
    }

    public void learnMoreText2() {
        learnMoreText2.scrollTo().shouldBe(Condition.visible).click();
    }

    public void learnMore3() {
        learnMore3.scrollTo().shouldBe(Condition.visible).click();
    }

    public void img3() {
        img3.scrollTo().shouldBe(Condition.visible).click();
    }

    public void learnMoreText3() {
        learnMoreText3.scrollTo().shouldBe(Condition.visible).click();
    }
}