public class LinearSearch {

    public static void main(String[] args) {

        int arr[] = {45, 6, 7, 33, 90, 6, 55};
        System.out.println(linearSearch(arr, 99));
        
    }

    static int linearSearch(int[] arr, int target){

        if(arr.length == 0){
            return -1;
        }

        for(int i=0; i< arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
}