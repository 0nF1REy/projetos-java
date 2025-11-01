package com.alanryan.exceptionchallenge;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainGitHub {
    public static void main(String[] args) throws IOException, InterruptedException {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite o nome de usuário do GitHub:");
            String username = input.nextLine();

            String url = "https://api.github.com/users/" + username;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new GitHubQueryException("Usuário não encontrado no GitHub!");
            }

            System.out.println("Informações do usuário:");
            System.out.println(response.body());
        } catch (GitHubQueryException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
