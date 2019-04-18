package com.example.and1_unite2_project;

public class Music {
    public String artist, genre, site, source, title;

    public Music (String artist, String genre, String site, String source, String title) {

        this.artist = artist;
        this.genre = genre;
        this.site = site;
        this.source = source;
        this.title = title;
    }

    public Music() {

    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
