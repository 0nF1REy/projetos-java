package com.alanryan.gsonchallenge;

import com.google.gson.Gson;

public class MainBook {
    public static void main(String[] args) {
        String json = """
                {
                    "title": "Effective Java",
                    "author": "Joshua Bloch",
                    "publisher": {
                        "name": "Addison-Wesley",
                        "country": "USA"
                    }
                }
                """;

        Gson gson = new Gson();
        Book book = gson.fromJson(json, Book.class);

        System.out.println("Título: " + book.title());
        System.out.println("Autor: " + book.author());
        System.out.println("Editora: " + book.publisher().name());
        System.out.println("País da editora: " + book.publisher().country());
    }
}
