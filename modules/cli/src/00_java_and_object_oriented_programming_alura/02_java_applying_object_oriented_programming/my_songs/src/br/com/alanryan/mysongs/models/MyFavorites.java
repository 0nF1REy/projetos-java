package br.com.alanryan.mysongs.models;

public class MyFavorites {
    public void includes(Audio audio) {
        if(audio.getRating() >= 9) {
            System.out.println(audio.getTitle() + " É considerado sucesso absoluto" +
                    " e preferido por todos!");
        } else {
            System.out.println(audio.getTitle() + " Também é um dos que todo mundo está " +
                    "curtindo");
        }
    }
}