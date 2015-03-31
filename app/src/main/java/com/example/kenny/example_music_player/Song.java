package com.example.kenny.example_music_player;

/**
 * Created by Kenny on 5/02/15.
 */
public class Song {

    private long id;
    private String title;
    private String artist;
    private int nr;

    public Song(long songID, String songTitle, String songArtist, int nrke){
        id=songID;
        title=songTitle;
        artist=songArtist;
        nr = nrke;

    }

    public long getID(){return id;}
    public String getTitle(){return title;}
    public String getArtist(){return artist;}
    public int getLoc(){return nr;}

}
