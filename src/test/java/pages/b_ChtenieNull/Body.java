package pages.b_ChtenieNull;

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
    private final SelenideElement learnMore1 = $x("//a[@href=\"https://megalife.by/emotional-intellect\" and text()=\"Узнать подробнее\"]");
    private final SelenideElement learnMore2 = $x("//a[@href=\"https://megalife.by/skorochtenienarusskom\" and text()=\"Узнать подробнее\"]");
    private final SelenideElement learnMore3 = $x("//*[@id=\"rec555198196\"]/div/div/div[4]/div/a");
    private final SelenideElement img1 = $x("//*[@id=\"rec555198196\"]/div/div/div[26]/a");
    private final SelenideElement img3 = $x("//*[@id=\"rec555198196\"]/div/div/div[10]/a");
    private final SelenideElement img2 = $x("//*[@id=\"rec555198196\"]/div/div/div[18]/a");
    private final SelenideElement learnMoreText1 = $x("//div[22]/div/a/strong");

    private final SelenideElement learnMoreText3 = $x("//div[6]/div/a/strong");

    private final SelenideElement learnMoreText2 = $x("//*[@id=\"rec555198196\"]/div/div/div[14]/div/a");
    private final SelenideElement buy30 = $x("//*[@id=\"rec555198018\"]/div/div/div[6]/a");
    private final SelenideElement buy112 = $x("//*[@id=\"rec555198018\"]/div/div/div[18]/a");
    private final SelenideElement  buy288 = $x("//*[@id=\"rec555198018\"]/div/div/div[28]/a");

    private final SelenideElement  buy60 = $x("//*[@id=\"rec555198101\"]/div/div/div[6]/a");
    private final SelenideElement  buy200 = $x("//*[@id=\"rec555198101\"]/div/div/div[17]/a");
    private final SelenideElement  buy540 = $x("//*[@id=\"rec555198101\"]/div/div/div[26]/a");
    private final SelenideElement bank = $x("//span[@class=\"amount__major\"]");
    private final SelenideElement individual = $x("//li[@data-tab-number=\"2\"]//button");

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
    public void buy112() {
        buy112.scrollTo().shouldBe(Condition.visible);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        buy112.click();
        String searchText = "112";
        bank.should(Condition.text(searchText));
    }
    public void buy288() {
        buy288.scrollTo().shouldBe(Condition.visible);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        buy288.click();
        String searchText = "288";
        bank.should(Condition.text(searchText));
    }

    public void buy60() {
        individual.scrollTo().shouldBe(Condition.visible);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        individual.click();
        buy60.click();
        String searchText = "60";
        bank.should(Condition.text(searchText));
    }
    public void buy200() {
        individual.scrollTo().shouldBe(Condition.visible);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        individual.click();
        buy200.click();
        String searchText = "200";
        bank.should(Condition.text(searchText));
    }
    public void buy540() {
        individual.scrollTo().shouldBe(Condition.visible);
        try {
            executeJavaScript("arguments[0].style.pointerEvents='none';", Window);
        } catch (Throwable e) {
            System.out.println("Элемент не найден. Продолжаем выполнение теста.");
        }
        individual.click();

        buy540.click();
        String searchText = "540";
        bank.should(Condition.text(searchText));
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
