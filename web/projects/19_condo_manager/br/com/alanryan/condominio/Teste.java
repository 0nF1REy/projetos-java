package br.com.alanryan.condominio;

import br.com.alanryan.lugares.Biblioteca;

public class Teste {
    public static void main(String[] args) {
        Piscina piscina = new Piscina();
        Apartamento apartamento = new Apartamento();

        System.out.println("Boia inicial: " + piscina.getBoia());
        piscina.setBoia("Boia nova");
        System.out.println("Boia atualizada: " + piscina.getBoia());

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.mostrarInfo();
    }
}
