package BuildingWithFloors;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the number of Floors: ");
        int numberOfFloors = scanner.nextInt();
        System.out.print("Please Enter the number of Estates per Floor: ");
        int estatesPerFloor = scanner.nextInt();

        for (int floor = numberOfFloors; floor >= 1; floor--) { // Creating floors from bottom to top
            for (int estates = 1; estates <= estatesPerFloor; estates++) {
                String typeOfEstate = "A";
                if (floor % 2 == 0) typeOfEstate = "O";
                if (floor == numberOfFloors) typeOfEstate = "L";
                System.out.print(typeOfEstate + floor + estates + " ");
            }
            System.out.println();
        }
    }
}
