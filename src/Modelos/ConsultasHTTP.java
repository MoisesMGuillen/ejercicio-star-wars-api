package Modelos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultasHTTP {
    private HttpClient client;
    private HttpRequest request;
    HttpResponse<String> response;

    public ConsultasHTTP(String dir){
        client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://swapi.dev/api/films/"+dir+"/"))
                .build();
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String recibirJson(){
        return response.body();
    }
}