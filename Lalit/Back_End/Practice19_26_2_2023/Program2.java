package Practice19_26_2_2023;

import java.util.Arrays;

public class Program2 {
    public static void main(String[] args) {

        // to separate the even and odd numbers from an array into different arrays
        int [] arr = {23, 6, 89, 6, 45, 54, 22, 3, 12};
        findEvenAndOdd(arr);

    }

    public static void findEvenAndOdd(int [] arr){

        int array_length = arr.length;


        int evenCount = 0;
        int oddCount = 0;
        for(int i = 0; i < array_length; i++){
            if(arr[i] % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Even count : " + evenCount);
        System.out.println("Odd Count : " + oddCount);

        int [] evenElements = new int[array_length];
        int [] oddElements = new int[arr.length];

        for(int i = 0; i < array_length; i++){
            if(arr[i] % 2 == 0){
                evenElements[i] = arr[i];
            }else{
                oddElements[i] = arr[i];
            }
        }

        System.out.println("Even Array : " + Arrays.toString(evenElements));
        System.out.println("Odd Array : " + Arrays.toString(oddElements));
    }
}
