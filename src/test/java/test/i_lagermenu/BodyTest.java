package test.i_lagermenu;

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
        open("https://megalife.by/lager-menu");
    }

    @Test
    @Order(1)
    @DisplayName("Ознакомиться")
    public void sendUser() {
        var lagermenu = new pages.i_lagermenu.Body();
        lagermenu.sendUser();
        String searchText = "Отзывы о лагере Megalife";
        String pageTitle = Selenide.title();
        assertEquals(searchText, pageTitle);
    }

    @Test
    @Order(2)
    @DisplayName("Лето")
    public void summer() {
        var lagermenu = new pages.i_lagermenu.Body();
        lagermenu.summer();
        String searchText = "Детский выездной образовательный лагерь Megalife-2023";
        String pageTitle = Selenide.title();
        assertEquals(searchText, pageTitle);
    }

    @Test
    @Order(3)
    @DisplayName("Весна")
    public void spring() {
        var lagermenu = new pages.i_lagermenu.Body();
        lagermenu.spring();
        String searchText = "Детский весенний лагерь MegaLife для детей от 6-15 лет | 2023";
        String pageTitle = Selenide.title();
        assertEquals(searchText, pageTitle);
    }

    @Test
    @Order(4)
    @DisplayName("Осень")
    public void autumn() {
        var lagermenu = new pages.i_lagermenu.Body();
        lagermenu.autumn();
        String searchText = "Лагерь Мегалайф осень 2022";
        String pageTitle = Selenide.title();
        assertEquals(searchText, pageTitle);
    }

    @Test
    @Order(5)
    @DisplayName("Зима")
    public void winter() {
        var lagermenu = new pages.i_lagermenu.Body();
        lagermenu.winter();
        String searchText = "Развивающий Зимний лагерь MegaLife для детей 6-15 лет. 2022-2023";
        String pageTitle = Selenide.title();
        assertEquals(searchText, pageTitle);
    }
}
