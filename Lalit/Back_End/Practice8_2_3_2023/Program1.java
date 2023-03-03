package Practice8_3_3_2023;

public class Program1 {
    public static void main(String[] args) {

        int [] arr = {23, 6, 7, 89};
        search(arr, 7);
        search(arr, 100);
    }

    public static void search(int[] arr, int element){
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == element){
                System.out.println("The element " + element + " found at index " + i);
                flag = true;
                break;
            }
        }

        if(!flag)
            System.out.println("The element " + element + " is not present in the array");
    }
}
