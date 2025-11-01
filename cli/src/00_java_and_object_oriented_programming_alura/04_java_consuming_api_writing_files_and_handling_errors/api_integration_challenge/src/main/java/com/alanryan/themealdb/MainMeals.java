package com.alanryan.themealdb;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainMeals {
    public static void main(String[] args) throws IOException, InterruptedException {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite o nome de uma receita:");
            var recipe = input.nextLine().replace(" ", "_");

            var url = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + recipe;
            var client = HttpClient.newHttpClient();
            var request = HttpRequest.newBuilder().uri(URI.create(url)).build();
            var response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Informações da receita:");
            System.out.println(response.body());
        }
    }
}
