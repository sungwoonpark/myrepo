public class QuickSort {

    public static void sort(int[] arr, int low, int high) {
        // [버그 1] 재귀 호출의 종료 조건이 잘못되었습니다.
        if (low <= high) {
            int pivotIndex = partition(arr, low, high);

            sort(arr, low, pivotIndex - 1);
            sort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // [버그 2] 오름차순 정렬을 위한 비교 연산자가 잘못되었습니다.
            if (arr[j] > pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}