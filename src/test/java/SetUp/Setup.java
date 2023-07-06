package SetUp;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;

public class Setup {
    public void start() {
        Configuration.headless = true;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-gpu");
        Configuration.browserCapabilities = options;
        Configuration.timeout = 30000; // Устанавливает тайм-аут в 30 секунд
        Configuration.pageLoadTimeout = 60000; // Устанавливает тайм-аут загрузки страницы в 60 секунд
    }
}
