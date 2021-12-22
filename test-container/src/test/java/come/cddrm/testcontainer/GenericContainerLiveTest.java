// https://www.baeldung.com/docker-test-containers

package come.cddrm.testcontainer;

import org.junit.ClassRule;
import org.junit.Test;
import org.testcontainers.containers.GenericContainer;
import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GenericContainerLiveTest {

    @ClassRule
    public static GenericContainer simpleWebServer =
            new GenericContainer("alpine:3.2")
                    .withExposedPorts(80)
                    .withCommand("/bin/sh", "-c", "while true; do "
                            + "echo \"HTTP/1.1 200 OK\n\nHello World!\" "
                            + "| nc -l -p 80; done");  // netcat command

    @Test
    public void simpleWebServerShouldStartAndRespond() throws Exception {
        String address = "http://"
                + simpleWebServer.getContainerIpAddress()
                + ":" + simpleWebServer.getMappedPort(80);

        String response = simpleGetRequest(address);

        assertEquals(response, "Hello World!");
    }

    private String simpleGetRequest(String address) throws Exception {
        URL url = new URL(address);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));

        String inputLine;
        StringBuffer content = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }

        in.close();

        return content.toString();
    }

}
