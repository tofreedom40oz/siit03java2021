package HomeWork.Teme1;

public class CheckIfArrayIsSquare {

    public static void main(String... args) {

            int[][] m = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };
              CheckIfArrayIsSquare.checkSquareMatrix(m);

        }

        public static void checkSquareMatrix ( int[][] m){
            int matrixLength = m.length;
            if (matrixLength == 0) {
                System.out.println("False");
            }
            boolean isSquare = true;
            for (int i = 0; i <= matrixLength - 1; i++) {
                if (m[i].length != matrixLength) {
                    isSquare = false;
                    break;
                }
            }
            if (isSquare) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }


        }
    }

