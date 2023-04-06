package Practice_33_26_3_2023;

public class Program1 {
    public static void main(String[] args) {

        // program to find the missing number in an array
        int [] arr = {1, 2, 3, 4, 6, 7};
        findMissingNumber(arr);
    }

    public static void findMissingNumber(int [] arr){

        int total_num = arr.length + 1;
        int expected_num_sum = total_num * ((total_num + 1) / 2);
        int num_sum = 0;
        for (int i: arr) {
            num_sum += i;
        }
        System.out.print( expected_num_sum - num_sum);
        System.out.print("\n");
    }
}
