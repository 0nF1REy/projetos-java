package com.alanryan.coingecko;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainCrypto {
    public static void main(String[] args) throws IOException, InterruptedException {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite o nome da criptomoeda (ex: bitcoin, ethereum, dogecoin):");
            var crypto = input.nextLine().toLowerCase();

            var url = "https://api.coingecko.com/api/v3/simple/price?ids=" + crypto + "&vs_currencies=brl";
            var client = HttpClient.newHttpClient();
            var request = HttpRequest.newBuilder().uri(URI.create(url)).build();
            var response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Cotação atual em Reais:");
            System.out.println(response.body());
        }
    }
}
