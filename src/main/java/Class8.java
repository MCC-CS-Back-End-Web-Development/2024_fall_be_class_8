import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Class8 {
    public static void main(String... args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create("https://v2.jokeapi.dev/joke/Any?safe-mode")).build();

        HttpResponse<String> resp = client.send(request, HttpResponse.BodyHandlers.ofString());
        Joke joke = new Gson().fromJson(resp.body(), Joke.class);

        if(joke.getType().equalsIgnoreCase("single")){
            System.out.println("ONELINER INCOMING:");
            System.out.println(joke.getJoke());
        } else {
            System.out.println(joke.getSetup());
            System.out.println(joke.getDelivery());
        }
    }
}
