package Practice25_18_3_2023;

public class Program2 {
    public static void main(String[] args) {

        // program to find the number that are larger than the given number
        int [] arr = {34, 6, 8, 98, 7, 63};
        largeNumber(arr, 40);
    }
    
    public static void largeNumber(int [] arr, int number){

        boolean flag = false;
        System.out.print("The number greater than " + number + " are : ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > number){
                System.out.print(arr[i] + ", ");
                flag = true;
            }
        }
        
        if(!flag){
            System.out.println("No number is Greater than the inserted number");
        }
    }
    
}
