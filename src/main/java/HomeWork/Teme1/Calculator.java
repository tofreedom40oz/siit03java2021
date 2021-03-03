package Teme1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

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
                    break;
                case '-':
                    System.out.println("Scaderea numerelor este " + (a - b));
                    break;
                case '*':
                    System.out.println("Produsul numerelor este " + (a * b));
                    break;
                case '/':
                    System.out.println("Impartire numerelor este " + (a / b));
                    break;

            }
        }
    }

