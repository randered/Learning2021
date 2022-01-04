package SetsMapsExercises;

import java.util.*;
import java.util.stream.Collectors;

public class SetsTraining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> values = new HashMap<>();
        List<Integer> inputArray = Arrays.stream(scanner.nextLine().split("[, ]+"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        for (Integer e: inputArray) {
            if(values.containsKey(e)){
                values.put(e, values.get(e) + 1);
            }else{
                values.put(e, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : values.entrySet()) {
            if(entry.getValue() % 2 != 0){
                while(inputArray.contains(entry.getKey())){
                    inputArray.remove(entry.getKey());
                }
            }
        }
        System.out.println(Arrays.toString(inputArray.toArray()));
    }


}
