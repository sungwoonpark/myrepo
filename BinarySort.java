import java.util.Arrays;

public class BinarySort {

    public static void binarySort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int x = array[i];

            // Find location to insert using binary search
            int j = Math.abs(Arrays.binarySearch(array, 0, i, x) + 1);

            // Shift elements to the right
            System.arraycopy(array, j, array, j + 1, i - j);

            // Place x at correct location
            array[j] = x;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 37, 23, 0, 17, 12, 72, 31, 46, 100, 88, 54 };
        
        System.out.println("Original array: " + Arrays.toString(arr));
        
        binarySort(arr);
        
        System.out.println("Sorted array:   " + Arrays.toString(arr));
        
        // Additional test case
        int[] arr2 = { 5, 2, 9, 1, 5, 6 };
        System.out.println("\nOriginal array 2: " + Arrays.toString(arr2));
        binarySort(arr2);
        System.out.println("Sorted array 2:   " + Arrays.toString(arr2));
    }
}
