package Teme1;
import java.util.Scanner;
public class CheckIfNumberIsPalindrome {

    public static void main(String[] args) {
        String original;
        StringBuilder reverse = new StringBuilder();
        Scanner in = new Scanner(System.in);
        System.out.println("Introdu numarul: ");
        original = in.nextLine();
        int length = original.length();
        for (int i = length - 1; i >= 0; i--)
            reverse.append(original.charAt(i));
        if (original.equals(reverse.toString()))
            System.out.println("Numarul introdus este un palindrom.");
        else
            System.out.println("Numarul introdus nu este un palindrom.");
    }


}