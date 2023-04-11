package Assignment_11_04_2023;

public class CheckPalindromeUsingRecurssion {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','c','b','a'};
        
        System.out.println(reverse(arr , 0, arr.length-1));
        
    }
    public static boolean reverse(char[] arr , int start , int end){
        if(start>=end){
            return true;
        }
        if(arr[start] != arr[end]){
            return false;
        }
        return reverse(arr, start+1, end-1);
        
    }
}
