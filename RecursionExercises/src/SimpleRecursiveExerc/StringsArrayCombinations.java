package SimpleRecursiveExerc;

public class StringsArrayCombinations {
    static String[] arr = {"test", "rock", "fun"};

    public static void main(String[] args) {
        int[] k = new int[2];
        Substrings(k, 0, 0, arr.length);
    }

    static void Substrings(int[] k, int index, int start, int end) {
        if (index >= k.length) {
            System.out.print("(");
            for (int i = 0; i < k.length; i++) {
                System.out.printf("%s", arr[k[i]]);
                if (i != k.length - 1) {
                    System.out.print(" ");
                }else {
                    System.out.print("), ");
                }
            }

        } else {
            for (int i = start; i < end; i++) {
                k[index] = i;
                Substrings(k, index + 1, i + 1, end);
            }
        }
    }
}
