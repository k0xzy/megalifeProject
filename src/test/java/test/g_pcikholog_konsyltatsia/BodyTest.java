package test.g_pcikholog_konsyltatsia;

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
        open("https://megalife.by/pcikholog_konsyltatsia");
    }

    @Test
    @Order(1)
    @DisplayName("Запись на консультацию 1")
    public void sendUser() {
        var konsyltatsia = new pages.g_pcikholog_konsyltatsia.Body();
        konsyltatsia.sendUser();
    }

    @Test
    @Order(2)
    @DisplayName("Запись на консультацию 2")
    public void sendUser2() {
        var konsyltatsia = new pages.g_pcikholog_konsyltatsia.Body();
        konsyltatsia.sendUser2();
    }
}
