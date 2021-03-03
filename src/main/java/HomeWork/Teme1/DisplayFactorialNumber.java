package Teme1;
import java.util.Scanner;

public class DisplayFactorialNumber {


    public static void main(String[] args) {

                long n, c, f = 1;
                System.out.println("Introdu numarul: ");
                Scanner in = new Scanner(System.in);

                n = in.nextInt();

                if (n < 0)
                    System.out.println("Numarul nu poate fi negativ.");
                else {
                    for (c = 1; c <= n; c++)
                        f = f * c;

                    System.out.println("Numarul factorial al lui " + n + " este = " + f);
                }
            }
        }







