package test.f_skorochtenienarusskom;

import SetUp.Setup;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BodyTest {

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
    @Order(1)
    @DisplayName("Покупка 30")
    public void buy30() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Body();
        skorochtenienarusskom.buy30();
    }

    @Test
    @Order(2)
    @DisplayName("Покупка 112")
    public void buy112() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Body();
        skorochtenienarusskom.buy112();
    }

    @Test
    @Order(3)
    @DisplayName("Покупка 288")
    public void buy288() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Body();
        skorochtenienarusskom.buy288();
    }

    @Test
    @Order(4)
    @DisplayName("Покупка 60")
    public void buy60() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Body();
        skorochtenienarusskom.buy60();
    }

    @Test
    @Order(5)
    @DisplayName("Покупка 200")
    public void buy200() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Body();
        skorochtenienarusskom.buy200();
    }

    @Test
    @Order(6)
    @DisplayName("Покупка 540")
    public void buy540() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Body();
        skorochtenienarusskom.buy540();
    }
    @Test
    @Order(7)
    @DisplayName("Покупка 100")
    public void buy100() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Body();
        skorochtenienarusskom.buy100();
    }

    @Test
    @Order(8)
    @DisplayName("Скролл к форме")
    public void sendUser() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Body();
        skorochtenienarusskom.sendUser();
    }

    @Test
    @Order(9)
    @DisplayName("Эмоциональный интеллект, по кнопке")
    public void learnMore1() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Body();
        skorochtenienarusskom.learnMore1();
        String pageTitle = Selenide.title();
        assertEquals("Курсы для развития эмоционального интеллекта у детей - MegaLife", pageTitle);
    }

    @Test
    @Order(10)
    @DisplayName("Эмоциональный интеллект, по картинке")
    public void img1() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Body();
        skorochtenienarusskom.img1();
        String pageTitle = Selenide.title();
        assertEquals("Курсы для развития эмоционального интеллекта у детей - MegaLife", pageTitle);
    }

    @Test
    @Order(11)
    @DisplayName("Эмоциональный интеллект, по названию")
    public void learnMoreText1() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Body();
        skorochtenienarusskom.learnMoreText1();
        String pageTitle = Selenide.title();
        assertEquals("Курсы для развития эмоционального интеллекта у детей - MegaLife", pageTitle);
    }

    @Test
    @Order(12)
    @DisplayName("Ментальная арифметика, по кнопке")
    public void learnMore2() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Body();
        skorochtenienarusskom.learnMore2();
        String pageTitle = Selenide.title();
        assertEquals("Курс по ментальной арифметике для детей от MegaLife", pageTitle);
    }

    @Test
    @Order(13)
    @DisplayName("Ментальная арифметика, по картинке")
    public void img2() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Body();
        skorochtenienarusskom.img2();
        String pageTitle = Selenide.title();
        assertEquals("Курс по ментальной арифметике для детей от MegaLife", pageTitle);
    }

    @Test
    @Order(14)
    @DisplayName("Ментальная арифметика, по названию")
    public void learnMoreText2() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Body();
        skorochtenienarusskom.learnMoreText2();
        String pageTitle = Selenide.title();
        assertEquals("Курс по ментальной арифметике для детей от MegaLife", pageTitle);
    }

    @Test
    @Order(15)
    @DisplayName("Робототехника, по кнопке")
    public void learnMore3() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Body();
        skorochtenienarusskom.learnMore3();
        String pageTitle = Selenide.title();
        assertEquals("Робототехника для детей в Минске | офлайн ☑", pageTitle);
    }

    @Test
    @Order(16)
    @DisplayName("Робототехника, по картинке")
    public void img3() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Body();
        skorochtenienarusskom.img3();
        String pageTitle = Selenide.title();
        assertEquals("Робототехника для детей в Минске | офлайн ☑", pageTitle);
    }

    @Test
    @Order(17)
    @DisplayName("Робототехника, по названию")
    public void learnMoreText3() {
        var skorochtenienarusskom = new pages.f_skorochtenienarusskom.Body();
        skorochtenienarusskom.learnMoreText3();
        String pageTitle = Selenide.title();
        assertEquals("Робототехника для детей в Минске | офлайн ☑", pageTitle);
    }
}
