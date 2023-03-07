package Practice10_5_3_2023;

public class Program1And2 {
    public static void main(String[] args) {

        int [] arr = {23, 4, 56, 23, 7};
        duplicateNumber(arr);

        String [] str = {"A", "B", "C", "D", "C"};
        duplicateStrings(str);
    }
    // program to find the duplicate number in the array
    public static void duplicateNumber(int [] arr){
        boolean flag = false;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]) {
                    flag = true;
                    System.out.println("Found Duplicate : " + arr[i]);
                }
            }
        }
        if(!flag)
            System.out.println("No Duplicates found the array");
    }

    // program to find the duplicates string in the array
    public static void duplicateStrings(String [] str){
        boolean flag = false;

        for(int i = 0; i < str.length; i++){
            for(int j = i + 1; j < str.length; j++){
                if(str[i].equals(str[j])){
                    flag = true;
                    System.out.println("Duplicate String found : " + str[i]);
                }
            }
        }
        if(!flag)
            System.out.println("No duplicates found ");
    }
}
