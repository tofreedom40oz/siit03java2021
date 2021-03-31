package HomeWork.Teme1;
import java.util.Scanner;

public class CalculatorIFELSE {


        public static void main(String... args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti numerele: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int r;
            char s;
            System.out.println("Introduceti operatia: ");
            Scanner sc = new Scanner(System.in);
            s = sc.nextLine().charAt(0);
            if (s == '+') {


                r = a + b;
                System.out.println(a + " " + s + " " + b + "= " + " " + r);
            } else if (s == '-') {
                r = a - b;
                System.out.println(a + " " + s + " " + b + "= " + " " + r);
            } else if (s == '/') {
                r = a / b;
                System.out.println(a + " " + s + " " + b + "= " + " " + r);
            } else if (s == '*') {
                r = a * b;
                System.out.println(a + " " + s + " " + b + "= " + " " + r);

            } else

                System.out.println("Re-try");
        }

    }