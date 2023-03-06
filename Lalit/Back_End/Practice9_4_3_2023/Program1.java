package Practice9_4_3_2023;

public class Program1 {
    public static void main(String [] args){

        int [] arr = {23, 7, 34, 2, 14, 9};
        printEvenNumbers(arr);
    }

    //1. program to print event numbers in an array
    public static void printEvenNumbers(int [] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] + "  ") ;
            }
        }
    }
}
