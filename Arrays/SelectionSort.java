package Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9, 7, 2, 11, 24, 5};
        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

        System.out.println("Sorted Array by selection sort: ");
        for (int p : arr) {
            System.out.print(p + ", ");
        }
    }
}
