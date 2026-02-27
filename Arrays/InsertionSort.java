package Arrays;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr= {4,23,12,7,9};
        int size = arr.length;

        for(int i=1; i< size; i++){
            int insertIndex=i;
            int currentvalue= arr[i];
            int j= i-1;

            while (j>=0 && arr[j]> currentvalue){
                arr[j+1] =arr[j];
                insertIndex= j;
                j--;
            }

            arr[insertIndex] = currentvalue;
        }

        System.out.println("Ordered array:");
        for(int p : arr){
            System.out.print(p + ", ");
        }
    }
}
