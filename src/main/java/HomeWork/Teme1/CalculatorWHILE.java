package Teme1;


import java.util.Scanner;

public class CalculatorWHILE {
    public static void main(String[] args) {

        {
            int a, b;
            char s;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti numerele: ");
            a = scanner.nextInt();
            b = scanner.nextInt();


            System.out.println("Introduceti operatia: ");
            s = scanner.next().charAt(0);
            switch (s) {
                case '+':
                    System.out.println("Suma numerelor este " + (a + b));
                case '-':
                    System.out.println("Suma numerelor este " + (a - b));
                case '*':
                    System.out.println("Suma numerelor este " + (a * b));
                case '/':
                    System.out.println("Suma numerelor este " + (a / b));

            }
        }
        }
    }
