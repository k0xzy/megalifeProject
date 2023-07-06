package pages.l_detskij_vesennij_lager;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Header {
    Actions actions = new Actions(getWebDriver());

    private final SelenideElement headerButtonMainLogo = $x("//img[@class=\"t228__imglogo t228__imglogomobile\"]");
    private final SelenideElement headerButtonSale = $x("//div[3]/nav/ul/li[1]/a");
    private final SelenideElement headerButtonLK = $x("//td[text()=\"Войти\"]");
    private final SelenideElement headerButtonProgram = $x("//li[@class=\"t228__list_item\"]//a[text()=\"Программы\"]");
    private final SelenideElement headerButtonCamp = $x("//li[@class=\"t228__list_item\"]//a[text()=\"Лагерь\"]");
    private final SelenideElement headerButtonSchedule = $x("//li[@class=\"t228__list_item\"]//a[text()=\"Расписание\"]");
    private final SelenideElement headerButtonContacts = $x("//li[@class=\"t228__list_item\"]//a[text()=\"Контакты\"]");
    private final SelenideElement headerButtonAboutUs = $x("//a[@class=\"t-menu__link-item t-menusub__target-link\"]");

    private final SelenideElement headerButtonAboutUsHistory = $x("//li[@class=\"t228__list_item\"]//a[text()=\"История центра\"]");
    private final SelenideElement headerButtonAboutUsTeachers = $x("//li[@class=\"t228__list_item\"]//a[text()=\"Преподаватели\"]");
    private final SelenideElement headerButtonAboutUsDocs = $x("//li[@class=\"t228__list_item\"]//a[text()=\"Документы\"]");
    private final SelenideElement headerButtonAboutUsReviews = $x("//li[@class=\"t228__list_item\"]//a[text()=\"Отзывы\"]");
    private final SelenideElement headerButtonAboutUsPhoto = $x("//li[@class=\"t228__list_item\"]//a[text()=\"Галерея\"]");
    private final SelenideElement headerButtonAboutUsBlog = $x("//li[@class=\"t228__list_item\"]//a[text()=\"Блог\"]");
    public void buttonMainLogo() {
        headerButtonMainLogo.shouldBe(visible).click();
    }
    public void buttonProgram() {
        headerButtonProgram.shouldBe(visible).click();
    }
    public void buttonCamp() {
        headerButtonCamp.shouldBe(visible).click();
    }
    public void buttonSchedule() {
        headerButtonSchedule.shouldBe(visible).click();
    }
    public void buttonContacts() {
        headerButtonContacts.shouldBe(visible).click();
    }
    public void buttonAboutUsHistory() {
        actions.moveToElement(headerButtonAboutUs).perform();
        headerButtonAboutUsHistory.shouldBe(visible).click();
    }
    public void buttonButtonLK() {
        headerButtonLK.shouldBe(visible).click();
    }
//    public void headerButtonSale() {
//        headerButtonSale.shouldBe(visible).click();
//    }
    public void buttonAboutUsTeachers() {
        actions.moveToElement(headerButtonAboutUs).perform();
        headerButtonAboutUsTeachers.shouldBe(visible).click();
    }
    public void buttonAboutUsDocs() {
        actions.moveToElement(headerButtonAboutUs).perform();
        headerButtonAboutUsDocs.shouldBe(visible).click();
    }
    public void buttonAboutUsReviews() {
        actions.moveToElement(headerButtonAboutUs).perform();
        headerButtonAboutUsReviews.shouldBe(visible).click();
    }
    public void buttonAboutUsPhoto() {
        actions.moveToElement(headerButtonAboutUs).perform();
        headerButtonAboutUsPhoto.shouldBe(visible).click();
    }
    public void buttonAboutUsBlog() {
        actions.moveToElement(headerButtonAboutUs).perform();
        headerButtonAboutUsBlog.shouldBe(visible).click();
    }


}
