package test.a_mentalka;

import SetUp.Setup;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.a_mentalka.Header;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TransitionsHeaderTest {

    @BeforeAll
    public static void setup() {
        var setups = new Setup();
        setups.start();
    }


    @BeforeEach
    public void start() {
        open("https://megalife.by/mentalka");
    }

    @Test
    @DisplayName("Переход Logo в шапке")
    public void Logo() {
        var mentalka = new Header();
        mentalka.buttonMainLogo();
        String pageTitle = Selenide.title();
        assertEquals("Международный IQ центр MegaLife | интеллектуальное развитие ребенка в Минске", pageTitle);
    }

    @Test
    @DisplayName("Переход Программы в шапке")
    public void Programs() {
        var mentalka = new Header();
        mentalka.buttonProgram();
        String pageTitle = Selenide.title();
        assertEquals("Каталог курсов", pageTitle);
    }

    @Test
    @DisplayName("Переход Лагерь в шапке")
    public void Camp() {
        var mentalka = new Header();
        mentalka.buttonCamp();
        String pageTitle = Selenide.title();
        assertEquals("Лагерь-меню", pageTitle);
    }

    @Test
    @DisplayName("Переход Расписание в шапке")
    public void Schedule() {
        var mentalka = new Header();
        mentalka.buttonSchedule();
        String currentUrl = WebDriverRunner.url();
        assertEquals("https://megalife.by/zapis-online", currentUrl);
    }

    @Test
    @DisplayName("Переход Контакты в шапке")
    public void Contacts() {
        var mentalka = new Header();
        mentalka.buttonContacts();
        String pageTitle = Selenide.title();
        assertEquals("Контакты детского развивающего центра MegaLife в Минске", pageTitle);
    }

    @Test
    @DisplayName("Переход История центра в шапке")
    public void AboutUsHistory() {
        var mentalka = new Header();
        mentalka.buttonAboutUsHistory();
        String pageTitle = Selenide.title();
        assertEquals("О нас - международный детский центр MegaLife", pageTitle);
    }

    @Test
    @DisplayName("Переход Преподователи в шапке")
    public void AboutUsTeachers() {
        var mentalka = new Header();
        mentalka.buttonAboutUsTeachers();
        String pageTitle = Selenide.title();
        assertEquals("Преподаватели - MegaLife", pageTitle);
    }

    @Test
    @DisplayName("Переход Документы в шапке")
    public void AboutUsDocs() {
        var mentalka = new Header();
        mentalka.buttonAboutUsDocs();
        String pageTitle = Selenide.title();
        assertEquals("Документы - MegaLife", pageTitle);
    }

    @Test
    @DisplayName("Переход Отзывы в шапке")
    public void AboutUsReviews() {
        var mentalka = new Header();
        mentalka.buttonAboutUsReviews();
        String pageTitle = Selenide.title();
        assertEquals("Отзывы", pageTitle);
    }

    @Test
    @DisplayName("Переход Галерея в шапке")
    public void AboutUsPhotos() {
        var mentalka = new Header();
        mentalka.buttonAboutUsPhoto();
        String pageTitle = Selenide.title();
        assertEquals("Галерея фотографии детского центра - MegaLife", pageTitle);
    }

    @Test
    @DisplayName("Переход Блог в шапке")
    public void AboutUsBlog() {
        var mentalka = new Header();
        mentalka.buttonAboutUsBlog();
        String pageTitle = Selenide.title();
        assertEquals("Статьи и полезные материалы детского IQ-центра MegaLife", pageTitle);
    }
    @Test
    @DisplayName("Переход в ЛК в шапке")
    public void buttonButtonLK() {
        var mentalka = new Header();
        mentalka.buttonButtonLK();
        String pageTitle = Selenide.title();
        assertEquals("Личный кабинет", pageTitle);
    }
}