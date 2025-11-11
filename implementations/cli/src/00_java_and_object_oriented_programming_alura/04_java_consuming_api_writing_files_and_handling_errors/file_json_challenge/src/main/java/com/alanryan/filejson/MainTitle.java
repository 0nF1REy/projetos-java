package com.alanryan.filejson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainTitle {
    public static void main(String[] args) {
        Title myTitle = new Title("Inception", "Sci-Fi", 2010);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String json = gson.toJson(myTitle);
        System.out.println("Título em JSON:");
        System.out.println(json);
    }
}
