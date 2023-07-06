package pages.j_detskij_lager;

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
    private final SelenideElement sendUser = $x("//*[@id=\"sbs-580508291-1681954384747\"]/a");
    private final SelenideElement sendUser2 = $x("//*[@id=\"sbs-584460789-1682678268850\"]/a");
    private final SelenideElement sendUser3 = $x("//div[3]/div/a/table/tbody/tr/td");
    private final SelenideElement sendUser4 = $x("//*[@id=\"sbs-585096503-1682849115136\"]/a");
    private final SelenideElement placeText = $x("//*[@id=\"rec459674017\"]/div/div/div[1]/div/div/div[1]");
    private final SelenideElement placeText2 = $x("//*[@id=\"rec580514343\"]/div/div/div[18]/div");

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

    public void sendUser() {
        sendUser.scrollTo().shouldBe(Condition.visible);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        sendUser.click();
        String searchText = "Бронирование путёвки";
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
        String searchText = "Забронировать место";
        placeText2.shouldBe(visible).shouldHave(text(searchText));
    }
    public void sendUser3() {
        sendUser3.scrollTo().shouldBe(Condition.visible);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        sendUser3.click();
        String searchText = "Бронирование путёвки";
        placeText.shouldBe(visible).shouldHave(text(searchText));
    }
    public void sendUser4() {
        sendUser4.scrollTo().shouldBe(Condition.visible);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        sendUser4.click();
        String searchText = "Забронировать место";
        placeText2.shouldBe(visible).shouldHave(text(searchText));
    }
}