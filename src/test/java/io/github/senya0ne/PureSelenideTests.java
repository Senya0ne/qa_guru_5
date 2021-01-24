package io.github.senya0ne;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public class PureSelenideTests {
    private final static String URL = "https://github.com";
    private final static String REPO = "Senya0ne/qa_guru_5";

    @Test
    public void addIssueTest() {
        open(URL);
        $("[href='/login']").click();
        $("#login_field").sendKeys("creds");
        $("#password").sendKeys("creds");
        $("[name='commit']").click();

        $("[name='q']").click();
        $("[name='q']").sendKeys(REPO,Keys.ENTER);

        $(By.linkText(REPO)).click();
        $x("//*[@data-content='Issues']").click();
        $x("//*[@data-hotkey='c']").click();







    }
}
