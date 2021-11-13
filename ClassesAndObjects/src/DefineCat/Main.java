package DefineCat;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.setName("Gosho");
        myCat.setColor("Sharen");
        Cat myCat2 = new Cat("Pesho", "Zelen");
        myCat.printCat();
        myCat2.printCat();
    }
}
