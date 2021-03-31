package HomeWork.Teme1;

import java.util.Scanner;

public class PrintDaysAndMonth {
    public static void main(String[] args) {



                Scanner scanner = new Scanner(System.in);
                System.out.println("Introduceti luna:");
                int month = scanner.nextInt();
                System.out.println("Introduceti anul:");
                int year = scanner.nextInt();
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                    System.out.println("Numarul de zile este 31");
                else if ((month == 2) && (year % 4 == 0) || ((year % 100 == 0) && (year % 400 == 0))) {
                    System.out.println("Numarul de zile este 29");
                } else if (month == 2) {
                    System.out.println("Numarul de zile este 28");
                } else
                    System.out.println("Numarul de zile este 30 ");
            }
        }


