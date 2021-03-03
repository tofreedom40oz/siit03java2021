package Teme2.RefactoredHomework;

public class CheckIfArrayIsSquare {
        public static void main(String[] Args) {

            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            if (isSquare(matrix)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }

        public static boolean isSquare(int[][] arr) {
            int arrayLength = arr[0].length;
            for (int[] a : arr) {
                if (a.length != arrayLength) {
                    return false;
                }
            }

            return true;
        }
    }
