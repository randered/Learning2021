package DefineCat;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.setName("Gosho");
        myCat.setColor("Sharen");
        System.out.printf("The cat name is %s and is %s color.\n\r", myCat.getName(), myCat.getColor());
        myCat = new Cat("Pesho", "Zelen");
        System.out.printf("The cat name is %s and is %s color.\n\r", myCat.getName(), myCat.getColor());
        myCat.happyCat();


    }
}
