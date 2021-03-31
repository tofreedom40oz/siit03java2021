package HomeWork.Teme1;

import java.util.Scanner;
public class MaxDigit {

    public static void main(String[] args) {

        long r, n, ld = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul :");
        n = sc.nextInt();

        while (n > 0) {
            r = n % 10;
            if (ld < r) {
                ld = r;
            }
            n = n / 10;
        }

        System.out.println("\n Cifra maxima a numarului este :" + ld);

    }
}
