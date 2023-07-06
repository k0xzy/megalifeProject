package test.m_osenniy_lager;

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
        open("https://megalife.by/osenniy-lager");
    }

    @Test
    @DisplayName("Переход Logo в шапке")
    public void Logo() {
        var childrenCamp = new pages.m_osenniy_lager.Header();
        childrenCamp.buttonMainLogo();
        String pageTitle = Selenide.title();
        assertEquals("Международный IQ центр MegaLife | интеллектуальное развитие ребенка в Минске", pageTitle);
    }

//    @Test
//    @DisplayName("Переход Акции в шапке")
//    public void Sale() {
//      var skorochtenienarusskom = new pages.skorochtenienarusskom_6.Header();
//        skorochtenienarusskom.headerButtonSale();
//        String pageTitle = Selenide.title();
//        assertEquals("Курс скорочтение для преподавателей ", pageTitle);
//    }

    @Test
    @DisplayName("Переход Программы в шапке")
    public void Programs() {
        var childrenCamp = new pages.m_osenniy_lager.Header();
        childrenCamp.buttonProgram();
        String pageTitle = Selenide.title();
        assertEquals("Каталог курсов", pageTitle);
    }

    @Test
    @DisplayName("Переход Лагерь в шапке")
    public void Camp() {
        var childrenCamp = new pages.m_osenniy_lager.Header();
        childrenCamp.buttonCamp();
        String pageTitle = Selenide.title();
        assertEquals("Лагерь-меню", pageTitle);
    }

    @Test
    @DisplayName("Переход Расписание в шапке")
    public void Schedule() {
        var childrenCamp = new pages.m_osenniy_lager.Header();
        childrenCamp.buttonSchedule();
        String currentUrl = WebDriverRunner.url();
        assertEquals("https://megalife.by/zapis-online", currentUrl);
    }

    @Test
    @DisplayName("Переход Контакты в шапке")
    public void Contacts() {
        var childrenCamp = new pages.m_osenniy_lager.Header();
        childrenCamp.buttonContacts();
        String pageTitle = Selenide.title();
        assertEquals("Контакты детского развивающего центра MegaLife в Минске", pageTitle);
    }

    @Test
    @DisplayName("Переход История центра в шапке")
    public void AboutUsHistory() {
        var childrenCamp = new pages.m_osenniy_lager.Header();
        childrenCamp.buttonAboutUsHistory();
        String pageTitle = Selenide.title();
        assertEquals("О нас - международный детский центр MegaLife", pageTitle);
    }

    @Test
    @DisplayName("Переход Преподователи в шапке")
    public void AboutUsTeachers() {
        var childrenCamp = new pages.m_osenniy_lager.Header();
        childrenCamp.buttonAboutUsTeachers();
        String pageTitle = Selenide.title();
        assertEquals("Преподаватели - MegaLife", pageTitle);
    }

    @Test
    @DisplayName("Переход Документы в шапке")
    public void AboutUsDocs() {
        var childrenCamp = new pages.m_osenniy_lager.Header();
        childrenCamp.buttonAboutUsDocs();
        String pageTitle = Selenide.title();
        assertEquals("Документы - MegaLife", pageTitle);
    }

    @Test
    @DisplayName("Переход Отзывы в шапке")
    public void AboutUsReviews() {
        var childrenCamp = new pages.m_osenniy_lager.Header();
        childrenCamp.buttonAboutUsReviews();
        String pageTitle = Selenide.title();
        assertEquals("Отзывы", pageTitle);
    }

    @Test
    @DisplayName("Переход Галерея в шапке")
    public void AboutUsPhotos() {
        var childrenCamp = new pages.m_osenniy_lager.Header();
        childrenCamp.buttonAboutUsPhoto();
        String pageTitle = Selenide.title();
        assertEquals("Галерея фотографии детского центра - MegaLife", pageTitle);
    }

    @Test
    @DisplayName("Переход Блог в шапке")
    public void AboutUsBlog() {
        var childrenCamp = new pages.m_osenniy_lager.Header();
        childrenCamp.buttonAboutUsBlog();
        String pageTitle = Selenide.title();
        assertEquals("Статьи и полезные материалы детского IQ-центра MegaLife", pageTitle);
    }
    @Test
    @DisplayName("Переход в ЛК в шапке")
    public void buttonButtonLK() {
        var childrenCamp = new pages.m_osenniy_lager.Header();
        childrenCamp.buttonButtonLK();
        String pageTitle = Selenide.title();
        assertEquals("Личный кабинет", pageTitle);
    }
}