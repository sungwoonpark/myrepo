public class Main {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 1, 9, 3, 6, 4, 8};
        
        System.out.println("정렬 전: " + java.util.Arrays.toString(arr));
        
        // QuickSort 클래스의 메서드 호출
        QuickSort.sort(arr, 0, arr.length - 1);
        
        System.out.println("정렬 후: " + java.util.Arrays.toString(arr));
    }
}