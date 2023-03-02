
import java.util.Arrays;

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

