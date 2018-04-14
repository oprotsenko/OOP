package com.oprotsen.JavaOOP.lesson3.musicApp;

import java.util.ArrayList;

public class Playlist {
    private final String title;
    private final ArrayList<Song> songs = new ArrayList<>();

    public Playlist(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public long getTotalLength() {
        long totalLength = 0;
        for (Song elem: songs) {
            totalLength += elem.getLength();
        }
        return totalLength;
    }

    public ArrayList<Song> findByTitlePart(String title) {
        ArrayList<Song> songsByTitle = new ArrayList<>();
        for (Song elem: songs) {
            if (elem.getTitle().contains(title))
                songsByTitle.add(elem);
        }
        return songsByTitle;
    }

    public ArrayList<Song> findByAuthor(String author) {
        ArrayList<Song> songsByAuthor = new ArrayList<>();
        for (Song elem: songs) {
            if (elem.getAuthor().equalsIgnoreCase(author))
                songsByAuthor.add(elem);
        }
        return songsByAuthor;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "title='" + title + '\'' +
                ", songs=" + songs +
                '}';
    }
}
