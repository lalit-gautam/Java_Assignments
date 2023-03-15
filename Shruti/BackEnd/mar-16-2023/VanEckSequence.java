
public class VanEckSequence {
    public static void main(String[] args) {
        

    }
    void solution(int n){
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
            for (int j = i; j >= 0; j--) {
                if(arr[i] == arr[j]){
                    arr[i+1] = j;
                }
            }
        }
    }
}
