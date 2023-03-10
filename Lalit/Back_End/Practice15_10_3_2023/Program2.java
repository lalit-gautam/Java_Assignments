package Practice15_10_3_2023;

import java.util.Arrays;

public class Program2 {
    public static void main(String[] args) {

        // 2. To find the even and odd elements in the array
        int [] arr = {3, 5, 8, 2, 3, 4, 8, 3, 1};
        findOccurrences(arr);

    }

    public static void findOccurrences(int [] arr){

        int even_count = 0;
        int odd_count = 0;
        int even = 0;
        int odd = 0;

       for(int i = 0; i < arr.length; i++){
           if(arr[i] % 2 == 0){
               even_count++;
               even = arr[i];
               System.out.print("Even Elements in the array : ");
               System.out.println(even + "  ");

           }else{
               odd_count++;
               odd = arr[i];
               System.out.print("Odd Elements in the array : ");
               System.out.println(odd + "  ");
           }
       }
        System.out.println("Total Even numbers in the array : " + even_count);

        System.out.println("Total Odd numbers in the array : " + odd_count);
    }
}
