package test.b_ChtenieNull;

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
        open("https://megalife.by/chtenie-s-nulya");
    }

    @Test
    @Order(1)
    @DisplayName("Покупка 30")
    public void buy30() {
        var mentalka = new pages.b_ChtenieNull.Body();
        mentalka.buy30();
    }

    @Test
    @Order(2)
    @DisplayName("Покупка 112")
    public void buy112() {
        var mentalka = new pages.b_ChtenieNull.Body();
        mentalka.buy112();
    }

    @Test
    @Order(3)
    @DisplayName("Покупка 288")
    public void buy288() {
        var mentalka = new pages.b_ChtenieNull.Body();
        mentalka.buy288();
    }

    @Test
    @Order(4)
    @DisplayName("Покупка 60")
    public void buy60() {
        var mentalka = new pages.b_ChtenieNull.Body();
        mentalka.buy60();
    }

    @Test
    @Order(5)
    @DisplayName("Покупка 200")
    public void buy200() {
        var mentalka = new pages.b_ChtenieNull.Body();
        mentalka.buy200();
    }

    @Test
    @Order(6)
    @DisplayName("Покупка 540")
    public void buy540() {
        var mentalka = new pages.b_ChtenieNull.Body();
        mentalka.buy540();
    }

    @Test
    @Order(7)
    @DisplayName("Эмоциональный интеллект, по кнопке")
    public void learnMore1() {
        var mentalka = new pages.b_ChtenieNull.Body();
        mentalka.learnMore1();
        String pageTitle = Selenide.title();
        assertEquals("Курсы для развития эмоционального интеллекта у детей - MegaLife", pageTitle);
    }

    @Test
    @Order(8)
    @DisplayName("Эмоциональный интеллект, по картинке")
    public void img1() {
        var mentalka = new pages.b_ChtenieNull.Body();
        mentalka.img1();
        String pageTitle = Selenide.title();
        assertEquals("Курсы для развития эмоционального интеллекта у детей - MegaLife", pageTitle);
    }

    @Test
    @Order(9)
    @DisplayName("Эмоциональный интеллект, по названию")
    public void learnMoreText1() {
        var mentalka = new pages.b_ChtenieNull.Body();
        mentalka.learnMoreText1();
        String pageTitle = Selenide.title();
        assertEquals("Курсы для развития эмоционального интеллекта у детей - MegaLife", pageTitle);
    }

    @Test
    @Order(10)
    @DisplayName("Скорочтение, по кнопке")
    public void learnMore2() {
        var mentalka = new pages.b_ChtenieNull.Body();
        mentalka.learnMore2();
        String pageTitle = Selenide.title();
        assertEquals("Скорочтение для детей: научим читать бегло, а запоминать быстро✓", pageTitle);
    }

    @Test
    @Order(11)
    @DisplayName("Скорочтение, по кнопке")
    public void img2() {
        var mentalka = new pages.b_ChtenieNull.Body();
        mentalka.img2();
        String pageTitle = Selenide.title();
        assertEquals("Скорочтение для детей: научим читать бегло, а запоминать быстро✓", pageTitle);
    }

    @Test
    @Order(12)
    @DisplayName("Скорочтение, по кнопке")
    public void learnMoreText2() {
        var mentalka = new pages.b_ChtenieNull.Body();
        mentalka.learnMoreText2();
        String pageTitle = Selenide.title();
        assertEquals("Скорочтение для детей: научим читать бегло, а запоминать быстро✓", pageTitle);
    }

    @Test
    @Order(13)
    @DisplayName("Ментальная арифметика, по кнопке")
    public void learnMore3() {
        var mentalka = new pages.b_ChtenieNull.Body();
        mentalka.learnMore3();
        String pageTitle = Selenide.title();
        assertEquals("Курс по ментальной арифметике для детей от MegaLife", pageTitle);
    }

    @Test
    @Order(14)
    @DisplayName("Ментальная арифметика, по кнопке")
    public void img3() {
        var mentalka = new pages.b_ChtenieNull.Body();
        mentalka.img3();
        String pageTitle = Selenide.title();
        assertEquals("Курс по ментальной арифметике для детей от MegaLife", pageTitle);
    }

    @Test
    @Order(15)
    @DisplayName("Ментальная арифметика, по кнопке")
    public void learnMoreText3() {
        var mentalka = new pages.b_ChtenieNull.Body();
        mentalka.learnMoreText3();
        String pageTitle = Selenide.title();
        assertEquals("Курс по ментальной арифметике для детей от MegaLife", pageTitle);
    }
}
