import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,a = 0,b = 1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Fibonacci serisi için eleman sayısını girin: ");
         n = scan.nextInt();

         for (int i = 0 ; i < n ; i++) {
             System.out.print(a + " ");


             b = a + b;
             a = b - a;
         }






    }
}