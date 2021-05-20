package com.fresco;

import com.fresco.model.Artist;
import com.fresco.model.DataSource;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        DataSource datasource = new DataSource();
        if(!datasource.open()) {
            System.out.println("Can't open datasource");
        }

        List<Artist> artists = datasource.queryArtists();
        if(artists == null) {
            System.out.println("No artists!");
            return;
        }

        for(Artist artist : artists) {
            System.out.println("ID = " + artist.getId() + ", Name = " + artist.getName());
        }

        datasource.close();
    }
}