// package PassTheGun;

import java.util.Arrays;


public class PassTheGun {
    public static void main(String[] args) {
        Integer[] arr = {0,1,2,3,4,5,6,7,8};
        Integer pointer = 1;
//        System.out.println(Arrays.toString(removeIndex(arr, 1)));
        System.out.println(findTheAliveNumber(arr , pointer));
    }
    public static int findTheAliveNumber(Integer[] arr , Integer pointer)
    {
        while(arr.length>1){
            if(arr.length<=pointer){
                pointer = pointer % arr.length;
            }
            arr = removeIndex(arr , pointer);
            pointer+=1;
            System.out.println(Arrays.toString(arr));
        }
        return arr[0];
    }
    public static Integer[] removeIndex(Integer[] arr , int index){
        Integer[] ans = new Integer[arr.length-1];
        for(int i=0;i<index;i++){
            ans[i] = arr[i];
        }
        for(int i=index+1 ; i<arr.length;i++){
            ans[i-1] = arr[i];
        }
        return ans;
    }

}
