package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }


    public boolean addSong(String title, double duration) {
        Song searchSong = findSong(title);
        if (searchSong == null) {
            Song newSong = new Song(title, duration);
            this.songs.add(newSong);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song searchSong = findSong(title);
        if (searchSong != null) {
            playList.add(searchSong);
            return true;
        }
        return false;
    }


    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber -1;
        if (index >= 0 && index <= songs.size()) {
            Song searchedSong = this.songs.get(index);
            playList.add(searchedSong);
            return true;
        }
        System.out.println(trackNumber + " not added");
        return false;
    }



    private Song findSong(String title) {
        for (Song searchSong : this.songs) {
            if (searchSong.getTitle().equals(title)) {
                return searchSong;
            }
        }
        return null;

    }
}


