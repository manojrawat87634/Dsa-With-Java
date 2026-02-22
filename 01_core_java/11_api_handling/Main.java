import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

    public static void main(String[] args) throws Exception {

        String url = "https://munnapassword.pythonanywhere.com/contact/";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            System.out.println("HTTP Error: " + response.statusCode());
            return;
        }

        String body = response.body().trim();

        // Remove starting [ and ending ]
        body = body.substring(1, body.length() - 1);

        // Split objects
        String[] objects = body.split("\\},\\{");

        for (String obj : objects) {

            obj = obj.replace("{", "").replace("}", "");

            String[] pairs = obj.split(",");

            System.out.println("---- Contact ----");

            for (String pair : pairs) {
                String[] keyValue = pair.split(":");

                String key = keyValue[0].replace("\"", "").trim();
                String value = keyValue[1].replace("\"", "").trim();

                System.out.println(key + " : " + value);
            }
        }
    }
}