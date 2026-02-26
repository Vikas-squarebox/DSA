package Arrays;

public class BubbleSort{
    public static void main(String[] args){
        int[] arr={9,7,2,11,24,5};
        int size= arr.length;

        for(int i=0; i< size-1; i++){
            for(int j=0; j< size-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }

        System.out.println("Sorted Array: ");
        for(int i: arr){
            System.out.print(i+", ");
        }

            
        }
}