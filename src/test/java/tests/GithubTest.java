package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class GithubTest extends BaseTest {

    @Test
    public void checkJUnit5SampleCode() {
        Selenide.open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-body").$(byText("Soft assertions")).shouldBe(visible).click();
        //*[text()='Or register extension inside test class:']//following-sibling::div
        $(byText("Or register extension inside test class:")).sibling(0)
                .shouldHave(Condition.cssClass("highlight-source-java")).shouldBe(visible);
    }
}
