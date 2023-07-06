package test.h_metodichki;

import SetUp.Setup;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.open;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BodyTest {

    @BeforeAll
    public static void setup() {
        var setups = new Setup();
        setups.start();
    }

    @BeforeEach
    public void start() {
        open("https://megalife.by/metodichki");
    }

    @Test
    @Order(1)
    @DisplayName("Покупка 100")
    public void buy100() {
        var metodichki = new pages.h_metodichki.Body();
        metodichki.buy100();
    }

    @Test
    @Order(2)
    @DisplayName("Покупка 30")
    public void buy30() {
        var metodichki = new pages.h_metodichki.Body();
        metodichki.buy30();
    }

    @Test
    @Order(3)
    @DisplayName("Покупка 50")
    public void buy50() {
        var metodichki = new pages.h_metodichki.Body();
        metodichki.buy50();
    }

    @Test
    @Order(4)
    @DisplayName("Скролл к форме")
    public void sendUser() {
        var metodichki = new pages.h_metodichki.Body();
        metodichki.sendUser();
    }

    @Test
    @Order(5)
    @DisplayName("Скролл к форме 2")
    public void sendUser2() {
        var metodichki = new pages.h_metodichki.Body();
        metodichki.sendUser2();
    }

    @Test
    @Order(6)
    @DisplayName("Скролл к вопросам")
    public void sendUser3() {
        var metodichki = new pages.h_metodichki.Body();
        metodichki.sendUser3();
    }


}
