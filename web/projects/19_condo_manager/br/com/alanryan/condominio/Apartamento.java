package br.com.alanryan.condominio;

public class Apartamento {
    public void acessarCozinha() {
        System.out.println("Acessando a cozinha do apartamento.");
    }

    public void cozinhar() {
        acessarCozinha();
        System.out.println("Cozinhando no apartamento.");
    }
}
