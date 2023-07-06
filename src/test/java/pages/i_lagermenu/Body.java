package pages.i_lagermenu;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Body {

    Actions actions = new Actions(getWebDriver());
    JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
    private final SelenideElement Window = $x("//div[@class=\"t-popup t-popup_show\"]");
    private final SelenideElement summer = $x("//div[6]/a/img");
    private final SelenideElement autumn = $x("//div[27]/a/img");
    private final SelenideElement spring = $x("//div[13]/a/img");
    private final SelenideElement winter = $x("//div[20]/a/img");

    private final SelenideElement sendUser = $x("//div[4]/a");

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
    }

    public void summer() {
        summer.scrollTo().shouldBe(Condition.visible).click();
    }

    public void autumn() {
        autumn.scrollTo().shouldBe(Condition.visible).click();
    }

    public void spring() {
        spring.scrollTo().shouldBe(Condition.visible).click();
    }

    public void winter() {
        winter.scrollTo().shouldBe(Condition.visible).click();
    }
}