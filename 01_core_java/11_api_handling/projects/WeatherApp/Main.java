package projects.WeatherApp;

// import java.net.URI;
// import java.net.http.HttpClient;
// import java.net.http.HttpRequest;
// import java.net.http.HttpResponse;

// import com.fasterxml.jackson.databind.ObjectMapper;

// public class WeatherService {    
//     private static final String API_KEY = "731c3ed21d92e93eff6cc1c0aec0e6fc";
//     private final HttpClient client = HttpClient.newHttpClient();
//     private final ObjectMapper mapper = new ObjectMapper();

//     public WeatherResponse getWeather(String city) throws Exception {

//         String url = "https://api.openweathermap.org/data/2.5/weather?q="
//                 + city + "&appid=" + API_KEY + "&units=metric";

//         HttpRequest request = HttpRequest.newBuilder()
//                 .uri(URI.create(url))
//                 .GET()
//                 .build();

//         HttpResponse<String> response =
//                 client.send(request, HttpResponse.BodyHandlers.ofString());

//         if (response.statusCode() != 200) {
//             throw new RuntimeException("HTTP Error: " + response.statusCode());
//         }

//         return mapper.readValue(response.body(), WeatherResponse.class);
//     }
// }
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    private static final String API_KEY = "731c3ed21d92e93eff6cc1c0aec0e6fc";
    public static void main(String[] args) throws Exception {
        // 1. Define the target URL
        System.out.print("Enter City : ");
        Scanner sc = new Scanner(System.in);
        String city = sc.next();
           String url = "https://api.openweathermap.org/data/2.5/weather?q="
                + city + "&appid=" + API_KEY + "&units=metric";// Replace with your API endpoint
        sc.close();
        // 2. Create an HttpClient instance
        HttpClient client = HttpClient.newHttpClient();

        // 3. Build the HttpRequest object (GET is the default method)
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET() // Explicitly sets the request method to GET
                .build();

        // 4. Send the request and receive the response synchronously
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // 5. Process the response
        System.out.println("Status Code: " + response.statusCode());
        System.out.println("Response Body: " + response.body());
    }
}
