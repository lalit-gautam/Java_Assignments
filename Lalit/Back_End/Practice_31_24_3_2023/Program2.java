package Practice_31_24_3_2023;

public class Program2 {
    public static void main(String[] args) {

        // program to copy all the elements of the array to another array.
        int [] arr = {46, 34, 2, 45, 89, 7};
        copyArray(arr);
    }

    public static void copyArray(int [] arr){

        int length = arr.length;

        int [] newArr = new int[arr.length];
        for(int i = 0; i < length; i++){
            newArr[i] = arr[i];
        }

        System.out.println("Elements of arr: ");
        for(int i = 0; i < length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("Elements of newArr : ");
        for(int i = 0; i < newArr.length; i++){
            System.out.println(newArr[i]);
        }
    }
}
