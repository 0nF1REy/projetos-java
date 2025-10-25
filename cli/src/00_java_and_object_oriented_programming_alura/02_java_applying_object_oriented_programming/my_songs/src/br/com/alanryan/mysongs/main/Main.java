package br.com.alanryan.mysongs.main;

import br.com.alanryan.mysongs.models.Music;
import br.com.alanryan.mysongs.models.Podcast;
import br.com.alanryan.mysongs.models.MyFavorites;

public class Main {
    public static void main(String[] args) {
        Music myMusic = new Music();
        myMusic.setTitle("Forever");
        myMusic.setSinger("Kiss");

        for (int i = 0; i < 1000; i++) {
            myMusic.reproduce();
        }

        for (int i = 0; i < 50; i++) {
            myMusic.like();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("BolhaDev");
        myPodcast.setPresenter("Alan Ryan");

        for (int i = 0; i < 5000; i++) {
            myPodcast.reproduce();
        }

        for (int i = 0; i < 1000; i++) {
            myPodcast.like();
        }

        MyFavorites favorites = new MyFavorites();
        favorites.includes(myPodcast);
        favorites.includes(myMusic);
    }
}
