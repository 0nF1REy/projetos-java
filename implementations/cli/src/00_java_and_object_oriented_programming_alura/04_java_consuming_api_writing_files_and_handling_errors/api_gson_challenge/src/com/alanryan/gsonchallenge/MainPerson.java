package com.alanryan.gsonchallenge;

import com.google.gson.Gson;

public class MainPerson {
    public static void main(String[] args) {
        String json = """
                {"name":"Alan","age":20,"city":"Itapeva"}
                """;

        Gson gson = new Gson();
        Person person = gson.fromJson(json, Person.class);

        System.out.println("Nome: " + person.name());
        System.out.println("Idade: " + person.age());
        System.out.println("Cidade: " + person.city());
    }
}
