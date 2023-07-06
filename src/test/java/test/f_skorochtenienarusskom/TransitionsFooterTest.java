package test.f_skorochtenienarusskom;

import SetUp.Setup;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class TransitionsFooterTest {

    @BeforeAll
    public static void setup() {
        var setups = new Setup();
        setups.start();
    }

    @BeforeEach
    public void start() {
        open("https://megalife.by/skorochtenienarusskom");
    }

    @AfterEach
    public void finish() {
        closeWindow();
    }

    //добавить лк в хедер, дописать асерт тут
    @Test
    @Order(1)
    @DisplayName("Переход Logo в футере")
    public void buttonMainLogo() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Footer();
        skorochtenienarusskom.buttonMainLogo();
        String pageTitle = Selenide.title();
        assertEquals("Международный IQ центр MegaLife | интеллектуальное развитие ребенка в Минске", pageTitle);
    }

    @Test
    @DisplayName("Переход История центра в футере")
    public void buttonAboutUsHistory() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Footer();
        skorochtenienarusskom.buttonAboutUsHistory();
        String pageTitle = Selenide.title();
        assertEquals("О нас - международный детский центр MegaLife", pageTitle);
    }

    @Test
    @DisplayName("Переход Преподаватели в футере")
    public void buttonAboutUsTeachers() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Footer();
        skorochtenienarusskom.buttonAboutUsTeachers();
        String pageTitle = Selenide.title();
        assertEquals("Преподаватели - MegaLife", pageTitle);
    }

    @Test
    @DisplayName("Переход Блог в футере")
    public void buttonAboutUsBlog() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Footer();
        skorochtenienarusskom.buttonAboutUsBlog();
        String pageTitle = Selenide.title();
        assertEquals("Статьи и полезные материалы детского IQ-центра MegaLife", pageTitle);
    }

    @Test
    @DisplayName("Переход Галерея в футере")
    public void buttonAboutUsPhoto() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Footer();
        skorochtenienarusskom.buttonAboutUsPhoto();
        String pageTitle = Selenide.title();
        assertEquals("Галерея фотографии детского центра - MegaLife", pageTitle);
    }

    @Test
    @DisplayName("Переход Отзывы о нас в футере")
    public void buttonAboutUs() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Footer();
        skorochtenienarusskom.buttonAboutUs();
        String pageTitle = Selenide.title();
        assertEquals("Отзывы", pageTitle);
    }

    @Test
    @DisplayName("Переход Вакансии в футере")
    public void buttonVacancies() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Footer();
        skorochtenienarusskom.buttonVacancies();
        String pageTitle = Selenide.title();
        assertEquals("Вакансии", pageTitle);
    }

    @Test
    @DisplayName("Переход Правовая инф в футере")
    public void buttonInf() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Footer();
        skorochtenienarusskom.buttonInf();
        String pageTitle = Selenide.title();
        assertEquals("Политика конфиденциальности", pageTitle);
    }

    @Test
    @DisplayName("Переход Личный кабинет в футере")
    public void footerLK() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Footer();
        skorochtenienarusskom.footerLK();
        String pageTitle = Selenide.title();
        assertEquals("Личный кабинет", pageTitle);
    }

    @Test
    @DisplayName("Переход Расписание в футере")
    public void buttonSchedule() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Footer();
        skorochtenienarusskom.buttonSchedule();
        String currentUrl = WebDriverRunner.url();
        assertEquals("https://megalife.by/zapis-online", currentUrl);
    }

    @Test
    @DisplayName("Переход Программы в футере")
    public void buttonProgram() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Footer();
        skorochtenienarusskom.buttonProgram();
        String pageTitle = Selenide.title();
        assertEquals("Каталог курсов", pageTitle);
    }

    @Test
    @DisplayName("Переход Лагерь в футере")
    public void buttonCamp() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Footer();
        skorochtenienarusskom.buttonCamp();
        String pageTitle = Selenide.title();
        assertEquals("Лагерь-меню", pageTitle);
    }

    @Test
    @DisplayName("Переход Товары и пособия в футере")
    public void footerItem() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Footer();
        skorochtenienarusskom.footerItem();
        String pageTitle = Selenide.title();
        assertEquals("Цены на товары для ментальной арифметики", pageTitle);
    }

    @Test
    @DisplayName("Переход Доставка и опалата в футере")
    public void footerDelivery() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Footer();
        skorochtenienarusskom.footerDelivery();
        String currentUrl = WebDriverRunner.url();
        assertEquals("https://megalife.by/pravilaoplaty", currentUrl);
    }

    @Test
    @DisplayName("Переход Фейсбук в футере")
    public void footerFacebook() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Footer();
        skorochtenienarusskom.footerFacebook();
        String currentUrl = WebDriverRunner.url();
        assertEquals("https://www.facebook.com/megalife.by", currentUrl);
    }

    @Test
    @DisplayName("Переход ВК в футере")
    public void footerVK() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Footer();
        skorochtenienarusskom.footerVK();
        String currentUrl = WebDriverRunner.url();
        assertEquals("https://vk.com/megalife_lager", currentUrl);
    }

    @Test
    @DisplayName("Переход Инстаграм в футере")
    public void footerInstagram() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Footer();
        skorochtenienarusskom.footerInstagram();
        String currentUrl = WebDriverRunner.url();
        assertEquals("https://www.instagram.com/megalife.by/", currentUrl);
    }

    @Test
    @DisplayName("Переход Телеграм в футере")
    public void footerTelegram() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Footer();
        skorochtenienarusskom.footerTelegram();
        String pageTitle = Selenide.title();
        assertEquals("Telegram: Contact @megalifebyclub", pageTitle);
    }

    @Test
    @DisplayName("Переход Вайбер в футере")
    public void footerViber() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Footer();
        skorochtenienarusskom.footerViber();
        String pageTitle = Selenide.title();
        assertEquals("MegaLife News в Viber", pageTitle);
    }

}
