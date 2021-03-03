package Teme2;
import java.util.Scanner;

public class FindDuplicateInString {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if ((ch[i] == ch[j]) && (i != j)) {
                 System.out.println("Duplicate Element : " + ch[j]);
                }

            }
        }
    }
}