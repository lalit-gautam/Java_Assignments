
public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3 ,2, 5, 5};
        duplicates(arr);

    }
    static void duplicates(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
