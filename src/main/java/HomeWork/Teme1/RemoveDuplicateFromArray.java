package Teme1;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] nums = {20, 20, 30, 40, 50, 50, 50};
        System.out.println("Lungimea initiala al Array-ului: " + nums.length);
        System.out.print("Elementele Array-ului sunt: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("\nNoua lungime al Array-ului este: " + array_sort(nums));

    }

    public static int array_sort(int[] nums) {
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index - 1])
                nums[index++] = nums[i];
        }
        return index;
    }
}


