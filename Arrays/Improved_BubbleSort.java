package Arrays;
public class Improved_BubbleSort {
    public static void main(String[] args){
        int[] arr={2, 7, 9, 5, 24, 11};
        int size= arr.length;

        for(int i=0; i< size-1; i++){
            Boolean swapped=false;
            for(int j=0; j< size-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                    swapped=true;
                }
                
            }
            if(!swapped){
                    break;
                }
        }

        System.out.println("Sorted Array: ");
        for(int i: arr){
            System.out.print(i+", ");
        }

            
        }
}
