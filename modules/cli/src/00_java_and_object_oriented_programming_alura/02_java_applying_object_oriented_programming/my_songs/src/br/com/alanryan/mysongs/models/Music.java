package br.com.alanryan.mysongs.models;

public class Music extends Audio {
    private String album;
    private String singer;
    private String gender;

    public String getAlbum() {
        return album;
    }

    public String getSinger() {
        return singer;
    }

    public String getGender() {
        return gender;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int getRating() {
        if(this.getTotalPlays() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }
}