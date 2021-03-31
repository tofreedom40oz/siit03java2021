package HomeWork.Teme1;
import java.util.Scanner;
public class SmallestNumberOfAnArrayFOR {
    public static void main(String[] args) {
        int n, min;
        Scanner s = new Scanner(System.in);

        System.out.println("Introduceti numarul de elemente care trebuie sa-l contina Array-ul");

        n = s.nextInt();

        int[] arr = new int[n];

        System.out.println("Introduceti elementele:");

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();

        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    min = arr[i];
                    arr[i] = arr[j];
                    arr[j] = min;
                }
            }
        }


        System.out.println("Cel mai mic element din Array este:" + arr[0]);


    }
}
