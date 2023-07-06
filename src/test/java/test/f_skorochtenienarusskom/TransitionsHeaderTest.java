package test.f_skorochtenienarusskom;

import SetUp.Setup;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
        open("https://megalife.by/skorochtenienarusskom");
    }

    @Test
    @DisplayName("Переход Logo в шапке")
    public void Logo() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Header();
        skorochtenienarusskom.buttonMainLogo();
        String pageTitle = Selenide.title();
        assertEquals("Международный IQ центр MegaLife | интеллектуальное развитие ребенка в Минске", pageTitle);
    }

//    @Test
//    @DisplayName("Переход Акции в шапке")
//    public void Sale() {
//var skorochtenienarusskom = new pages.skorochtenienarusskom_6.Header();
//        skorochtenienarusskom.headerButtonSale();
//        String pageTitle = Selenide.title();
//        assertEquals("Курс скорочтение для преподавателей ", pageTitle);
//    }

    @Test
    @DisplayName("Переход Программы в шапке")
    public void Programs() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Header();
        skorochtenienarusskom.buttonProgram();
        String pageTitle = Selenide.title();
        assertEquals("Каталог курсов", pageTitle);
    }

    @Test
    @DisplayName("Переход Лагерь в шапке")
    public void Camp() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Header();
        skorochtenienarusskom.buttonCamp();
        String pageTitle = Selenide.title();
        assertEquals("Лагерь-меню", pageTitle);
    }

    @Test
    @DisplayName("Переход Расписание в шапке")
    public void Schedule() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Header();
        skorochtenienarusskom.buttonSchedule();
        String currentUrl = WebDriverRunner.url();
        assertEquals("https://megalife.by/zapis-online", currentUrl);
    }

    @Test
    @DisplayName("Переход Контакты в шапке")
    public void Contacts() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Header();
        skorochtenienarusskom.buttonContacts();
        String pageTitle = Selenide.title();
        assertEquals("Контакты детского развивающего центра MegaLife в Минске", pageTitle);
    }

    @Test
    @DisplayName("Переход История центра в шапке")
    public void AboutUsHistory() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Header();
        skorochtenienarusskom.buttonAboutUsHistory();
        String pageTitle = Selenide.title();
        assertEquals("О нас - международный детский центр MegaLife", pageTitle);
    }

    @Test
    @DisplayName("Переход Преподователи в шапке")
    public void AboutUsTeachers() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Header();
        skorochtenienarusskom.buttonAboutUsTeachers();
        String pageTitle = Selenide.title();
        assertEquals("Преподаватели - MegaLife", pageTitle);
    }

    @Test
    @DisplayName("Переход Документы в шапке")
    public void AboutUsDocs() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Header();
        skorochtenienarusskom.buttonAboutUsDocs();
        String pageTitle = Selenide.title();
        assertEquals("Документы - MegaLife", pageTitle);
    }

    @Test
    @DisplayName("Переход Отзывы в шапке")
    public void AboutUsReviews() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Header();
        skorochtenienarusskom.buttonAboutUsReviews();
        String pageTitle = Selenide.title();
        assertEquals("Отзывы", pageTitle);
    }

    @Test
    @DisplayName("Переход Галерея в шапке")
    public void AboutUsPhotos() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Header();
        skorochtenienarusskom.buttonAboutUsPhoto();
        String pageTitle = Selenide.title();
        assertEquals("Галерея фотографии детского центра - MegaLife", pageTitle);
    }

    @Test
    @DisplayName("Переход Блог в шапке")
    public void AboutUsBlog() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Header();
        skorochtenienarusskom.buttonAboutUsBlog();
        String pageTitle = Selenide.title();
        assertEquals("Статьи и полезные материалы детского IQ-центра MegaLife", pageTitle);
    }
    @Test
    @DisplayName("Переход в ЛК в шапке")
    public void buttonButtonLK() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Header();
        skorochtenienarusskom.buttonButtonLK();
        String pageTitle = Selenide.title();
        assertEquals("Личный кабинет", pageTitle);
    }
}