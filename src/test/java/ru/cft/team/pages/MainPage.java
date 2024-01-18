package ru.cft.team.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.cft.team.constants.constant.*;

public class MainPage {

    private SelenideElement
            logoElement = $(".header-logo__img.header-logo__img_big"),
            titleText = $(".main-header__title-container .main-header__title");

    public MainPage openPage() {
        open("/");
        titleText.shouldHave(text(TITLE_TEXT_CENTER_PAGE));
        return this;
    }

    public MainPage verifyTitle() {
        String actualTitle = title();
        assertEquals(TITLE_MAIN, actualTitle);
        return this;
    }

    public MainPage verifyLogoVisible() {
        logoElement.shouldBe(visible);
        return this;
    }
}
