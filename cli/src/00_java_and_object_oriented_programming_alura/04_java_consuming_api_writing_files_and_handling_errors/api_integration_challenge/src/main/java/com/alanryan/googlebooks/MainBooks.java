package com.alanryan.googlebooks;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainBooks {
    public static void main(String[] args) throws IOException, InterruptedException {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite o título de um livro:");
            var title = input.nextLine().replace(" ", "+");

            var url = "https://www.googleapis.com/books/v1/volumes?q=" + title;
            var client = HttpClient.newHttpClient();
            var request = HttpRequest.newBuilder().uri(URI.create(url)).build();
            var response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Resultado da busca:");
            System.out.println(response.body());
        }
    }
}
