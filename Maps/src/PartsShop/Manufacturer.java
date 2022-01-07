package PartsShop;

public class Manufacturer {
    private String name;
    private String country;
    private String address;
    private String phoneNumber;
    private String fax;

    public Manufacturer(String name,String country,
                        String address, String phoneNumber, String fax) {
        this.name = name;
        this.country = country;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.fax = fax;
    }

    public String getName(){
        return this.name;
    }



    @Override
    public String toString(){
        return this.name + " <"+this.country+ "," + this.address +
                "," + this.phoneNumber + "," + this.fax + ">";
    }
}
