package ReadNumbers;

import java.util.Scanner;

public abstract class ReadNumber {
    private static final Scanner scan = new Scanner(System.in);
    static void ReadTenNumbers(int start, int end) throws InvalidNumber {
        int count = 1;
        int number;

        do {
            System.out.printf("Enter the %dth number:", count);
            number = scan.nextInt();
            if(number>=start && number<=end){
                System.out.println(number);;
                count++;
            }else{
                throw new InvalidNumber("Invalid Number Entered");
            }
        }while (count<11);
    }
}
