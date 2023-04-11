package Assignment_11_04_2023;

public class ReverseStringUsingRecurssion {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','d','e'};
        System.out.println(arr);
        reverse(arr , 0, arr.length-1);
        System.out.println(arr);
    }
    public static void reverse(char[] arr , int start , int end){
        if(start>=end){
            return;
        }
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start+1, end-1);
    }
}
