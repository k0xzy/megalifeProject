package test.e_emotionalIntellect;

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
        open("https://megalife.by/emotional-intellect");
    }

    @Test
    @Order(1)
    @DisplayName("Покупка 30")
    public void buy30() {
        var emotional = new pages.e_emotionalIntellect.Body();
        emotional.buy30();
    }

    @Test
    @Order(2)
    @DisplayName("Покупка 112")
    public void buy112() {
        var emotional = new pages.e_emotionalIntellect.Body();
        emotional.buy112();
    }

    @Test
    @Order(3)
    @DisplayName("Покупка 288")
    public void buy288() {
        var emotional = new pages.e_emotionalIntellect.Body();
        emotional.buy288();
    }

    @Test
    @Order(4)
    @DisplayName("Покупка 60")
    public void buy60() {
        var emotional = new pages.e_emotionalIntellect.Body();
        emotional.buy60();
    }

    @Test
    @Order(5)
    @DisplayName("Покупка 200")
    public void buy200() {
        var emotional = new pages.e_emotionalIntellect.Body();
        emotional.buy200();
    }

    @Test
    @Order(6)
    @DisplayName("Покупка 540")
    public void buy540() {
        var emotional = new pages.e_emotionalIntellect.Body();
        emotional.buy540();
    }

    @Test
    @Order(7)
    @DisplayName("Скролл к форме")
    public void sendUser() {
        var emotional = new pages.e_emotionalIntellect.Body();
        emotional.sendUser();
    }

    @Test
    @Order(8)
    @DisplayName("Ментальная арифметика, по кнопке")
    public void learnMore1() {
        var emotional = new pages.e_emotionalIntellect.Body();
        emotional.learnMore1();
        String pageTitle = Selenide.title();
        assertEquals("Курс по ментальной арифметике для детей от MegaLife", pageTitle);
    }

    @Test
    @Order(9)
    @DisplayName("Ментальная арифметика, по картинке")
    public void img1() {
        var emotional = new pages.e_emotionalIntellect.Body();
        emotional.img1();
        String pageTitle = Selenide.title();
        assertEquals("Курс по ментальной арифметике для детей от MegaLife", pageTitle);
    }

    @Test
    @Order(10)
    @DisplayName("Ментальная арифметика, по названию")
    public void learnMoreText1() {
        var emotional = new pages.e_emotionalIntellect.Body();
        emotional.learnMoreText1();
        String pageTitle = Selenide.title();
        assertEquals("Курс по ментальной арифметике для детей от MegaLife", pageTitle);
    }

    @Test
    @Order(11)
    @DisplayName("Скорочтение, по кнопке")
    public void learnMore2() {
        var emotional = new pages.e_emotionalIntellect.Body();
        emotional.learnMore2();
        String pageTitle = Selenide.title();
        assertEquals("Скорочтение для детей: научим читать бегло, а запоминать быстро✓", pageTitle);
    }

    @Test
    @Order(12)
    @DisplayName("Скорочтение, по картинке")
    public void img2() {
        var emotional = new pages.e_emotionalIntellect.Body();
        emotional.img2();
        String pageTitle = Selenide.title();
        assertEquals("Скорочтение для детей: научим читать бегло, а запоминать быстро✓", pageTitle);
    }

    @Test
    @Order(13)
    @DisplayName("Скорочтение, по названию")
    public void learnMoreText2() {
        var emotional = new pages.e_emotionalIntellect.Body();
        emotional.learnMoreText2();
        String pageTitle = Selenide.title();
        assertEquals("Скорочтение для детей: научим читать бегло, а запоминать быстро✓", pageTitle);
    }

    @Test
    @Order(14)
    @DisplayName("Ментальная арифметика, по кнопке")
    public void learnMore3() {
        var emotional = new pages.e_emotionalIntellect.Body();
        emotional.learnMore3();
        String pageTitle = Selenide.title();
        assertEquals("Робототехника для детей в Минске | офлайн ☑", pageTitle);
    }

    @Test
    @Order(15)
    @DisplayName("Ментальная арифметика, по картинке")
    public void img3() {
        var emotional = new pages.e_emotionalIntellect.Body();
        emotional.img3();
        String pageTitle = Selenide.title();
        assertEquals("Робототехника для детей в Минске | офлайн ☑", pageTitle);
    }

    @Test
    @Order(16)
    @DisplayName("Ментальная арифметика, по названию")
    public void learnMoreText3() {
        var emotional = new pages.e_emotionalIntellect.Body();
        emotional.learnMoreText3();
        String pageTitle = Selenide.title();
        assertEquals("Робототехника для детей в Минске | офлайн ☑", pageTitle);
    }
}
