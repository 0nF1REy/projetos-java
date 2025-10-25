package br.com.alanryan.mysongs.models;

public class Podcast extends Audio {
    private String presenter;
    private String description;

    public String getPresenter() {
        return presenter;
    }

    public String getDescription() {
        return description;
    }

    public void setPresenter(String presenter) {
        this.presenter = presenter;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getRating() {
        if(this.getTotalLikes() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}