package test.j_detskij_lager;

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
        open("https://megalife.by/detskij_lager");
    }

    @Test
    @Order(1)
    @DisplayName("Кнопка на форму 1")
    public void sendUser() {
        var childrenCamp = new pages.j_detskij_lager.Body();
        childrenCamp.sendUser();
    }

    @Test
    @Order(2)
    @DisplayName("Кнопка на форму 2")
    public void summer() {
        var childrenCamp = new pages.j_detskij_lager.Body();
        childrenCamp.sendUser2();
    }

    @Test
    @Order(3)
    @DisplayName("Кнопка на форму 3")
    public void spring() {
        var childrenCamp = new pages.j_detskij_lager.Body();
        childrenCamp.sendUser3();
    }

    @Test
    @Order(4)
    @DisplayName("Кнопка на форму 4")
    public void autumn() {
        var childrenCamp = new pages.j_detskij_lager.Body();
        childrenCamp.sendUser4();
    }
}
