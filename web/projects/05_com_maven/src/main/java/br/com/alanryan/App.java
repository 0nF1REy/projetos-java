package br.com.alanryan;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) throws Exception {
        var pessoa = new Pessoa("Alan", 20);

        Gson gson = new Gson();
        String json = gson.toJson(pessoa);

        System.out.println("JSON: " + json);
    }
}

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}