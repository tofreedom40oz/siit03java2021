package HomeWork.Teme2.RefactoredHomework;


public class SmallestNumberOfAnArray {
    public static void main(String[] args) {
        int[] arr = {12, 36, 245, 332, 18, 41};
        System.out.println("   Smallest number is:   " + ArrayMin(arr));
        System.out.println("    Smallest number is:   " + ArrayMinEach(arr));
    }

    public static int ArrayMin(int[] arg) {
        int minim = arg[0];
        for (int i = 1; i < arg.length; i++) {
            if (minim > arg[i]) {
                minim = arg[i];
            }
        }
        return minim;
    }

    public static int ArrayMinEach(int[] arg) {

        int minim = arg[0];
        for  (int num : arg){
            if (minim > num){
                minim=num;
            }
        }
        return minim;
    }
}






