package br.com.alanryan.screen_match.main;

import br.com.alanryan.screen_match.models.Title;
import br.com.alanryan.screen_match.models.TitleOmdb;
import br.com.alanryan.screen_match.utils.Utils;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {

        try (Scanner reading = new Scanner(System.in)) {
            Utils.print("Digite um filme para busca: ");
            var search = reading.nextLine();

            String address = "https://www.omdbapi.com/?t=" + search + "&apikey=d316c8a0";

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(address))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            Utils.print(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();

            TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);
            Utils.print(myTitleOmdb);

            Title myTitle = new Title(myTitleOmdb);
            Utils.print("Título já convertido");
            Utils.print(myTitle);
        }
    }
}
