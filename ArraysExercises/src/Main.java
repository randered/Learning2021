import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        По зададено число n, да се изведе на екрана таблица по следния начин:
Пример:
 Въведете n: Въведете n: Въведете n: Въведете n:
 1           2           3           4
 0           11          222         3333
             33          444         5555
                         666         7777
                                     9999
         */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = 0;
        if(n==1){
            System.out.println("0");
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((n-1+p));
            }
            System.out.println();
            p+=2;
        }
    }
}
