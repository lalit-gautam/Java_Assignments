package Practice17_12_3_2023;

public class Program2 {
    public static void main(String[] args) {

        // program to find the sum of all digits
        int [] arr = {2, 3, 4, 6, 6, 8};
        sumOfAllDigits(arr);
    }


    public static void sumOfAllDigits(int [] arr){

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            count = count + arr[i];
        }
        System.out.println("Total count : " +count);
    }
}
