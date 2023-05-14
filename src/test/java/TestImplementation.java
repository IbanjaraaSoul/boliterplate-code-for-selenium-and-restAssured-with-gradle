import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestImplementation {

    private WebDriver driver;
    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    @Test
    public void verifyGitHubTitle() {
        driver.get("https://www.github.com");
        assertThat(driver.getTitle(), containsString("GitHub"));
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}