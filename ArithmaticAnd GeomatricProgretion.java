import java.util.Scanner;

public class ArithmaticPeogre {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Arithmatic Progration:
        System.out.println("Program to Print AP Series: ");
        System.out.println("enter a Value of n, a,d: ");
        int n = sc.nextInt();
        int a = sc.nextInt();
        int d = sc.nextInt();

        int tem = a;
        for (int i = 0; i <= n; i++) {

            System.out.print("  " + tem );
            tem = tem + d;
        }

        // Geometric Progresion:
        System.out.println("\n  ");
        System.out.println("Program to Print GP Series: ");
        System.out.println("enter a Value of g d1 m: ");
        int g = sc.nextInt();
        int d1 = sc.nextInt();
        int m = sc.nextInt();

        int temp = g;
        for (int i = 0; i < m; i++) {
            System.out.print(" " + temp);
            temp = temp * d1;
        }

    }
}
