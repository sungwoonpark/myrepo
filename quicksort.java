import java.util.Arrays;

public class quicksort {
    
    // Main method to test the QuickSort implementation
    public static void main(String[] args) {
        int[] data = { 8, 7, 2, 1, 0, 9, 6 };
        System.out.println("Unsorted Array: " + Arrays.toString(data));

        int size = data.length;
        quicksort.quickSort(data, 0, size - 1);

        System.out.println("Sorted Array: " + Arrays.toString(data));
        
        // Additional test case
        int[] data2 = { 10, 80, 30, 90, 40, 50, 70 };
        System.out.println("\nUnsorted Array 2: " + Arrays.toString(data2));
        quicksort.quickSort(data2, 0, data2.length - 1);
        System.out.println("Sorted Array 2: " + Arrays.toString(data2));
    }

    // Method to implement QuickSort
    static void quickSort(int array[], int low, int high) {
        if (low < high) {
            // find pivot element such that
            // elements smaller than pivot are on left
            // elements greater than pivot are on right
            int pi = partition(array, low, high);
            
            // recursive call on the left of pivot
            quickSort(array, low, pi - 1);

            // recursive call on the right of pivot
            quickSort(array, pi + 1, high);
        }
    }

    // Method to partition the array on the basis of pivot element
    static int partition(int array[], int low, int high) {
        // select the rightmost element as pivot
        int pivot = array[high];
        
        // pointer for greater element
        int i = (low - 1);

        // traverse each element of the array
        // compare them with the pivot
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                // if element smaller than pivot is found
                // swap it with the greater element pointed by i
                i++;

                // swap element at i with element at j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // swap the pivot element with the greater element at i
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // return the partition point
        return (i + 1);
    }
}
