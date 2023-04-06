package Practice_31_24_3_2023;

public class Program1 {
    public static void main(String[] args) {

        // program to find the 3rd largest number in an array
        int [] arr = {334, 5, 67, 78, 5};
        getThirdLargestNumber(arr);
    }

    public static void getThirdLargestNumber(int [] arr){

        int length = arr.length;
        for(int i = 0; i < length; i++){
            for(int j = i + 1; j < length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[length - 3]);
    }
}
