import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

public class ExampleTest {
    @Test
    public void testStatusCode() {
        RestAssured
                .given()
                .when()
                .get("https://httpstat.us/500")
                .then()
                .statusCode(510);
    }
}
