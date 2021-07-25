package tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class GithubTest extends BaseTest {

    @Test
    public void checkJUnit5SampleCode(){
        Selenide.open("https://github.com/");

    }
}
