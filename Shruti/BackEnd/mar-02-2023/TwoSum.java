
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {2, 7, 11, 15, -6};
        int target = 9 ;
        solution(arr, target);

    }
    static void solution(int [] arr, int n){
        for (int i = 0; i < arr.length; i++) {
            int first = arr[i]; 

            for (int j = i + 1; j < arr.length; j++) {
            int second = arr[j];

                if(first + second == n){
                    System.out.println("[" + first + " , " + second + "]");
                }
            }
        }
    }
}
