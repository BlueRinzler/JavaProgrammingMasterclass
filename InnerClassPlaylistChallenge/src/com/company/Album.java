package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private SongList songs;


    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }


    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song(title, duration));
    }



    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = this.songs.findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        return false;
    }


    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song checkedSong = this.songs.findSong(trackNumber);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println(trackNumber + " not added");
        return false;
    }



//    private Song findSong(String title) {
//        for (SongList searchSong : this.songs) {
//            if (searchSong.getTitle().equals(title)) {
//                return searchSong;
//            }
//        }
//        return null;
//
//    }

    private class SongList {

        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            } else {
                this.songs.add(song);
                return true;
            }
        }

        private Song findSong(String title) {
            for (Song searchSong : this.songs) {
                if (searchSong.getTitle().equals(title)) {
                    return searchSong;
                }
            }
            return null;

        }

        public Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if (index >= 0 && index <= songs.size()) {
                Song searchedSong = this.songs.get(index);
                return searchedSong;
            }
            return null;
        }
    }
}

