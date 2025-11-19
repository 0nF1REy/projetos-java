package br.com.alanryan.screen_match.main;

import br.com.alanryan.screen_match.exception.YearConversionException;
import br.com.alanryan.screen_match.models.Title;
import br.com.alanryan.screen_match.models.TitleOmdb;
import br.com.alanryan.screen_match.utils.Utils;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {

        try (Scanner reading = new Scanner(System.in)) {

            String search = "";

            List<Title> titles = new ArrayList<>();

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .setPrettyPrinting()
                    .create();

            while(!search.equalsIgnoreCase("sair")) {

                Utils.print("Digite um filme para busca: ");
                search = reading.nextLine();

                if(search.equalsIgnoreCase("sair")) {
                    break;
                }

                String address = "https://www.omdbapi.com/?t=" + search.replace(" ", "+") + "&apikey=d316c8a0";

                try {

                    HttpClient client = HttpClient.newHttpClient();

                    HttpRequest request = HttpRequest.newBuilder()
                            .uri(URI.create(address))
                            .build();

                    HttpResponse<String> response = client
                            .send(request, HttpResponse.BodyHandlers.ofString());

                    String json = response.body();
                    Utils.print(json);

                    TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);
                    Utils.print(myTitleOmdb);

                    Title myTitle = new Title(myTitleOmdb);
                    Utils.print("Título já convertido");
                    Utils.print(myTitle);

                    titles.add(myTitle);

                } catch (NumberFormatException e) {
                    Utils.print("Aconteceu um erro: ");
                    Utils.print(e.getMessage());
                } catch (IllegalArgumentException e) {
                    Utils.print("Algum erro de argumento na busca, verifique o endereço");
                } catch (YearConversionException e) {
                    Utils.print(e.getMessage());
                }
            }

            Utils.print(titles);

            FileWriter writing = new FileWriter("movies.json");
            writing.write(gson.toJson(titles));
            writing.close();

            Utils.print("O programa finalizou corretamente!");
        }
    }
}
