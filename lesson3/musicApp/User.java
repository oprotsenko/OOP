package com.oprotsen.JavaOOP.lesson3.musicApp;

import com.oprotsen.JavaOOP.lesson3.musicApp.Playlist;
import com.oprotsen.JavaOOP.lesson3.musicApp.Song;

import java.util.ArrayList;

public class User {
    private final String name;
    private final ArrayList<Playlist> playlists = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Playlist createPlaylist(String name) {
        return new Playlist(name);
    }

    public Playlist findByTitle(String title) {
        for (Playlist elem: playlists) {
            if (elem.getTitle().equalsIgnoreCase(title))
                return elem;
        }
        return null;
    }

    public void addSongToPlaylist(String name, Song song) {
        findByTitle(name).addSong(song);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", playlists=" + playlists +
                '}';
    }
}
