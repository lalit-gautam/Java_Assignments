package Practice_34_27_3_2023;

public class Program1 {
    public static void main(String[] args) {
        // program to compute the average value of an array of integers except the
        //
        int [] arr = {5, 7, 2, 4, 9};
        findAverage(arr);
    }

    public static void findAverage(int [] arr){
        int max = arr[0];
        int min = arr[0];

        float sum = arr[0];
        for(int i = 1; i < arr.length; i++){
            sum = sum + arr[i];
            if(arr[i] > max){
                max = arr[i];
            }else if(arr[i] < min){
                min = arr[i];
            }
        }
        float x = ((sum - max - min) / (arr.length - 2) );
        System.out.println("Average value except largest and smallest value : ");
        System.out.println(x);
    }
}
