import java.util.Arrays;

public class Assignment {
    public static void main(String[] args) {
        System.out.println("HelloWorld");

    }

    
    static int[] solution(int n) {
        int[] arr = new int[n];
        arr[0] = 0;

        for (int i = 0; i < n - 1; i++) {

            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] == arr[j]) {

                    arr[i + 1] = i - j;
                    break;
                }   
                // else {
                // //     arr[i + 1] = 0;
                // // }
            }            
        }
        return arr;
    }
}
