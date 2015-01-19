package nonjunitwmtest;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.junit.Rule;
import org.junit.Test;

/**
 *
 */
public class wmtest {

    @Rule
    public WireMockRule wireMockRule = new WireMockRule();

    @Test
    public void testRun()
    {
        while(true) {
            wireMockRule.stubFor(get(urlEqualTo("/api/hello"))
                    .willReturn(aResponse()
                            .withHeader("Content-Type", "text/plain")
                            .withBody("Hello world!")));
        }
    }
}
