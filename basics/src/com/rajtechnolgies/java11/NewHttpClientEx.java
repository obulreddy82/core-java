package com.rajtechnolgies.java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class NewHttpClientEx {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client=HttpClient.newHttpClient();
        HttpRequest request=HttpRequest.newBuilder()
                .uri(URI.create("https://example.com"))
                .GET()
                .build();
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.statusCode());
        System.out.println(response.body());

        //Java 11's HTTP client also supports POST.

        HttpRequest postRequest=HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:9090/api/books/findAll"))
                .header("Content-Type", "application/json")
                .GET()
                .build();

        HttpResponse<String> postResponse1 = client.send(postRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println(postResponse1.statusCode());
        System.out.println(postResponse1.body());

    }
}
