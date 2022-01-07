package MusicCompany;

import java.util.ArrayList;
import java.util.Arrays;

public class MusicCompany {
    /*
    Фирма планира създаване на система за управление на звукозаписна компания. Звукозаписната компания има име, адрес, собственик и
    изпълнители. Всеки изпълнител има име, псевдоним и създадени албуми. Албумите се описват с име, жанр, година на издаване,
    брой на продадените копия и списък от песни. Песните, от своя страна се описват с име и времетраене. Да се проектира съвкупност
    от класове с връзки между тях,
    които моделират данните за звукозаписната компания. Да се реализира тестов клас, който демонстрира работата на всички останали класове.
     */

    //  Звукозаписната компания има име, адрес, собственик и изпълнители.
    private String companyName;
    private String companyAddress;
    private String ownerName;
    private ArrayList<Singer> singersList = new ArrayList<Singer>();

    public MusicCompany(String companyName, String companyAddress, String ownerName) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.ownerName = ownerName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public ArrayList<Singer> getSingersList() {
        return singersList;
    }

    public void addSingerToCompanyList(Singer singer){
        if(singer !=null){
            singersList.add(singer);
        }else{
            System.out.println("Invalid Singer");
        }
    }

    @Override
    public String toString() {
        return "Company Name = " + companyName  +
                ", companyAddress = " + companyAddress + ',' +
                " ownerName:  " + ownerName + System.lineSeparator() +
                "singersList: " + System.lineSeparator() + Arrays.toString(getSingersList().toArray()).replace('[',' ').replace(']', ' ');
    }
}
