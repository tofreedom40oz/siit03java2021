package Teme2.RefactoredHomework;
import java.util.Scanner;
public class MaxDigit {
    public static void main(String[] args) {
       long input;
         Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul:");
        input = sc.nextInt();
         System.out.println("Cifra maxima al numarului" +"  "+ input + "  " + "este" + "  " + MaximDigitReturn(input));
    }

    public static int MaximDigitReturn(long number) {
        long max = 0;
        while (number != 0) {
            if (max < number % 10) {
                max = (number % 10);
            }
            number = number / 10;
        }
        return (int) max;

    }
}