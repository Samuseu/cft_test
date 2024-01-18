package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.cft.team.TestBase;

import static io.qameta.allure.Allure.step;


public class MainPageTest extends TestBase {

    @Test
    @Story("Открываем сайт и проверяем основные элементы")
    @Feature("Проверка основной страницы")  // feature + story это подход
    @Owner("Vlad Samuseu")
    @Severity(SeverityLevel.MINOR)
    @Link(value = "team.cft.ru",url = "https://team.cft.ru")
    @DisplayName("Проверка основной страницы")
    void mainPageTest() {
        step("Открываем сайт и проверка", () -> mainPage.openPage());
        step("Проверяем title", () -> mainPage.verifyTitle());
        step("Проверяем нахождения лого", () -> mainPage.verifyLogoVisible());
    }

    @Disabled
    @Test
    void mainPageTests() {

        mainPage.openPage()
                .verifyTitle()
                .verifyLogoVisible();


    }
}
