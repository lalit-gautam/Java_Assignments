package Practice_32_25_3_2023;

public class Program2 {
    public static void main(String[] args) {

        // Java program to find all pairs of elements in an array whose sum is equal to a specified number.
        int [] arr = {2, 4, 90, 78, 6, 6};
        specifiedNumber(arr, 12);
        specifiedNumber(arr, 99);
    }

    public static void specifiedNumber(int [] arr, int num){

        boolean flag = false;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == num){
                    System.out.println(arr[i] + "  +  "  + arr[j] + " = " + num);
                    flag = true;
                    break;
                }
            }
        }
        if(!flag)
            System.out.println("No number is found as the sum of the given number..");
    }
}
