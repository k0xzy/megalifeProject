package test.k_detskij_zimnij_lager;

import SetUp.Setup;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.closeWindow;
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
        open("https://megalife.by/detskij-zimnij-lager");
    }
    @AfterEach
    public void finish() {
        closeWindow();
    }


    @Test
    @Order(1)
    @DisplayName("Покупка 650")
    public void buy650() {
        var winterCamp = new pages.k_detskij_zimnij_lager.Body();
        winterCamp.buy650();
    }

    @Test
    @Order(2)
    @DisplayName("Покупка 850")
    public void buy850() {
        var winterCamp = new pages.k_detskij_zimnij_lager.Body();
        winterCamp.buy850();
    }

    @Test
    @Order(3)
    @DisplayName("Покупка 1050")
    public void buy1050() {
        var winterCamp = new pages.k_detskij_zimnij_lager.Body();
        winterCamp.buy1050();
    }

    @Test
    @Order(4)
    @DisplayName("Скролл")
    public void sendUser() {
        var winterCamp = new pages.k_detskij_zimnij_lager.Body();
        winterCamp.sendUser();
    }

    @Test
    @Order(5)
    @DisplayName("Скролл 2")
    public void sendUser2() {
        var winterCamp = new pages.k_detskij_zimnij_lager.Body();
        winterCamp.sendUser2();
    }

    @Test
    @Order(6)
    @DisplayName("Скролл 3")
    public void sendUser3() {
        var winterCamp = new pages.k_detskij_zimnij_lager.Body();
        winterCamp.sendUser3();
    }
    @Test
    @Order(7)
    @DisplayName("Скролл 4")
    public void sendUser4() {
        var winterCamp = new pages.k_detskij_zimnij_lager.Body();
        winterCamp.sendUser4();
    }
    @Test
    @Order(8)
    @DisplayName("Скролл 5")
    public void sendUser5() {
        var winterCamp = new pages.k_detskij_zimnij_lager.Body();
        winterCamp.sendUser5();
    }
    @Test
    @Order(9)
    @DisplayName("Скролл 6")
    public void sendUser6() {
        var winterCamp = new pages.k_detskij_zimnij_lager.Body();
        winterCamp.sendUser6();
    }
    @Test
    @Order(10)
    @DisplayName("Скролл 7")
    public void sendUser7() {
        var winterCamp = new pages.k_detskij_zimnij_lager.Body();
        winterCamp.sendUser7();
    }
}
