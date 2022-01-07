package MusicCompany;

import java.util.ArrayList;

public class TestCompany {
    public static void main(String[] args) {
        Song song1 = new Song("AdeleSong1", "3:45");
        Song song2 = new Song("AdeleSong2", "3:50");
        Song song3 = new Song("JayZSong1", "4:54");
        Song song4 = new Song("JayZSong2", "6:45");

        Album adeleAlbum = new Album("19", "Pop", "2012", 450000);
        adeleAlbum.addSong(song1);
        adeleAlbum.addSong(song2);

        Album jayZAlbum = new Album("Trash", "Hip-Hop", "2000", 12500);
        jayZAlbum.addSong(song3);
        jayZAlbum.addSong(song4);

        Singer adele = new Singer("Adele", "the God");
        Singer jayZ = new Singer("Jay-Z", "Trashy");

        adele.addAlbumsToSinger(adeleAlbum);
        jayZ.addAlbumsToSinger(jayZAlbum);

        MusicCompany theGods = new MusicCompany("TGods", "Str. Sezame", "VasilVas");
        theGods.addSingerToCompanyList(adele);
        theGods.addSingerToCompanyList(jayZ);


        System.out.println(theGods);
    }
}
