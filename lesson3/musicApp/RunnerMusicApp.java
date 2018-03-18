package com.oprotsen.JavaOOP.lesson3.musicApp;

import com.oprotsen.JavaOOP.lesson3.musicApp.AudioContent;
import com.oprotsen.JavaOOP.lesson3.musicApp.Playlist;
import com.oprotsen.JavaOOP.lesson3.musicApp.Song;

public class RunnerMusicApp {
    public static void main(String[] args) {
        byte[] b = {1};
        Playlist myFavorite = new Playlist("My favorite");
        myFavorite.addSong(new Song(
                "Love&Hate", "Michael Kiwanuka", "POP", 8, new AudioContent(b)));
        myFavorite.addSong(new Song(
                "One more night", "Michael Kiwanuka", "POP", 4, new AudioContent(b)));
        myFavorite.addSong(new Song(
                "All those men", "Miss Li", "POP", 5, new AudioContent(b)));
        myFavorite.addSong(new Song(
                "Wonderful life", "HURTS", "POP", 6, new AudioContent(b)));
        myFavorite.addSong(new Song(
                "Somebody that I used to know", "GOTYE", "POP", 8, new AudioContent(b)));

        System.out.println(myFavorite.findByAuthor("Michael Kiwanuka"));
        System.out.println(myFavorite.findByTitlePart("men"));
    }
}
