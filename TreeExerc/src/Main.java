import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = "welcometojava";
        int k = 3;

        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int count = 0;
        while(count < s.length()-k) {
            String substring = s.substring(count, count + k);
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
            if (substring.compareTo(largest) > 0){
                largest = substring;
            }
            count++;
        }
        return smallest + "\n" + largest;
    }
}

