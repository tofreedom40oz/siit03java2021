package Teme2.RefactoredHomework;
import java.util.Scanner;
public class DisplayFactorialNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceti numarul : ");

        System.out.println("Numarul Factorial al numarului introdus este : " + Fact(sc.nextInt()));


    }

    public static long Fact(int x) {
        long factorialSum = 1;

            for (int i = 1; i <= x ;i++) {
                factorialSum = factorialSum * i;
            }
        return factorialSum;
    }



        }





