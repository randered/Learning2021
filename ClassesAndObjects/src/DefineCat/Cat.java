package DefineCat;

public class Cat {
    private String name;
    private String color;

    public Cat() {
        this.name = "Default";
        this.color = "Default";
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public void happyCat(){
        System.out.println("Мъррр :3");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
