package Teme2.RefactoredHomework;
import java.util.*;
public class DaysAndMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nintroduceti anul:");
        int year = sc.nextInt();
        System.out.println("\nintroduceti luna:");
        int month = sc.nextInt();
        System.out.println(display(year, month));
    }
    public static String display(int year, int month) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        int DAY_OF_MONTH = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        return ("\nNumarul de zile este:" + " " +DAY_OF_MONTH);
    }
}