package pages.g_pcikholog_konsyltatsia;

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
    private final SelenideElement sendUser = $x("//*[@id=\"rec530478828\"]/div/div/div[17]/a");
    private final SelenideElement sendUser2 = $x("//div[13]/a");
    private final SelenideElement placeText = $x("//div[1]/div/div/div/div/p/span[3]");

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
        String searchText = "Оставьте запись на пробный урок, и мы свяжемся с Вами в течение 10 мин";
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
        String searchText = "Оставьте запись на пробный урок, и мы свяжемся с Вами в течение 10 мин";
        placeText.shouldBe(visible).shouldHave(text(searchText));
    }
}