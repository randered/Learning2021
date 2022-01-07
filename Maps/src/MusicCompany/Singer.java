package MusicCompany;

import java.util.ArrayList;
import java.util.Arrays;

public class Singer {
    // Всеки изпълнител има име, псевдоним и създадени албуми.
    private String singerName;
    private String singerNickname;
    private ArrayList<Album> listOfAlbums = new ArrayList<Album>();

    public Singer(String singerName, String singerNickname) {
        this.singerName = singerName;
        this.singerNickname = singerNickname;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getSingerNickname() {
        return singerNickname;
    }

    public void setSingerNickname(String singerNickname) {
        this.singerNickname = singerNickname;
    }

    public ArrayList<Album> getListOfAlbums() {
        return listOfAlbums;
    }

    public void addAlbumsToSinger(Album album){
        if(album != null){
            listOfAlbums.add(album);
        }else{
            System.out.println("Invalid input");
        }
    }

    @Override
    public String toString() {
        return "Singer Name = " + singerName +
                ", singerNickname = " + singerNickname +
                ",listOfAlbums = " + Arrays.toString(getListOfAlbums().toArray())
                + System.lineSeparator();
    }
}
