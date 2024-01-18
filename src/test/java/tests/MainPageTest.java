package tests;

import org.junit.jupiter.api.Test;
import ru.cft.team.TestBase;
import ru.cft.team.pages.MainPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MainPageTest extends TestBase {

    @Test
    void mainPageTests() {
        new MainPage().openPage();

        $(".main-header__title-container .main-header__title").shouldHave(text("ИТ как искусство"));

        String expectedTitle = "Работа и мероприятия в компании Центр Финансовых Технологий (ЦФТ)";
        String actualTitle = title();
        assertEquals(expectedTitle, actualTitle);

        $(".header-logo__img.header-logo__img_big").shouldBe(visible);


    }
}
