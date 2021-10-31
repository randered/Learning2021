package SumOfTwoNumbersEqualToZero;

import java.util.LinkedList;
import java.util.List;

public class SumOfTwoNumsEqualsToZero {

    /*
    7.    Дадени са няколко цели числа. Напишете програма,
    която намира онези подмножества от тях, които имат сума 0.
    Примери:
-     Ако са дадени числата {-2, -1, 1}, сумата на -1 и 1 е 0.
-     Ако са дадени числата {3, 1, -7}, няма подмножества със сума 0.
-     Lets Imagine all numbers will be unique.
     */

    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(-5);
        numbers.add(3);
        numbers.add(4);
        numbers.add(6);
        numbers.add(-6);
        numbers.add(-1);

        boolean sumNotFound = true;
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 1; j < numbers.size(); j++) {
                if (numbers.get(i) + numbers.get(j) == 0) {
                    System.out.printf("Сумата на %d и %d e 0\n", numbers.get(i), numbers.get(j));
                    numbers.remove(i);
                    sumNotFound = false;
                    break;
                }
            }
        }
        if(sumNotFound){
            System.out.println("Няма подмножества със сума 0.");
        }
    }
}
