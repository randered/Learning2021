package SimpleEx;

public class SimpleExercises {
    public static void main(String[] args) {

        String name = "Vasko";
        Greeting(name);

        int firstNumber = 4;
        int secondNumber = 6;
        int thirdNumber = 8;
        System.out.println(GetMax(firstNumber, GetMax(secondNumber,thirdNumber)));

    }
    //1 Zadacha
    static void Greeting(String name){
        System.out.printf("Hello, %s!\n", name);
    }

    //2 Zadacha

    static int GetMax(int first, int second){
        return Math.max(first, second);
    }
}
