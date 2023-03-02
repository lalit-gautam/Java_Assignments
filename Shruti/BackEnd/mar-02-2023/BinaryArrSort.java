
import java.util.Arrays;

//A binary array is an array consisting of only Os and 1s.
//You are given a binary array "arr" of size 'N'. Your task is to sort the given array and return this array after sorting.

public class BinaryArrSort {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 0, 0};
        sorting(arr);
        System.out.println(Arrays.toString(arr));

    } 
    static void sorting(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {
      
            for (int j =  i + 1; j > 0 ; j--) {
                if(arr[j - 1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp; 
                } else {
                    break;
                }
                
            }
            
        } 
        
    }
   
}

