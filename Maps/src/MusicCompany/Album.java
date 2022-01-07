package MusicCompany;

import java.util.ArrayList;
import java.util.Arrays;

public class Album {
    // Албумите се описват с име, жанр, година на издаване,
    //    брой на продадените копия и списък от песни.

    private String albumName;
    private String genre;
    private String yearOfCreation;
    private long copiesSold;
    private ArrayList<Song> listOfSongs = new ArrayList<Song>();

    public void addSong(Song song) {
        listOfSongs.add(song);
    }

    public void removeSong(Song song) {
        if (listOfSongs.contains(song)) {
            listOfSongs.remove(song);
        } else {
            System.out.println("The song " + song + " doesn't exist");
        }
    }

    public Album(String albumName, String genre, String yearOfCreation, long copiesSold) {
        this.albumName = albumName;
        this.genre = genre;
        this.yearOfCreation = yearOfCreation;
        this.copiesSold = copiesSold;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(String yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public long getCopiesSold() {
        return copiesSold;
    }

    public void setCopiesSold(long copiesSold) {
        this.copiesSold = copiesSold;
    }

    public ArrayList<Song> getListOfSongs() {
        return listOfSongs;
    }

    @Override
    public String toString() {
        return "albumName = " + albumName +
                ", genre= " + genre +
                ", yearOfCreation= " + yearOfCreation +
                ", copiesSold= " + copiesSold +
                ", listOfSongs= " + Arrays.toString(getListOfSongs().toArray());
    }
}
