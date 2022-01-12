package Eratostheness;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Eratostheness {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 2; i <= 99; i++) {
            numbers.add(i);
        }
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 2; j <= numbers.get(i) / 2; j++) {
                if(numbers.get(i) % j == 0){
                    numbers.set(i,0);
                }
            }
        }
        List<Integer> result = numbers.stream().filter(e -> !Objects.equals(e, 0)).collect(Collectors.toList());
        for (Integer i: result) {
            System.out.printf("%d, ", i);
        }
    }

}
