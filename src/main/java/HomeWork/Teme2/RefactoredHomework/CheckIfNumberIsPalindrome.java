package Teme2.RefactoredHomework;
import java.util.Scanner;

public class CheckIfNumberIsPalindrome {
    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceti un numar ");

        if (Palindrome(sc.nextInt())) {
            System.out.println("Numarul este palindrom");
        } else {
            System.out.println("Numarul nu este palindrom");
        }
    }

    public static boolean Palindrome(int n) {
        int tempoNumber1, tempoNumber2, i;
        tempoNumber2 = n;
        tempoNumber1 = 0;
        i = 1;

        while (n != 0) {
            tempoNumber1 = tempoNumber1 + n % 10 * i;
            i = i * 10;

            n = n / 10;
        }

        return tempoNumber2 == tempoNumber1;


    }
}