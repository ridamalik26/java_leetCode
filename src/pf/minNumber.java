package pf;

import java.util.Scanner;

public class minNumber {
    static void findMin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number 1:");
        int a = sc.nextInt();
        System.out.print("Number 2:");
        int b = sc.nextInt();
        System.out.print("Number 3:");
        int c = sc.nextInt();
        sc.close();

        if (a < b && a < c) {
            System.out.println(a + " minimum");
        } else if (b < a && b < c) {
            System.out.println(b + " minimum");
        } else {
            System.out.println(c + " minimum");
        }
    }

}
