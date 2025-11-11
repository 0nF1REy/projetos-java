package br.com.alanryan.lugares;

public class Biblioteca {
    public int livros = 500;
    public String banheiro = "Banheiro público";

    public void mostrarInfo() {
        System.out.println("Livros disponíveis: " + livros);
        System.out.println("Local do banheiro: " + banheiro);
    }
}
