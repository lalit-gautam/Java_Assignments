package practice20_3_3_2023;


public class BinarySearch {
    public static void main(String[] args) {

        int [] arr = {23, 45, 7, 89, 9, 13};
        binarySearch(arr, 9);
        binarySearch(arr, 90);
    }

    public static void binarySearch(int [] arr, int search){

        int length_of_the_array = arr.length;
        int start_index = 0;
        int end_index = length_of_the_array - 1;
        int mid_index;
        boolean flag = false;

        while (start_index <= end_index){
            mid_index = (start_index + end_index)/2;

            if(arr[mid_index] == search){
                System.out.println(search + " element found at index : " + mid_index);
                flag = true;
                break;
            }

            if(arr[mid_index] > search){
                end_index = mid_index - 1;
            }

            if(arr[mid_index] < search){
                start_index = mid_index + 1;
            }

        }

        if(!flag)
            System.out.println(search + " element is not present in the array...");

    }
}
